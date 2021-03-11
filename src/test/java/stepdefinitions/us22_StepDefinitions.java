package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.States;
import utilities.ConfigReader;
import utilities.ReadTxt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class us22_StepDefinitions {
    Response response;
    States states[];
    ArrayList<HashMap<String, Object>> StatesList;
    Map<Integer, String> expectedStatesList = new HashMap<>();
    Map<Integer, String> actualStatesList = new HashMap<>();


    @Given("send the request get the response using the end point {string}")
    public void send_the_request_get_the_response_using_the_end_point(String string) {
        response = given().accept(ContentType.JSON).
                headers("Authorization", "Bearer " + ConfigReader.getProperty("api_bearer_token")).
                when().get(string);
        response.prettyPrint();
    }

    @Given("converting response body JSON Data to JAVA Object")
    public void converting_response_body_JSON_Data_to_JAVA_Object() {
        StatesList = response.as(ArrayList.class);
        System.out.println(StatesList);
    }

    @And("storing all data to into file")
    public void storingAllDataToIntoFile() {
        expectedStatesList.put(59112, "Manisa");
        expectedStatesList.put(25398, "Koblenz");
        expectedStatesList.put(27508, "Virginia");
        expectedStatesList.put(21589, "Istanbul");
        expectedStatesList.put(25361, "FRANKFURT");
        System.out.println("expected data list " + expectedStatesList);
    }

    @Then("assert the states which are given as an example {string}")
    public void assertTheStatesWhichAreGivenAsAnExample(String expectedState) {
        System.out.println(expectedState);
        int c = 0;
        for (int i = 0; i < StatesList.size(); i++) {
            if (((Map) StatesList.get(i)).get("name").equals("Manisa")) {
                c++;
                Assert.assertTrue(true);
                break;
            }
        }
        if (c == 0) {
            Assert.assertTrue(false);

        }
    }

    @And("assert the states which are given as a file")
    public void assertTheStatesWhichAreGivenAsAFile() {
        List<States> expectedStateslist = ReadTxt.returnAllStates2("States.txt");
        System.out.println(expectedStateslist);
        Assert.assertTrue(ReadTxt.returnAllStates3("States.txt").contains("FRANKFURT"));

    }

    @Then("create the actual state list with using pojo classes")
    public void createTheActualStateListWithUsingPojoClasses() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        states = mapper.readValue(response.asString(), States[].class);

        for (int i = 0; i < states.length; i++) {
            actualStatesList.put(states[i].getId(), states[i].getName());
            //System.out.println(states[i].getName());
//            if(states[i].getId() == 44){
//                System.out.println("holaa" +states[i].getTpcountry().getName());
//                break;
//            }
        }
        System.out.println(actualStatesList);
    }

    @And("generate the expected data")
    public void generateTheExpectedData() {
        expectedStatesList.put(59112, "Manisa");
        expectedStatesList.put(25398, "Koblenz");
        expectedStatesList.put(27508, "Virginia");
        expectedStatesList.put(21589, "Istanbul");
        expectedStatesList.put(25361, "FRANKFURT");
        System.out.println("expected data list " + expectedStatesList);
    }

    @Then("assert the expected data with actual data")
    public void assertTheExpectedDataWithActualData() {
        for (int i = 0; i < expectedStatesList.size(); i++) {
            Assert.assertTrue(actualStatesList.containsValue(expectedStatesList.get(i)));
        }
//            "id": 44,
//                "name": "Ankara",
//                "tpcountry": {
//            "id": 1,
//                    "name": "Urfali",
//                    "states": null
    }
}

package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.States;
import utilities.ConfigReader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class us22_StepDefinitions {
    Response response;
    States states = new States();
    ArrayList<HashMap<String,Object>> StatesList ;

    @Given("send the request get the response using the end point {string}")
    public void send_the_request_get_the_response_using_the_end_point(String string) {
        response = given().accept(ContentType.JSON).
                headers("Authorization", "Bearer "+ ConfigReader.getProperty("api_bearer_token")).
                when().get(string);
        response.prettyPrint();
    }

    @Given("converting response body JSON Data to JAVA Object")
    public void converting_response_body_JSON_Data_to_JAVA_Object() {
        StatesList = response.as(ArrayList.class);
        System.out.println(StatesList);
    }


    @Then("user validates data for all states {string}")
    public void userValidatesDataForAllStates(String expectedState) {
        System.out.println(expectedState);
        int c=0;
        for (int i = 0; i < StatesList.size(); i++) {
           if(((Map)StatesList.get(i)).get("name").equals("New Hampshire")){
               c++;
               Assert.assertTrue(true);
               break;
           }
        }
        if(c==0){
            Assert.assertTrue(false);

        }

    }
}

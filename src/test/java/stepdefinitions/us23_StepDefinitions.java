package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.us23_Applicants;
import utilities.ConfigReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class us23_StepDefinitions {
    Response response;
    JsonPath jp;
    us23_Applicants[]applicants;


    @Given("User goes to the end point {string}")
    public void user_goes_to_the_end_point(String stringUrl) {

        response = given().accept(ContentType.JSON).contentType(ContentType.JSON)
                .headers("Authorization", "Bearer "+ ConfigReader.getProperty("api_bearer_token"))
                .when().get(stringUrl).then().contentType(ContentType.JSON)
                .extract().response();
        response.prettyPrint();

    }

    @Given("User is deserializing all data to Java")
    public void user_is_deserializing_all_data_to_Java() throws IOException {
        jp=response.jsonPath();
        ObjectMapper mapper = new ObjectMapper();

        applicants = mapper.readValue(response.asString(),us23_Applicants[].class);
        for(us23_Applicants each:applicants){
            System.out.println(each.getId());
            System.out.println(each.getSsn());
            System.out.println(each.getFirstName());
            System.out.println(each.getLastName());
            System.out.println(each.getAddress());
            System.out.println(each.getMobilePhoneNumber());
            System.out.println(each.getUserId());
            System.out.println(each.getUserName());
            System.out.println(each.getEmail());

        //    List<us23_Applicants>applicants = jp.getList("$",us23_Applicants.class);
         //   System.out.println(applicants.get(0).getFirstName());

        }


    }

    @Given("User reads all registrants data")
    public void user_reads_all_registrants_data() {
        jp=response.jsonPath();
        List<String>firstNamelist=jp.getList("firstName");
        System.out.println(firstNamelist);
        System.out.println(jp.getInt("userId[2]"));
        System.out.println(jp.getString("address[5]"));


        List<String>phoneNumbers = jp.getList("mobilePhoneNumber");
        System.out.println(phoneNumbers);
        System.out.println(jp.getString("userName[-1]"));


        List<Map<String,Object>>ssnList=jp.getList("ssn");
        System.out.println(ssnList);



    }

}

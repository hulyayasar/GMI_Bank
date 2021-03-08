package stepdefinitions;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import pojos.Country;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class us21_StepDefinitions {

    List<Map<String,Object>> listOfCountries;
    HashMap<String,Object> putCountry;
    Response response;
    Country expectedTestData = new Country();

    @Given("Get request from api {string} should turn a response")
    public void get_request_from_api_should_turn_a_response(String endPoint) {
        response = given().
                header("Authorization", "Bearer " + ConfigReader.getProperty("api_bearer_token")).
                accept("application/JSON").when().get(endPoint);
        response.prettyPrint();

    }

    @Given("json message is de-serializied by the system")
    public void json_message_is_de_serializied_by_the_system() {
        listOfCountries = response.as(ArrayList.class);
        System.out.println(listOfCountries);
    }

//    @Given("User sends put request id with the name {string} at the URI {string}")
//    public void user_sends_put_request_with_the_name_at_the_URI(String updCountryName, String endPoint) {
//
//        putCountry = new HashMap<>();
////        putCountry.put("id", 22320);
//        putCountry.put("name", updCountryName);
//        putCountry.put("states", null);
//        System.out.println(putCountry);
//
//        Response putResponse = given().
//                header("Authorization", "Bearer " + "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZWFtMzVnbWkiLCJhdXRoIjoiUk9MRV9FTVBMT1lFRSIsImV4cCI6MTYxNTE5MDczMX0.DViLQpWJZOagjj0kVn4u_fMA6kWRImCFlxh3MR8MgmLj3bZuyC_wyU30XaL-yvkLsLPQmrJ2lAl3PxT9yvZF7w").
//                body(putCountry).
//                accept("application/JSON").when().put(endPoint);
//
//        putResponse.prettyPrint();
//
//    }

}

package stepdefinitions;

import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;


public class us26_StepDefinitions {
    Response response;
    String updatedCountryName;
    @Given("US26 System should allow to update countries using api end point {string} {string} and its extension {string}")
    public void us26_System_should_allow_to_update_countries_using_api_end_point_and_its_extension(String endPoint, String name, String id) {
       Map <String, Object> putCountry = new HashMap<>();
       putCountry.put("id",id);
       putCountry.put("name",name);
       putCountry.put("states",null);

        response = given().
                headers("Authorization", "Bearer " + "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZWFtMzVnbWkiLCJhdXRoIjoiUk9MRV9FTVBMT1lFRSIsImV4cCI6MTYxNTE5MDczMX0.DViLQpWJZOagjj0kVn4u_fMA6kWRImCFlxh3MR8MgmLj3bZuyC_wyU30XaL-yvkLsLPQmrJ2lAl3PxT9yvZF7w",
                        "Content-Type",ContentType.JSON,
                        "Accept", ContentType.JSON).when().body(putCountry).put(endPoint).then().
                contentType(ContentType.JSON).extract().response();


        response.prettyPrint();
        JsonPath jsonPath = response.jsonPath();
        updatedCountryName = jsonPath.getString("name");
        System.out.println(updatedCountryName);
    }

    @Then("validate updated country")
    public void validate_updated_country() {
        response =  given().
                headers("Authorization", "Bearer " + "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZWFtMzVnbWkiLCJhdXRoIjoiUk9MRV9FTVBMT1lFRSIsImV4cCI6MTYxNTE5MDczMX0.DViLQpWJZOagjj0kVn4u_fMA6kWRImCFlxh3MR8MgmLj3bZuyC_wyU30XaL-yvkLsLPQmrJ2lAl3PxT9yvZF7w",
                        "Content-Type",ContentType.JSON,
                        "Accept", ContentType.JSON).when().get("https://www.gmibank.com/api/tp-countries").then().contentType(ContentType.JSON).extract().response();

    JsonPath jsonPath = response.jsonPath();
    String newName = jsonPath.getString("name");
    Assert.assertTrue("not match",newName.contains(updatedCountryName));
        System.out.println("Validation is succesfull");
    }
}

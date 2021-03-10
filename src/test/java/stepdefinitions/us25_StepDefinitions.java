package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import utilities.ConfigReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class us25_StepDefinitions {

    Response response;
    String createdCountryName;

    @Given("US25 System should allow to create new countries using api end point {string} {string}")
    public void us25_System_should_allow_to_create_new_countries_using_api_end_point_Freedom_and_its_extension(String endPoint, String name) {
        Map<String, Object> postCountry = new HashMap<>();
        //postCountry.put("id",id);
        postCountry.put("name",name);
        postCountry.put("states",null);

        response = given().
                headers("Authorization", "Bearer " +  ConfigReader.getProperty("api_bearer_token"),
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON).when().body(postCountry).post(endPoint).then().
                contentType(ContentType.JSON).extract().response();


        response.prettyPrint();
        JsonPath jsonPath = response.jsonPath();
        createdCountryName = jsonPath.getString("name");
        System.out.println(createdCountryName);
    }

    @Then("validate created country")
    public void validate_created_country() {

        response =  given().
                headers("Authorization", "Bearer " +   ConfigReader.getProperty("api_bearer_token"),
                        "Content-Type",ContentType.JSON,
                        "Accept", ContentType.JSON).when().get("https://www.gmibank.com/api/tp-countries").then().contentType(ContentType.JSON).extract().response();

        JsonPath jsonPath = response.jsonPath();
        String newName = jsonPath.getString("name");
        Assert.assertTrue("not match",newName.contains(createdCountryName));
        System.out.println("Validation is succesfull");

    }

}

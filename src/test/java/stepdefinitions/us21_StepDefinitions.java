package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Country;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class us21_StepDefinitions {

    List<Map<String, Object>> listOfCountries;
    HashMap<String, Object> putCountry;
    Response response;
    Country expectedTestData = new Country();

    @Given("Get request from api {string} should turn a response")
    public void get_request_from_api_should_turn_a_response(String endPoint) {
        response = given().
                header("Authorization", "Bearer " + ConfigReader.getProperty("api_bearer_token")).
                accept("application/JSON").when().get(endPoint);
        //response.prettyPrint();

    }

    @And("json message is deserialized by the system")
    public void jsonMessageIsDeserializedByTheSystem() {
        listOfCountries = response.as(ArrayList.class);
    }


    @And("get the information of {int}th country")
    public void getTheInformationOfThCountry(int country) {
        System.out.println(listOfCountries.get(country));
        ;
    }


    @Then("verify the name of the {int}th country is {string}")
    public void verifyTheNameOfTheThCountryIs(int country, String countryName) {
        Assert.assertEquals(listOfCountries.get(country).get("name"), countryName);
    }

    @And("get the information of the country with {string} id")
    public void getTheInformationOfTheCountryWithId(String id) {

        int count = 0;
        for (int i = 0; i <= listOfCountries.size() - 1; i++) {
            if (listOfCountries.get(i).get("id").toString().equals(id) ) {
                count++;
            }
        }
        Assert.assertTrue(count==1);
    }
}

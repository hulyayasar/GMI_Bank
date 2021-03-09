package stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;

import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Customer;
import pojos.States;
import pojos.us23_Applicants;
import utilities.ConfigReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class Customer_StepDefinitions {
    Response response;
    String filePath=ConfigReader.getProperty("filePathCustomer");
    List<Map<String, Object>> CustomerList;
    Customer[] customers;

    @Given("user go to api end point {string}")
    public void user_go_to_api_end_point(String url) {

         response=given().headers("Authorization",
         "Bearer " + ConfigReader.getProperty("api_bearer_token"),
        "Content-Type", ContentType.JSON,
        "Accepct",ContentType.JSON).when()
        .get(url)
        .then()
        .contentType(ContentType.JSON)
        .statusCode(200)
        .extract()
        .response();

        response.prettyPrint();

    }

    @Given("read all customer and set create pojo classes")
    public void read_all_customer_and_set_create_pojo_classes() throws IOException {

       CustomerList = response.as(ArrayList.class);
        System.out.println(CustomerList);
    }
        @Then("validates the data")
    public void validates_the_data() {
           String expectedName="Jeffrey";
           Assert.assertEquals((Map)(CustomerList.get(0)).get(1),expectedName);
            System.out.println((Map)(CustomerList.get(0)).get(1));

            String expectedssn="476-90-9374";
            Assert.assertEquals((Map)(CustomerList.get(0)).get(1),expectedssn);
            System.out.println((Map)(CustomerList.get(0)).get(1));


           Map<String,Object> expectedCountry=new HashMap<>();
           expectedCountry.put("id",22330);
           expectedCountry.put("name","Russland");
           States states=new States();
            expectedCountry.put("states",states);
            Assert.assertEquals((Map)(CustomerList.get(1)).get(14),expectedCountry);

            String expectedState="California";
            Assert.assertEquals((Map)(CustomerList.get(7)).get(15),expectedCountry);

            Map<String,Object> expectedUser=new HashMap<>();
            expectedUser.put("id",85376);
            expectedUser.put("login","dt36");
            expectedUser.put("firstName","Demo");
            expectedUser.put("lastName","Team30");
            expectedUser.put("email","demot36@gmail.com");
            expectedUser.put("activated",true);
            expectedUser.put("langKey","en");

            Assert.assertEquals((Map)(CustomerList.get(6)).get(16),expectedUser);

            us23_Applicants us23_applicants=new us23_Applicants();
            Assert.assertEquals((Map)(CustomerList.get(0)).get(17),us23_applicants);



        }

    }



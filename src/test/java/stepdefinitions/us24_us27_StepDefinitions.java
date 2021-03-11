package stepdefinitions;

import JsonStates.StateJson;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class us24_us27_StepDefinitions {


    Response response;
    States[] states;
    ArrayList listOfStates;
    String filePath = "States.txt";
    int deletedID;

    @Given("user sets states to response using {string}")
    public void user_sets_states_to_response_using(String url) {

        response =given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("api_bearer_token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        //response.prettyPrint();
    }

    @Given("user deserializes all states to pojo")
    public void user_deserializes_all_states_to_pojo() throws Exception{
        ObjectMapper obj = new ObjectMapper();
        states = obj.readValue(response.asString(),States[].class);
        System.out.println("New Created State: " + states[0].getName());
//        System.out.println(Arrays.toString(states));
//        listOfStates = response.as(ArrayList.class);
//        System.out.println("here" + listOfStates);

    }

    @Given("user generates all states' data in correspondent files")
    public void user_generates_all_states_data_in_correspondent_files() {

//        WriteToTxt.saveAllStates2(filePath,states);

    }




    @Given("user creates a new state using {string}")
    public void user_creates_a_new_state_using(String endPoint) {

        response = given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("api_bearer_token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when().body(StateJson.CREATE_STATE)
                .post(endPoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

    }



    @Given("user provides api end point to delete states using {string} and its extension {string}")
    public void user_provides_api_end_point_to_delete_states_using_and_its_extension(String endPoint, String id) {
        System.out.println(endPoint+"/"+id);
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("api_bearer_token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when().body(StateJson.CREATE_STATE)
                .delete(endPoint+ "/"+id)
                .then()
                .extract()
                .response();
    }


    @And("user deletes the created state")
    public void userDeletesTheCreatedState() {
            int count = 0;

            for (int i = 0; i <= states.length-1 ; i++) {
                //System.out.println("here");
                //System.out.println(states.length);//1312
                if (!states[i].getName().equals("Alaska") ) {
                    System.out.println(states[i].getName());
                   deletedID = states[i].getId();
                    count++;
                    System.out.println(count + " " + deletedID);
                    break;
                }
            }
         //   Assert.assertTrue(count==1);
        }

}



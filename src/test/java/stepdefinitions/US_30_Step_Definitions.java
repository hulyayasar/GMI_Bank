package stepdefinitions;

import utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import pojos.US_30_Pojo;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import utilities.PDFGenerator;

import java.io.IOException;
import java.util.List;

public class US_30_Step_Definitions {
    Response response;


    @Given("send a GET request to REST API end point {string}")
    public void send_A_GET_Request_To_REST_API_EndPoint(String endpoint) {
        response = given().
                accept(ContentType.JSON).
                auth().oauth2(ConfigReader.getProperty("api_bearer_token")).
                when().
                get(endpoint);
        response.prettyPrint();
    }

    @Given("HTTP Status Code should be {int} and contentType should be JSON")
    public void http_Status_Code_should_be_and_contentType_should_be_JSON(Integer statusCode) {
        response.then().
                assertThat().
                statusCode(statusCode).
                contentType(ContentType.JSON);
        System.out.println("status code and data");

    }

    @Then("all users' info as Name, last name and role should had on a pdf document")
    public void all_users_info_as_Name_last_name_and_role_should_had_on_a_pdf_document() {
        ObjectMapper objectMapper = new ObjectMapper();
        List<US_30_Pojo> allUserPojoList = null;
        try {
            allUserPojoList = objectMapper.readValue(response.asString(), new TypeReference<List<US_30_Pojo>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(allUserPojoList);
        PDFGenerator.createTableWithPojo("user_name_role.pdf", allUserPojoList);
    }


}

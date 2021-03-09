package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;
import io.restassured.response.Response;
import pojos.Customer;
import utilities.ConfigReader;

import static io.restassured.RestAssured.*;
//import utilities.ConfigurationReader;
public class Customer_StepDefinitions {
    Response response;
    //String filePath=ConfigReader.getProperty("filePathCustomer");
    //String bearerToken= ConfigReader.getProperty("api_bearer_token");
    //Customer[] customers;

    @Given("user go to api end point {string}")
    public void user_go_to_api_end_point(String string) {

        // Response response=given().headers("Authorization",
        // "Bearer " + ConfigurationReader.getProperty("api_bearer_token"),
        //"Content-Type", ContentType.JSON,
        //"Accepct",ContentType.JSON).when()
        //.get(url)
        //.then()
        //.contentType(ContentType.JSON)
        //.statusCode(200)
        //.extract()
        //.response();

        //response.prettyPrint();

    }

    @Given("read all customer and set create pojo classes")
    public void read_all_customer_and_set_create_pojo_classes() {
        // ObjectMapper objectMapper=new ObjectMapper();
        // Customer [] customer=objectMapper.readValue(response.asString(),Customer[].class);//need to throws exception

        //System.out.println(customer[10].getId());
        //System.out.println(customer[11].getFirstName());
        //System.out.println(customer[12].getLastName());
        //System.out.println(customer[13].getMiddleInitial());
        //System.out.println(customer[14].getEmail());
        //System.out.println(customer[15].getMobilePhoneNumber());
        //System.out.println(customer[16].getPhoneNumber());zipCode,Address,City
        //System.out.println(customer[17].getZipCode());
        //System.out.println(customer[18].getAddress());
        //System.out.println(customer[19].getCity());
        //System.out.println(customer[19].getSsn());
        //System.out.println(customer[19].getCreateDate());
        //System.out.println(customer[19].getZelleEnrolled());
        //System.out.println(customer[19].getCountry());
        //System.out.println(customer[19].getState());
        //System.out.println(customer[19].getUser());




        // for(int i=0; i<customer.lenght; i++){
        // System.out.println(customer[i].getCustomer);

    }
        //for(int i=0; i<customer.lenght; i++){
//}
        //if(customer[0].getUser!=null){
           //System.out.println(customer[i]);

        //}
    //}
                //sets the data and saves
        //WriteToTxt.saveDataInFileWithAllCustomerInfo(ConfigurationReader.getProperty("filePath_All_Customer_Data"),customers);
//        WriteToTxt.saveDataInFile("NewFile.txt ",customers);
//    }

    @Then("validates the data")
    public void validates_the_data() {

        //       List<Customer> list= ReadTxt.returnCustomerSNN("filepath");
        //
        //       for(int i=0;i<list.size();i++){
        //           System.out.println(list.get(i).getSsn());
        //       }
        //       boolean isdisplayed=list.contains("888-22-4444");
        //       Assert.assertTrue(isdisplayed);

        //       Second way of doing it
        //List<String>expectedSSN=new ArrayList<>();
        //expectedSSN.add("");

        //List<String>actualSSN=ReadTxt.returnCustomerSNN("filepath2");
        //assert.assertTrue("The data provided is not matching!!!,actualSSN.containsAll(expectedSSN));
    }

}
//config e eklenicekler ve bunlar nerden geliyor?
//filePath_Customer=
//filePath_Customer2=
//fileNameOfCustomer=
//\src\test\resources
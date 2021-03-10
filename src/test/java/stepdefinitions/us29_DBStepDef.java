package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.DBUtils;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.sql.*;
import java.util.List;

public class us29_DBStepDef extends DBUtils{

    List<Object> strList;


    @Given("User creates a conneciton with db using {string} , {string} and {string}\"")
    public void user_creates_a_conneciton_with_db_using_and(String url, String userName, String passWord) throws Exception {

        DBUtils.createConnection();
    }


    @Given("user provides the query as {string} and {string}")
    public void user_provides_the_query_as_and(String query, String columnName) {

        strList = DBUtils.getColumnData(query,columnName);
        //Burada Lambda ile stringe çevirip yazdırma işlemi yapılmıştır, yalnız map faonksiyonu listin
        //içini güncelleyemeyeceği için assert aşamasın çok efektif olmaz.
        //strList.stream().sorted().map(Object::toString).forEach(t-> System.out.println(t + " "));
        //strList.stream().sorted().map(String::valueOf).filter(t->t.length()>9).forEach(System.out::println);
        strList.toString();
       // System.out.println(strList);
    }
    @Then("user validates all db data")
    public void user_validates_all_db_data() {

        Assert.assertTrue("This is not contains",strList.contains("001-23-0840"));

    }

    @Given("user provides the query as the other {string} and {string}")
    public void user_provides_the_query_as_the_other_and(String query, String columnName) {

        strList = DBUtils.getColumnData(query,columnName);
      //  strList.stream().sorted().map(Object::toString).forEach(t-> System.out.println(t + " "));
       // System.out.println("dsfsdfsdsdfsdsdfsdfsdfsdf");
        strList.toString();
        System.out.println(strList);
    }

    @Then("user validates all country")
    public void user_validates_all_country() {
        Assert.assertTrue("This is not contains",strList.contains("KENYA"));
    }



}

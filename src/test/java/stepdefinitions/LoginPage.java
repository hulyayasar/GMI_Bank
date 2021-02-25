package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Loginpage;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginPage {
    Loginpage loginpage=new Loginpage();

    @Given("user navigate the url")
    public void user_navigate_the_url() {
       Driver.getDriver().get(ConfigReader.getProperty("url"));



    }

    @Given("click Sing in button")
    public void click_Sing_in_button() {


        loginpage.selectSingin.click();
        loginpage.Sing_in.click();

    }

    @Given("enter valid credentials")
    public void enter_valid_credentials() {
     loginpage.userName.sendKeys(ConfigReader.getProperty("employeeUsername"));
     loginpage.password.sendKeys(ConfigReader.getProperty("employeePassword"));

    }

    @Then("click for  Sing in button")
    public void click_for_Sing_in_button() {
 loginpage.SinginButton.click();
    }







}

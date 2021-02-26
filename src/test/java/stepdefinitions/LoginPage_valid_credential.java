package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.AfterLogin;
import pages.Loginpage;
import utilities.ConfigReader;
import utilities.Driver;

public class LoginPage_valid_credential {
    Loginpage loginpage=new Loginpage();
    AfterLogin afterLogin= new AfterLogin();

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
     loginpage.userName.sendKeys(ConfigReader.getProperty("username"));
     loginpage.password.sendKeys(ConfigReader.getProperty("password"));

    }

    @Then("click for  Sing in button")
    public void click_for_Sing_in_button() {
     loginpage.SinginButton.click();

    }
    @Then("verify log in the personal page")
    public void verify_log_in_the_personal_page() {

        Assert.assertTrue(afterLogin.myOperations.getText().equals("My Operations"));

    }
    @Then("click cencel button")
    public void click_cencel_button() {
       loginpage.CancelButton.click();
    }







}

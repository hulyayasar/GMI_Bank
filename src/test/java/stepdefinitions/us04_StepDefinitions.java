package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import pages.AfterLogInPage;


import pages.LogInPage;
import utilities.ConfigReader;
import utilities.Driver;

public class us04_StepDefinitions {
    LogInPage loginpage=new LogInPage();
    AfterLogInPage afterLoginPage = new AfterLogInPage();

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

    @Given("enter admin valid credentials")
    public void enter_admin_valid_credentials() {
        loginpage.userName.sendKeys(ConfigReader.getProperty("adminUsername"));
        loginpage.password.sendKeys(ConfigReader.getProperty("adminPassword"));
    }

    @Then("click for  Sing in button")
    public void click_for_Sing_in_button() {
        loginpage.SinginButton.click();

    }
    @Then("verify log in the personal page")
    public void verify_log_in_the_personal_page() {

        Assert.assertTrue(afterLoginPage.myOperations.getText().equals("My Operations"));

    }
    @Then("click cencel button")
    public void click_cencel_button() {
        loginpage.CancelButton.click();
    }







}
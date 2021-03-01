package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class us01_StepDefinitions {

    RegistrationPage registrationPage = new RegistrationPage();

    @Given("user is on registration page")
    public void user_is_on_registration_page() {
        Driver.getDriver().get(ConfigReader.getProperty("registration_url"));
    }

    @Given("user writes SSN number using {string}")
    public void user_writes_SSN_number_using(String string) {
       registrationPage.ssn.sendKeys(string);
    }

    @When("user writes firstname {string}")
    public void user_writes_firstname(String string) {
       registrationPage.firstname.sendKeys(string);
    }

    @When("user writes surname {string}")
    public void user_writes_surname(String string) {
       registrationPage.lastname.sendKeys(string);
    }

    @Then("user writes address {string}")
    public void user_writes_address(String string) {
       registrationPage.address.sendKeys(string);
    }

    @Then("user writes mobilephone {string}")
    public void user_writes_mobilephone(String string) {
       registrationPage.mobilephone.sendKeys(string);
    }

    @Then("user writes username {string}")
    public void user_writes_username(String string) {
       registrationPage.username.sendKeys(string);
    }

    @Then("user writes email {string}")
    public void user_writes_email(String string) {
      registrationPage.email.sendKeys(string);
    }


}

package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.US_09Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_009StepDefinition {
    US_09Pages us_09Pages=new US_09Pages();
    @Given("user enters gmibank homepage")
    public void user_enters_gmibank_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Then("user clicks userEntry icon")
    public void user_clicks_userEntry_icon() {
        us_09Pages.userIcon.click();
    }

    @Then("user clicks signIn link")
    public void user_clicks_signIn_link() {
        us_09Pages.signIn.click();
    }

    @Then("user enters  username")
    public void user_enters_username() {
        us_09Pages.username.sendKeys("thebestemployee");
    }

    @Then("user enters password")
    public void user_enters_password() {
        us_09Pages.password.sendKeys("thebestemployee");
    }

    @Then("user clicks signIn button")
    public void user_clicks_signIn_button() {
        us_09Pages.signInButton.click();
    }

    @Then("user clicks myOperations")
    public void user_clicks_myOperations() {
        us_09Pages.myOperations.click();
    }

    @Then("user clicks manageCustomers")
    public void user_clicks_manageCustomers() {
        us_09Pages.manageCustomers.click();
    }

    @Then("user clicks createNewCustomer")
    public void user_clicks_createNewCustomer() {
        us_09Pages.createANewCustomer.click();
    }

    @Then("user enters ssn {string}")
    public void user_enters_ssn(String str) {
        us_09Pages.searchCustomer.sendKeys(str);
        ReusableMethods.waitFor(2);
    }
    @Then("clicks on searchBox")
    public void clicks_on_searchBox() {
        ReusableMethods.waitFor(3);
        us_09Pages.searchButton.click();

    }


}

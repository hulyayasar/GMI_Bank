package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.CreateNewCustomerPage;
import utilities.ReusableMethods;

public class us09_StepDefinitions {
    CreateNewCustomerPage createNewCustomerPage = new CreateNewCustomerPage();


    @Then("user clicks createNewCustomer")
    public void user_clicks_createNewCustomer() {
        createNewCustomerPage.createANewCustomer.click();
    }


    @Then("user enters ssn {string}")
    public void user_enters_ssn(String str) {
        createNewCustomerPage.searchCustomer.sendKeys(str);
        ReusableMethods.waitFor(2);
    }
    @Then("clicks on searchBox")
    public void clicks_on_searchBox() {
        ReusableMethods.waitFor(3);
        createNewCustomerPage.searchButton.click();

    }

}

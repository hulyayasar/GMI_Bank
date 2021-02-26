package stepdefinitions;


import io.cucumber.java.en.Then;
import pages.US_09Pages;
import utilities.ReusableMethods;


public class US_009StepDefinition {
US_09Pages us_09Pages=new US_09Pages();

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

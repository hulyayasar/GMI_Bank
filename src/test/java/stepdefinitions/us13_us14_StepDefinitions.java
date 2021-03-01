package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.AfterLogInPage;
import pages.CreateNewAccountPage;

import utilities.ReusableMethods;

public class us13_us14_StepDefinitions {

    CreateNewAccountPage gmiCreateNewAccountPage = new CreateNewAccountPage();
    AfterLogInPage gmiAfterLogInPagePage = new AfterLogInPage();

    @When("user clicks on Manage Account")
    public void user_clicks_on_Manage_Account() {
        gmiAfterLogInPagePage.manageAccounts.click();
    }

    @When("user clicks on Create a new Account")
    public void user_clicks_on_Create_a_new_Account() {
        gmiCreateNewAccountPage.createANewAccount.click();
    }

    @When("user enters description {string}")
    public void user_enters_description(String string) {
        // ReusableMethods.waitForVisibility(gmiCreateNewAccountPage.description, 3);
        gmiCreateNewAccountPage.description.sendKeys(string);
    }

    @When("user enters balance {string}")
    public void user_enters_balance(String string) {
        //  ReusableMethods.waitForVisibility(gmiCreateNewAccountPage.description, 3);
        gmiCreateNewAccountPage.balance.sendKeys(string);
    }

    @When("user selects account type {string}")
    public void user_selects_account_type(String string) {
        Select accountType = new Select(gmiCreateNewAccountPage.accountType);
        accountType.selectByValue(string);
    }

    @When("user selects account status type {string}")
    public void user_selects_account_status_type(String string) {
        Select accountStatusType = new Select(gmiCreateNewAccountPage.accountStatusType);
        accountStatusType.selectByValue(string);
    }

    @When("user selects account employee")
    public void user_selects_account_employee() {
        Select accountEmployee = new Select(gmiCreateNewAccountPage.accountEmployee);
        accountEmployee.selectByVisibleText("");
    }

    @When("user enters Create Date for past")
    public void user_enters_Create_Date_for_past() {
        gmiCreateNewAccountPage.createDate.sendKeys("01.01.2021" + Keys.TAB + "02:02");
    }

    @When("user enters Create Date for future")
    public void user_enters_Create_Date_for_future() {
        gmiCreateNewAccountPage.createDate.sendKeys("05.05.2022" + Keys.TAB + "05:05");
    }

    @When("user enters Create Date for present")
    public void user_enters_Create_Date_for_present() {
        gmiCreateNewAccountPage.createDate.sendKeys("02.02.2021" + Keys.TAB + "04:57");
    }

    @When("user enters Closed Date earlier than Create Date")
    public void user_enters_Closed_Date_earlier_than_Create_Date() {
        gmiCreateNewAccountPage.closedDate.sendKeys("01.01.2021" + Keys.TAB + "04:57");
    }

    @Then("verify the description required message")
    public void verify_the_description_required_message() {
        Assert.assertTrue(gmiCreateNewAccountPage.descRequired.isDisplayed());
    }

    @Then("verify the balance required message")
    public void verify_the_balance_required_message() {
        Assert.assertTrue(gmiCreateNewAccountPage.balRequired.isDisplayed());
    }

    @Then("verify the account type is selected as {string}")
    public void verify_the_account_type_is_selected_as(String string) {
        String actAccountType = gmiCreateNewAccountPage.accountType.getAttribute("value");
        Assert.assertTrue(actAccountType.equals(string));
    }

    @Then("verify the account status type is selected as {string}")
    public void verify_the_account_status_type_is_selected_as(String string) {
        String actAccountStatusType = gmiCreateNewAccountPage.accountStatusType.getAttribute("value");
        Assert.assertTrue(actAccountStatusType.equals(string));
    }

    @Then("verify account employee is selected")
    public void verify_account_employee_is_selected() {
        String actAccEmployee = gmiCreateNewAccountPage.accountEmployee.getAttribute("value");
        Assert.assertTrue(actAccEmployee.equals(""));
    }

    @Then("verify the date for past")
    public void verify_the_date_for_past() {
        String actCreateDate = gmiCreateNewAccountPage.createDate.getAttribute("value");
        Assert.assertTrue(actCreateDate.equals("2021-01-01T02:02"));
    }

    @Then("verify the date for future")
    public void verify_the_date_for_future() {
        String actCreateDate = gmiCreateNewAccountPage.createDate.getAttribute("value");
        Assert.assertTrue(actCreateDate.equals("2022-05-05T05:05"));
    }

    @Then("verify the Closed Date")
    public void verify_the_Closed_Date() {
        String actClosedDate = gmiCreateNewAccountPage.closedDate.getAttribute("value");
        Assert.assertTrue(actClosedDate.equals("2021-01-01T04:57"));
    }

    @Then("verify the present date")
    public void verify_the_present_date() {
        String actClosedDate = gmiCreateNewAccountPage.createDate.getAttribute("value");
        Assert.assertTrue(actClosedDate.equals("2021-02-02T04:57"));
    }

    @When("user clicks on the save button")
    public void userClicksOnTheSaveButton() {
        gmiCreateNewAccountPage.saveButton.click();
    }

    @Then("user selects last created account")
    public void userSelectsLastCreatedAccount() {
        ReusableMethods.waitForPageToLoad(30);
        String lastCreatedAccount = gmiCreateNewAccountPage.accountList.get(gmiCreateNewAccountPage.accountList.size()-1).getText();
        System.out.println(lastCreatedAccount);
        Assert.assertTrue(lastCreatedAccount.equals("captain85"));

    }


}
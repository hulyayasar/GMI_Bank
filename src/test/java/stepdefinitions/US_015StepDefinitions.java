package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import pages.AfterLogin;
import pages.Loginpage;
import pages.US_015Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US_015StepDefinitions {
    US_015Pages us_015Pages = new US_015Pages();
    AfterLogin afterLogin=new AfterLogin();
    Loginpage loginpage=new Loginpage();

    @Then("provide valid username and password")
    public void provide_valid_username_and_password() {
        ReusableMethods.waitFor(2);
       // Driver.getDriver().get(ConfigReader.getProperty("customerUsername"));
       // Driver.getDriver().get(ConfigReader.getProperty("customerPassword"));
      loginpage.userName.sendKeys(ConfigReader.getProperty("sndCustomerUsername"));
        loginpage.password.sendKeys(ConfigReader.getProperty("sndCustomerPassword"));
    }



    @Then("click on My Accounts")
    public void click_on_My_Accounts() {
        ReusableMethods.waitFor(2);
        afterLogin.myAccounts.click();

    }



    @Then("click on Transfer money")
    public void click_on_Transfer_money() {
     afterLogin.transferMoney.click();
    }

    @Then("clicks on from gives account to transfer")
    public void clicks_on_from_gives_account_to_transfer() {
    us_015Pages.fromBox.click();
    }

    @Then("clicks on to choose the account to transfer")
    public void clicks_on_to_choose_the_account_to_transfer() {
    us_015Pages.toBox.click();
    }

    @Then("Clicks on balance and gives amount to transfer")
    public void clicks_on_balance_and_gives_amount_to_transfer() {
       us_015Pages.balanceBox.sendKeys("5");
    }



    @Then("clicks on make a transfer")
    public void clicks_on_make_a_transfer() {
    us_015Pages.transferButton.click();
    }

    @Then("click on view transaction")
    public void click_on_view_transaction() {
    us_015Pages.viewTransaction.click();
    }
    @Then("verify user have at least {int} accounts")
    public void verify_user_have_at_least_accounts(Integer int1) {
        ReusableMethods.waitForVisibility(us_015Pages.fromBox,2);
        Select select=new Select(us_015Pages.fromBox);
       List<WebElement> list=select.getOptions();
       for (WebElement List : list) {
            String gettext = List.getText();
            System.out.println(gettext);
        }

    }



    @Then("clicks on description {string}")
    public void clicks_on_description(String string) {
        us_015Pages.description.sendKeys(string);
    }
// Select select=new Select(moneyTransferPage.fromBox);
//        List<WebElement> list=select.getOptions();
//        for (WebElement List : list) {
//            String gettext = List.getText();
//            System.out.println(gettext);
//        }
//@Given("user enters gmibank homepage")
//public void user_enters_gmibank_homepage() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//    @Then("user clicks userEntry icon")
//    public void user_clicks_userEntry_icon() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("user clicks signIn link")
//    public void user_clicks_signIn_link() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("user enters  username")
//    public void user_enters_username() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("user enters password")
//    public void user_enters_password() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("user clicks signIn button")
//    public void user_clicks_signIn_button() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("user clicks myOperations")
//    public void user_clicks_myOperations() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }



}

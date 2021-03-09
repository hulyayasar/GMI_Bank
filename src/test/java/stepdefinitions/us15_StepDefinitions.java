package stepdefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;
import pages.AfterLogInPage;
import pages.LogInPage;
import pages.CustomerAccountsPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class us15_StepDefinitions {
    CustomerAccountsPage customerAccountsPage = new CustomerAccountsPage();
    AfterLogInPage afterLoginPage =new AfterLogInPage();
    LogInPage loginpage=new LogInPage();

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
        //ReusableMethods.waitFor(2);
        afterLoginPage.myAccounts.click();

    }



    @Then("click on Transfer money")
    public void click_on_Transfer_money() {
     afterLoginPage.transferMoney.click();
    }

    @Then("clicks on from gives account to transfer")
    public void clicks_on_from_gives_account_to_transfer() {

        customerAccountsPage.fromBox.click();
    }

    @Then("clicks on to choose the account to transfer")
    public void clicks_on_to_choose_the_account_to_transfer() {

        customerAccountsPage.toBox.click();
        }

    @Then("Clicks on balance and gives amount to transfer")
    public void clicks_on_balance_and_gives_amount_to_transfer() {
       customerAccountsPage.balanceBox.sendKeys("5");
    }

    @Then("clicks on make a transfer")
    public void clicks_on_make_a_transfer() {
    customerAccountsPage.transferButton.click();
    }
    @Then("click on view transaction")
    public void click_on_view_transaction() {

        customerAccountsPage.viewTransaction.click();
    }
    @Then("verify user have at least {int} accounts")
    public void verify_user_have_at_least_accounts(Integer int1) {
        ReusableMethods.waitForVisibility(customerAccountsPage.fromBox,2);
        Select select=new Select(customerAccountsPage.fromBox);
        //select.getFirstSelectedOption();
       List<WebElement> list=select.getOptions();
       for (WebElement List : list) {
            String gettext = List.getText();
            System.out.println(gettext);
        }

    }



    @Then("clicks on description {string}")
    public void clicks_on_description(String string) {
        customerAccountsPage.description.sendKeys(string);

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

//<select name="fromAccountId" required="" id="fromAccountId" class="form-control is-touched is-pristine av-invalid is-invalid form-control"><option value=""></option><option value="76551">INVESTING-76551-17$</option><option value="75476">CHECKING-75476-14$</option><option value="75477">SAVING-75477-14$</option></select>

}

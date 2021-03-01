package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LogInPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

import static utilities.ReusableMethods.waitForVisibility;

public class us05_StepDefinitions {
    LogInPage loginPage = new LogInPage();

    @Given("User is on the main page")
    public void user_is_on_the_main_page() {

        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Given("click on person sign")
    public void click_on_person_sign() {

        loginPage.selectSingin.click();
    }

    @Given("click on sign in option")
    public void click_on_sign_in_option() {

        loginPage.Sing_in.click();
    }

    @When("user enters the username {string}")
    public void user_enters_the_username(String string) {

        loginPage.userName.sendKeys(string);
    }

    @When("user enters the password {string}")
    public void user_enters_the_password(String string) {

        loginPage.password.sendKeys(string);
    }

    @When("click on the submit button")
    public void click_on_the_submit_button() {

      loginPage.SinginButton.click();
    }

    @Then("verify the error message contains {string}")
    public void verify_the_error_message_contains(String string) throws InterruptedException {
        Thread.sleep(15);
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        waitForVisibility(loginPage.failedToSignIn,10);
        String message = loginPage.failedToSignIn.getText();
        System.out.println(message);
        Assert.assertTrue(message.contains(string));
    }

    @Then("verify the error message empty contains {string}")
    public void verifyTheErrorMessageEmptyContains(String string) throws InterruptedException {
        Thread.sleep(10);
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        waitForVisibility(loginPage.emptyError,10);
        String message = loginPage.emptyError.getText();
        Assert.assertTrue(loginPage.emptyError.isDisplayed());
        System.out.println(message);
        Assert.assertTrue(message.contains(string));
    }
    @Then("verify the error message empty contains second {string}")
    public void verifyTheErrorMessageEmptyContainsSecond(String string) throws InterruptedException {
        Thread.sleep(10);
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        waitForVisibility(loginPage.emptyErrorSecond,10);
        String message = loginPage.emptyErrorSecond.getText();
        Assert.assertTrue(loginPage.emptyErrorSecond.isDisplayed());
        System.out.println(message);
        Assert.assertTrue(message.contains(string));
    }
    @When("click on the reset option")
    public void click_on_the_reset_option() {
       loginPage.resetPassword.click();
    }
    @Then("verify the resetPassword title is {string}")
    public void verify_the_resetPassword_title_is(String string) {
        String resetTittle = loginPage.resetTitle.getText();
        System.out.println(resetTittle);
        Assert.assertEquals(resetTittle,string);

    }

    @When("click on the register a new account option")
    public void click_on_the_register_a_new_account_option() {
       loginPage.RegisterANewAccount.click();
    }
    @Then("verify the RegisterANewAccount title is {string}")
    public void verify_the_RegisterANewAccount_title_is(String string) {
        String registrationTitle = loginPage.registrationTitle.getText();
        System.out.println(registrationTitle);
        Assert.assertEquals(registrationTitle,string);
    }


}

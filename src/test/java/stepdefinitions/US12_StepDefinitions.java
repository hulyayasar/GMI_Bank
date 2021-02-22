package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AfterLogin;
import pages.ManageCustomers;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US12_StepDefinitions {

    AfterLogin afterLogin = new AfterLogin();
    ManageCustomers manageCustomers = new ManageCustomers();
    String firstIDOnThePageL;

    @Given("User goes to the home page and log in")
    public void user_goes_to_the_home_page_and_log_in() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        WebElement userIcon = Driver.getDriver().findElement(By.id("account-menu"));
        userIcon.click();
        ReusableMethods.waitFor(2);

        WebElement signIn = Driver.getDriver().findElement(By.linkText("Sign in"));
        signIn.click();
        ReusableMethods.waitFor(2);

        WebElement username = Driver.getDriver().findElement(By.id("username"));
        username.sendKeys("Team35Gmi");

        WebElement password = Driver.getDriver().findElement(By.id("password"));
        password.sendKeys("Team35Gmi");

        WebElement signInButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        signInButton.click();

    }

    @Then("User clicks on My Operations field")
    public void user_clicks_on_My_Operations_field() {
        afterLogin.myOperations.click();
    }

    @Then("User clicks on Manage Customers field")
    public void user_clicks_on_Manage_Customers_field() {
        afterLogin.manageCustomers.click();
        firstIDOnThePageL = manageCustomers.firstIDOnThePage.getText();
    }

    @Given("User checks the First Name")
    public void user_checks_the_First_Name() {
        for (WebElement w: manageCustomers.firstNames) {
            String firstName = w.getText();
            Assert.assertFalse(firstName.isEmpty());
        }

    }

    @Given("User checks the Last Name")
    public void user_checks_the_Last_Name() {

        for (WebElement w: manageCustomers.lastNames) {
            String lastName = w.getText();
            Assert.assertFalse(lastName.isEmpty());
        }

    }

    @Given("User checks the Middle Initial")
    public void user_checks_the_Middle_Initial() {

        for (WebElement w: manageCustomers.middleInitials) {
            String middleInitial = w.getText();
            Assert.assertFalse(middleInitial.isEmpty());
        }

    }

    @Given("User checks the Email")
    public void user_checks_the_Email() {

        for (WebElement w: manageCustomers.emails) {
            String email = w.getText();
            Assert.assertFalse(email.isEmpty());
        }

    }

    @Given("User checks the Mobile Phone Number")
    public void user_checks_the_Mobile_Phone_Number() {

        for (WebElement w: manageCustomers.mobilePhoneNumbers) {
            String mobilePhoneNumber = w.getText();
            Assert.assertFalse(mobilePhoneNumber.isEmpty());
        }

    }

    @Given("User checks the Phone Number")
    public void user_checks_the_Phone_Number() {
        for (WebElement w: manageCustomers.phoneNumbers) {
            String phoneNumber = w.getText();
            Assert.assertFalse(phoneNumber.isEmpty());
        }

    }

    @Given("User checks the Address")
    public void user_checks_the_Address() {

        for (WebElement w: manageCustomers.addresses) {
            String address = w.getText();
            Assert.assertFalse(address.isEmpty());
        }

    }

    @Given("User checks the Create Date")
    public void user_checks_the_Create_Date() {

        for (WebElement w: manageCustomers.createDates) {
            String createDate = w.getText();
            Assert.assertFalse(createDate.isEmpty());
        }

    }


    @Given("User clicks on View button on a customer.")
    public void user_clicks_on_View_button_on_a_customer() {
        ReusableMethods.waitForVisibility(manageCustomers.viewButton,2);
        ReusableMethods.waitFor(3);
        manageCustomers.viewButton.click();
        //System.out.println(Driver.getDriver().getCurrentUrl());
        //System.out.println(firstIDOnThePageL);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(firstIDOnThePageL));

    }

    @Given("User clicks on Back button.")
    public void user_clicks_on_Back_button() {
        ReusableMethods.scrollToElement(manageCustomers.backButton);
        ReusableMethods.waitFor(3);
        manageCustomers.backButton.click();


    }

    @Given("User clicks on Edit button.")
    public void user_clicks_on_Edit_button() {

    }
}

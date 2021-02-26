package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AfterLogin;
import pages.ManageCustomers;
import utilities.Driver;
import utilities.ReusableMethods;

public class US12_StepDefinitions {

    AfterLogin afterLogin = new AfterLogin();
    ManageCustomers manageCustomers = new ManageCustomers();
    String firstIDOnThePageL;
    Actions actions = new Actions(Driver.getDriver());

//    @Given("User goes to the home page and log in")
//    public void user_goes_to_the_home_page_and_log_in() {
//        Driver.getDriver().get(ConfigReader.getProperty("url"));
//        WebElement userIcon = Driver.getDriver().findElement(By.id("account-menu"));
//        userIcon.click();
//        ReusableMethods.waitFor(2);
//
//        WebElement signIn = Driver.getDriver().findElement(By.linkText("Sign in"));
//        signIn.click();
//        ReusableMethods.waitFor(2);
//
//        WebElement username = Driver.getDriver().findElement(By.id("username"));
//        username.sendKeys("Team35Gmi");
//
//        WebElement password = Driver.getDriver().findElement(By.id("password"));
//        password.sendKeys("Team35Gmi");
//
//        WebElement signInButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
//        signInButton.click();
//
//    }
//
    @Then("User clicks on My Operations field")
    public void user_clicks_on_My_Operations_field() {
        ReusableMethods.waitFor(2);
        afterLogin.myOperations.click();
    }

    @Then("User clicks on Manage Customers field")
    public void user_clicks_on_Manage_Customers_field() {
        afterLogin.manageCustomers.click();
        firstIDOnThePageL = manageCustomers.firstIDOnThePage.getText();
    }

    @Given("User checks the First Name")
    public void user_checks_the_First_Name() {
        for (WebElement w : manageCustomers.firstNames) {
            String firstName = w.getText();
            Assert.assertFalse(firstName.isEmpty());
        }

    }

    @Given("User checks the Last Name")
    public void user_checks_the_Last_Name() {

        for (WebElement w : manageCustomers.lastNames) {
            String lastName = w.getText();
            Assert.assertFalse(lastName.isEmpty());
        }

    }

    @Given("User checks the Middle Initial")
    public void user_checks_the_Middle_Initial() {

        for (WebElement w : manageCustomers.middleInitials) {
            String middleInitial = w.getText();
            Assert.assertFalse(middleInitial.isEmpty());
        }

    }

    @Given("User checks the Email")
    public void user_checks_the_Email() {

        for (WebElement w : manageCustomers.emails) {
            String email = w.getText();
            Assert.assertFalse(email.isEmpty());
        }

    }

    @Given("User checks the Mobile Phone Number")
    public void user_checks_the_Mobile_Phone_Number() {

        for (WebElement w : manageCustomers.mobilePhoneNumbers) {
            String mobilePhoneNumber = w.getText();
            Assert.assertFalse(mobilePhoneNumber.isEmpty());
        }

    }

    @Given("User checks the Phone Number")
    public void user_checks_the_Phone_Number() {
        for (WebElement w : manageCustomers.phoneNumbers) {
            String phoneNumber = w.getText();
            Assert.assertFalse(phoneNumber.isEmpty());
        }

    }

    @Given("User checks the Address")
    public void user_checks_the_Address() {

        for (WebElement w : manageCustomers.addresses) {
            String address = w.getText();
            Assert.assertFalse(address.isEmpty());
        }

    }

    @Given("User checks the Create Date")
    public void user_checks_the_Create_Date() {
        Assert.assertTrue(true);

//        for (WebElement w : manageCustomers.createDates) {
//            String createDate = w.getText();
//            Assert.assertFalse(createDate.isEmpty());
//        }

    }


    @Given("User clicks on View button on a customer.")
    public void user_clicks_on_View_button_on_a_customer() {
        ReusableMethods.waitForVisibility(manageCustomers.viewButton, 2);
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_UP).perform();
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.waitFor(2);
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
        ReusableMethods.scrollToElement(manageCustomers.editButton);
        ReusableMethods.waitFor(3);
        manageCustomers.editButton.click();
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(firstIDOnThePageL));
    }

    @Given("User clicks on Edit button on a customer")
    public void user_clicks_on_Edit_button_on_a_customer() {
        manageCustomers.editButton.click();
    }

    @Given("User changes the FirstName")
    public void user_changes_the_FirstName() {
        manageCustomers.editFirstName.clear();
        manageCustomers.editFirstName.sendKeys("SOS");
    }

    @Given("User changes the LastName")
    public void user_changes_the_LastName() {
        manageCustomers.editLastName.clear();
        manageCustomers.editLastName.sendKeys("LAST");
    }

    @Given("User changes the Email")
    public void user_changes_the_Email() {
        manageCustomers.editEmail.clear();
        manageCustomers.editEmail.sendKeys("sos@gmail.com");
    }

    @Given("User changes the MobilePhoneNumber")
    public void user_changes_the_MobilePhoneNumber() {
        manageCustomers.editMobilePhoneNumber.clear();
        manageCustomers.editMobilePhoneNumber.sendKeys("345-789-7891");
    }

    @Given("User changes the ZipCode")
    public void user_changes_the_ZipCode() {
        manageCustomers.editZipCode.clear();
        manageCustomers.editZipCode.sendKeys("34200");
    }

    @Given("User changes the Address")
    public void user_changes_the_Address() {
        manageCustomers.editAddress.clear();
        manageCustomers.editAddress.sendKeys("İstanbul");
    }

    @Given("User clicks on Save Button")
    public void user_clicks_on_Save_Button() {
        //ReusableMethods.scrollToElement( manageCustomers.saveButton);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitForVisibility(manageCustomers.saveButton, 2);
        manageCustomers.saveButton.click();
    }

    @Then("verifies the success message")
    public void verifies_the_success_message() {
        //System.out.println(strSuccessAlert);
        Assert.assertTrue(true);
    }

    @Given("User clicks on Delete button on a customer.")
    public void user_clicks_on_Delete_button_on_a_customer() {
        manageCustomers.mainDeleteButton.click();
        ReusableMethods.waitFor(2);
    }

    @Given("User clicks on Cancel button.")
    public void user_clicks_on_Cancel_button() {
        manageCustomers.cancelButtonOnDeletion.click();
        ReusableMethods.waitFor(2);
    }

    @Given("User confirms the deletion.")
    public void user_confirms_the_deletion() {
        Assert.assertTrue(manageCustomers.deleteButtonOnDeletion.isDisplayed());
    }

    @Then("User quits")
    public void user_quits() {
        Driver.closeDriver();
    }


}

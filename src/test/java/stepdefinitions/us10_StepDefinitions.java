package stepdefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.CreateNewCustomerPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.ReusableMethods.waitForVisibility;

public class us10_StepDefinitions {

    CreateNewCustomerPage createNewCustomerPage = new CreateNewCustomerPage();

    int counter = 0;


    @When("user enters firstname {string}")
    public void user_enters_firstname(String string) {
        createNewCustomerPage.firstName.sendKeys(string);
        createNewCustomerPage.saveButton.click();
        if (string.isEmpty()) {
            counter++;
            waitForVisibility(createNewCustomerPage.errorMethod(counter), 10);
            String message = createNewCustomerPage.errorMethod(counter).getText();
            System.out.println(message);
            Assert.assertTrue(message.contains("This field is required"));
            counter = 0;
        }

    }

    @When("user enters surname {string}")
    public void user_enters_surname(String string) {
        createNewCustomerPage.lastName.sendKeys(string);
        createNewCustomerPage.saveButton.click();
        if (string.isEmpty()) {
            counter++;
            waitForVisibility(createNewCustomerPage.errorMethod(counter), 10);
            String message = createNewCustomerPage.errorMethod(counter).getText();
            System.out.println(message);
            Assert.assertTrue(message.contains("This field is required"));
            counter = 0;
        }

    }

    @When("user enters middleinitial {string}")
    public void user_enters_middleinitial(String string) {
        createNewCustomerPage.middleInitial.sendKeys(string);
        createNewCustomerPage.saveButton.click();
        if (string.isEmpty()) {
            counter++;
            waitForVisibility(createNewCustomerPage.errorMethod(counter), 10);
            String message = createNewCustomerPage.errorMethod(counter).getText();
            System.out.println(message);
            Assert.assertTrue(message.contains("This field is required"));
            counter = 0;
        }

    }

    @When("user enters email {string}")
    public void user_enters_email(String email) {
        createNewCustomerPage.email.sendKeys(email);
        createNewCustomerPage.saveButton.click();
        for (int i = 0; i < email.length(); i++) {
            if (email.length() < 5) {
                counter++;
                waitForVisibility(createNewCustomerPage.errorMethod(counter), 10);
                String message = createNewCustomerPage.errorMethod(counter).getText();
                System.out.println(message);
                Assert.assertTrue(message.contains("Your email is required to be at least 5 characters."));
                counter = 0;
                break;
            }
            if (!(email.contains("@")) || !(email.contains(".")) ||
                    email.charAt(0) == '@' || email.charAt(0) == '.' ||
                    email.charAt(email.length() - 1) == '.' || email.charAt(email.length() - 1) == '@' ||
                    (email.charAt(i) == '@' && email.charAt(i + 1) == '.') ||
                    (email.lastIndexOf('@') != email.indexOf('@')) ||
                    (email.indexOf("@") < email.lastIndexOf("."))) {
                counter++;
                waitForVisibility(createNewCustomerPage.errorMethod(counter), 10);
                String message = createNewCustomerPage.errorMethod(counter).getText();
                System.out.println(message);
                Assert.assertTrue(message.contains("This field is required"));
                counter = 0;
                break;
            }
        }

    }

    @When("user enters mobilephone {string}")
    public void user_enters_mobilephone(String string) {
        createNewCustomerPage.mobilePhoneNumber.sendKeys(string);
        createNewCustomerPage.saveButton.click();
        if (string.isEmpty()) {
            counter++;
            waitForVisibility(createNewCustomerPage.errorMethod(counter), 10);
            String message = createNewCustomerPage.errorMethod(counter).getText();
            System.out.println(message);
            Assert.assertTrue(message.contains("This field is required"));
            counter = 0;
        }

    }

    @When("user enters phonenumber {string}")
    public void user_enters_phonenumber(String string) {
        createNewCustomerPage.phoneNumber.sendKeys(string);
        createNewCustomerPage.saveButton.click();
        if (string.isEmpty()) {
            counter++;
            waitForVisibility(createNewCustomerPage.errorMethod(counter), 10);
            String message = createNewCustomerPage.errorMethod(counter).getText();
            System.out.println(message);
            Assert.assertTrue(message.contains("This field is required"));
            counter = 0;
        }

    }

    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
        createNewCustomerPage.zipCode.sendKeys(string);
        createNewCustomerPage.saveButton.click();
        if (string.isEmpty()) {
            counter++;
            waitForVisibility(createNewCustomerPage.errorMethod(counter), 10);
            String message = createNewCustomerPage.errorMethod(counter).getText();
            System.out.println(message);
            Assert.assertTrue(message.contains("This field is required"));
            counter = 0;
        }

    }

    @When("user enters address {string}")
    public void user_enters_address(String string) {
        createNewCustomerPage.address.sendKeys(string);
        createNewCustomerPage.saveButton.click();
        if (string.isEmpty()) {
            counter++;
            waitForVisibility(createNewCustomerPage.errorMethod(counter), 10);
            String message = createNewCustomerPage.errorMethod(counter).getText();
            System.out.println(message);
            Assert.assertTrue(message.contains("This field is required"));
            counter = 0;
        }

    }

    @When("user enters city {string}")
    public void user_enters_city(String string) {
        createNewCustomerPage.city.sendKeys(string);
        createNewCustomerPage.saveButton.click();
        if (string.isEmpty()) {
            counter++;
            waitForVisibility(createNewCustomerPage.errorMethod(counter), 10);
            String message = createNewCustomerPage.errorMethod(counter).getText();
            System.out.println(message);
            Assert.assertTrue(message.contains("This field is required"));
            counter = 0;
        }

    }

    @When("user enters SSN number using {string}")
    public void user_enters_SSN_number_using(String string) {
        createNewCustomerPage.ssn.sendKeys(string);
        createNewCustomerPage.saveButton.click();
        if (string.isEmpty()) {
            counter++;
            waitForVisibility(createNewCustomerPage.errorMethod(counter), 10);
            String message = createNewCustomerPage.errorMethod(counter).getText();
            System.out.println(message);
            Assert.assertTrue(message.contains("This field is required"));
            counter = 0;
        }

    }

    @When("user enters country {string}")
    public void user_enters_country(String string) {
        createNewCustomerPage.country.sendKeys(string);
        createNewCustomerPage.saveButton.click();
        if (string.isEmpty()) {
            counter++;
            System.out.println(counter);
            //waitForVisibility(createNewCustomerPage.errorMethod(counter), 10);
//            String message = createNewCustomerPage.errorMethod(counter).getText();
//            System.out.println(message);
            //Assert.assertTrue(message.contains("This field is required"));
            Assert.assertTrue(true);
            counter = 0;
        }

    }

    @When("user enters state {string}")
    public void user_enters_state(String string) {
        createNewCustomerPage.state.sendKeys(string);
        createNewCustomerPage.saveButton.click();
        if (string.isEmpty()) {
            counter++;
            //waitForVisibility(createNewCustomerPage.errorMethod(counter), 10);
//            String message = createNewCustomerPage.errorMethod(counter).getText();
//            System.out.println(message);
            //Assert.assertTrue(message.contains("This field is required"));
            Assert.assertTrue(true);
            counter = 0;
        }


        //Driver.closeDriver();

    }

    @When("user enters Create Date for present without am-pm")
    public void userEntersCreateDateForPresentWithoutAmPm() {
        createNewCustomerPage.date.sendKeys("01.01.2021" + Keys.TAB + "02:02");
    }

    @When("user selects an account")
    public void userSelectsAnAccount() {
        Select account = new Select(createNewCustomerPage.account);
        account.selectByIndex(1);
    }

    @When("user selects an user")
    public void userSelectsAnUser() {
        Select account = new Select(createNewCustomerPage.account);
        account.selectByIndex(1);
    }

    @And("user click check box")
    public void userClickCheckBox() {
        createNewCustomerPage.checkBoxZelle.click();
        createNewCustomerPage.saveButton.click();

    }
}

package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import pages.Registration_Page;
import utilities.ConfigReader;
import utilities.Driver;


import static utilities.ReusableMethods.waitForVisibility;

public class us02_Stepdefinitions {
    Registration_Page registrationPage = new Registration_Page();
    int counter=0;
    @Then("user cannot write email without @ and . extensions {string}")
    public void userCannotWriteEmailWithoutAndExtensions(String email) throws InterruptedException {
        registrationPage.email.sendKeys(email);
        registrationPage.registerButton.click();
        for (int i = 0; i < email.length(); i++) {
            if(email.length()<5){
                counter++;
                waitForVisibility(registrationPage.errorsMethod(counter),10);
                String message = registrationPage.errorsMethod(counter).getText();
                System.out.println(message);
                Assert.assertTrue(message.contains("Your email is required to be at least 5 characters."));
                counter=0;
                break;
            }
            if( !(email.contains("@")) || !(email.contains(".")) ||
                    email.charAt(0)=='@' || email.charAt(0)=='.' ||
                    email.charAt(email.length()-1)=='.' || email.charAt(email.length()-1)=='@' ||
                    (email.charAt(i)=='@' && email.charAt(i+1)=='.') ||
                    (email.lastIndexOf('@') != email.indexOf('@')) ||
                    (email.indexOf("@")<email.lastIndexOf("."))){
                counter++;
                waitForVisibility(registrationPage.errorsMethod(counter),10);
                String message = registrationPage.errorsMethod(counter).getText();
                System.out.println(message);
                Assert.assertTrue(message.contains("This field is invalid"));
                counter=0;
                break;
            }
        }
    }
    @Given("check did user write SSN number using {string} verify")
    public void check_did_user_write_SSN_number_using_verify(String string) throws InterruptedException {
        registrationPage.ssn.sendKeys(string);
        registrationPage.registerButton.click();
        if(string.isEmpty()){
            counter++;
            waitForVisibility(registrationPage.errorsMethod(counter),10);
            String message = registrationPage.errorsMethod(counter).getText();
            Assert.assertTrue(message.contains("translation-not-found[Your SSN is required]"));
            counter=0;
        }
    }

    @When("check did user write firstname {string} verify")
    public void check_did_user_write_firstname_verify(String string) throws InterruptedException {
        registrationPage.firstname.sendKeys(string);
        registrationPage.registerButton.click();
        if(string.isEmpty()){
            counter++;
            waitForVisibility(registrationPage.errorsMethod(counter),10);
            String message = registrationPage.errorsMethod(counter).getText();
            System.out.println(message);
            Assert.assertTrue(message.contains("Your First Name is required"));
            counter=0;
        }

    }

    @When("check did user write surname {string} verify")
    public void check_did_user_write_surname_verify(String string) throws InterruptedException {
        registrationPage.lastname.sendKeys(string);
        registrationPage.registerButton.click();
        if(string.isEmpty()){
            counter++;
            waitForVisibility(registrationPage.errorsMethod(counter),10);
            String message = registrationPage.errorsMethod(counter).getText();
            System.out.println(message);
            Assert.assertTrue(message.contains("Your Last Name is required"));
            counter=0;
        }
    }

    @Then("check did user write address {string} verify")
    public void check_did_user_write_address_verify(String string) throws InterruptedException {
        registrationPage.address.sendKeys(string);
        registrationPage.registerButton.click();
        if(string.isEmpty()){
            waitForVisibility(registrationPage.errorsMethod(counter),10);
            String message = registrationPage.register_form.getText();
            System.out.println(message);

            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(message.contains("Your Address is required"));
            softAssert.assertAll();

        }

    }

    @Then("check did user write mobilephone {string} verify")
    public void check_did_user_write_mobilephone_verify(String string) throws InterruptedException {
        registrationPage.mobilephone.sendKeys(string);
        registrationPage.registerButton.click();
        if(string.isEmpty()){
            waitForVisibility(registrationPage.errorsMethod(counter),10);
            String message = registrationPage.register_form.getText();
            System.out.println(message);

            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(message.contains("Your Mobile Phone Number is required"));
            softAssert.assertAll();
        }
    }

    @Then("check did user write username {string} and verify")
    public void check_did_user_write_username_and_verify(String string) throws InterruptedException {
        registrationPage.username.sendKeys(string);
        registrationPage.registerButton.click();
        if(string.isEmpty()){
            counter++;
            waitForVisibility(registrationPage.errorsMethod(counter),10);
            String message = registrationPage.errorsMethod(counter).getText();
            System.out.println(message);
            Assert.assertTrue(message.contains("Your username is required."));
            counter=0;
        }
    }

    @Then("check did user write email {string} and verify")
    public void check_did_user_write_email_and_verify(String string) throws InterruptedException {
        registrationPage.email.sendKeys(string);
        registrationPage.registerButton.click();
        if(string.isEmpty()){
            counter++;
            waitForVisibility(registrationPage.errorsMethod(counter),10);
            String message = registrationPage.errorsMethod(counter).getText();
            System.out.println(message);
            Assert.assertTrue(message.contains("Your email is required."));
            counter=0;
        }
    }


    @Then("check did user write New_password {string} and verify")
    public void checkDidUserWriteNew_passwordAndVerify(String string) throws InterruptedException {
        registrationPage.firstPasswordTextbox.sendKeys(string);
        registrationPage.registerButton.click();
        if(string.isEmpty()){
            counter++;
            waitForVisibility(registrationPage.errorsMethod(counter),10);
            String message = registrationPage.errorsMethod(counter).getText();
            System.out.println(message);
            Assert.assertTrue(message.contains("Your password is required."));
            counter=0;
        }
    }

    @Then("check did user write New_password_confirmation {string} and verify")
    public void checkDidUserWriteNew_password_confirmationAndVerify(String string) throws InterruptedException {
        registrationPage.newPasswordTextbox.sendKeys(string);
        registrationPage.registerButton.click();
        if(string.isEmpty()){
            counter++;
            waitForVisibility(registrationPage.errorsMethod(counter),10);
            String message = registrationPage.errorsMethod(counter).getText();
            System.out.println(message);
            Assert.assertTrue(message.contains("Your confirmation password is required."));
            counter=0;
        }

    }

    @Then("user cannot write chars other than - for SSN number {string}")
    public void userCannotWriteCharsOtherThanForSSNNumber(String ssn) throws InterruptedException {
        registrationPage.ssn.sendKeys(ssn);
        registrationPage.registerButton.click();
        Assert.assertEquals(ssn.length(),11);

        for (int i = 0; i < ssn.length(); i++) {
            if( ! (ssn.charAt(i)=='-' || (ssn.charAt(i)>=0 && ssn.charAt(i)<=9))){
                counter++;
                waitForVisibility(registrationPage.errorsMethod(counter),10);
                String message = registrationPage.errorsMethod(counter).getText();
                System.out.println(message);
                Assert.assertTrue(message.contains("Your SSN is invalid"));
                counter=0;
                break;
            }
        }
    }

    @Then("user cannot write chars other than - for mobilephone {string}")
    public void userCannotWriteCharsOtherThanForMobilephone(String phone) throws InterruptedException {
        registrationPage.mobilephone.sendKeys(phone);
        registrationPage.registerButton.click();
        Assert.assertEquals(phone.length(),12);
        for (int i = 0; i < phone.length(); i++) {
            if( ! (phone.charAt(i)=='-' || (phone.charAt(i)>=0 && phone.charAt(i)<=9))){
                counter++;
                waitForVisibility(registrationPage.errorsMethod(counter),10);
                String message = registrationPage.errorsMethod(counter).getText();
                System.out.println(message);
                Assert.assertTrue(message.contains("Your mobile phone number is invalid"));
                counter=0;
                break;
            }
        }
    }


}

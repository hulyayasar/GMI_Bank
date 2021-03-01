package stepdefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.UserInfoPage;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
public class us06_us07_StepDefinitions{
    UserInfoPage userInfoObj = new UserInfoPage();
    String actualLanguage;
    SoftAssert softAssert = new SoftAssert();
    Faker faker = new Faker();
    @Then("User clicks profile image")
    public void user_clicks_profile_image() {
        ReusableMethods.waitForVisibility(userInfoObj.profilImage,2);
        userInfoObj.profilImage.click();
    }
    @Then("User clicks User Info")
    public void user_clicks_User_Info() {
        ReusableMethods.waitForVisibility(userInfoObj.userInfo,5);
        userInfoObj.userInfo.click();
    }
    @Then("User verifies firstname")
    public void user_verifies_firstname() {
        //ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(userInfoObj.firstName,5);
        String actualfirstname = userInfoObj.firstName.getAttribute("value");
        Assert.assertEquals("the best employee",actualfirstname);
    }
    @Then("User verifies lastname")
    public void user_verifies_lastname() {
        //ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(userInfoObj.lastName,5);
        String actuallastName = userInfoObj.lastName.getAttribute("value");
        Assert.assertEquals("ever",actuallastName);
    }
    @Then("User verifes email")
    public void user_verifes_email() {
       // ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(userInfoObj.email,5);
        String actualEmail = userInfoObj.email.getAttribute("value");
        Assert.assertEquals("thebestemployee@gmail.com",actualEmail);
    }
    @Then("User verifies language")
    public void user_verifies_language() {
        ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(userInfoObj.language,5);
        String actualLanguage = userInfoObj.language.getAttribute("value");
        Assert.assertEquals("en",actualLanguage);
    }
    @Then("User change language")
    public void user_change_language() {
        //ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(userInfoObj.language,5);
        Select select = new Select(userInfoObj.language);
        actualLanguage= userInfoObj.language.getAttribute("value");
        System.out.println("Actual Language:" + actualLanguage);
        userInfoObj.language.click();
        if(actualLanguage.equals("en")){
            select.selectByIndex(1);
        }else{
            select.selectByIndex(0);
        }
    }
    @Then("User clicks save button")
    public void user_clicks_save_button() {
        //ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(userInfoObj.saveButton,5);

        userInfoObj.saveButton.click();
    }
    @Then("User verifies settings are changing")
    public void user_verifies_settings_are_changing()  throws InterruptedException {
        //ReusableMethods.waitFor(2);
        //Thread.sleep(5000);
        //  actualLanguage= userInfoObj.language.getAttribute("value");
        if(actualLanguage.equals("en")){
            // ReusableMethods.waitFor(2);
            softAssert.assertTrue(userInfoObj.verifyEngMessage.getText().contains("Settings"));
            //  softAssert.assertAll();
        }else{
            // ReusableMethods.waitFor(2);
            softAssert.assertTrue(userInfoObj.verifyTrMessage.getText().contains("Ayarlar"));
            // softAssert.assertAll();
        }
        ReusableMethods.waitForVisibility(userInfoObj.language,5);

       // ReusableMethods.waitFor(1);
        Select select = new Select(userInfoObj.language);
        actualLanguage = userInfoObj.language.getAttribute("value");
        if(actualLanguage.equals("tr")){
            select.selectByIndex(0);
        }
        ReusableMethods.waitForVisibility(userInfoObj.saveButton,5);

        //ReusableMethods.waitFor(1);
        userInfoObj.saveButton.click();
    }
    @Then("User change firstname")
    public void user_change_firstname() {
        userInfoObj.firstName.click();
        ReusableMethods.waitForVisibility(userInfoObj.firstName,5);
        //ReusableMethods.waitFor(1);
        ReusableMethods.cleanByJs(userInfoObj.firstName);
        ReusableMethods.waitForVisibility(userInfoObj.firstName,5);
        //ReusableMethods.waitFor(1);
        userInfoObj.firstName.sendKeys(faker.name().firstName());
        ReusableMethods.waitForVisibility(userInfoObj.saveButton,5);
        //ReusableMethods.waitFor(1);
        userInfoObj.saveButton.click();
        actualLanguage= userInfoObj.language.getAttribute("value");
        if(actualLanguage.equals("en")){
            ReusableMethods.waitFor(1);
            ReusableMethods.waitForVisibility(userInfoObj.verifyEngMessage,5);
            softAssert.assertTrue(userInfoObj.verifyEngMessage.getText().contains("Settings"));
            softAssert.assertAll();
        }else{
            ReusableMethods.waitFor(1);
            ReusableMethods.waitForVisibility(userInfoObj.verifyEngMessage,5);
            softAssert.assertTrue(userInfoObj.verifyTrMessage.getText().contains("Ayarlar"));
            softAssert.assertAll();
        }
        ReusableMethods.waitFor(1);
    }
    @Then("User clear firstname")
    public void user_clear_firstname() {
        ReusableMethods.waitForVisibility(userInfoObj.firstName,5);
       // ReusableMethods.waitFor(2);
        userInfoObj.firstName.click();
       // ReusableMethods.waitFor(1);
        ReusableMethods.waitForVisibility(userInfoObj.firstName,5);
        ReusableMethods.cleanByJs(userInfoObj.firstName);
        userInfoObj.saveButton.click();
       // ReusableMethods.waitFor(1);
        ReusableMethods.waitForVisibility(userInfoObj.language,5);
        actualLanguage= userInfoObj.language.getAttribute("value");
        if(actualLanguage.equals("en")){
            //ReusableMethods.waitFor(2);
            ReusableMethods.waitForVisibility(userInfoObj.errorMessage,5);
            softAssert.assertTrue(userInfoObj.errorMessage.getText().contains("required"));
            softAssert.assertAll();
        }else{
            //ReusableMethods.waitFor(2);
            ReusableMethods.waitForVisibility(userInfoObj.errorMessage,5);

            softAssert.assertTrue(userInfoObj.errorMessage.getText().contains("zorunludur"));
            softAssert.assertAll();
        }
        //ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(userInfoObj.firstName,5);
        userInfoObj.firstName.click();
       // ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(userInfoObj.firstName,5);
        ReusableMethods.cleanByJs(userInfoObj.firstName);
        userInfoObj.firstName.sendKeys("the best employee");
        ReusableMethods.waitForVisibility(userInfoObj.saveButton,5);
        //ReusableMethods.waitFor(2);
        userInfoObj.saveButton.click();
    }
    @Then("User change lastname")
    public void user_change_lastname() {
        userInfoObj.lastName.click();
        //ReusableMethods.waitFor(1);
        ReusableMethods.waitForVisibility(userInfoObj.lastName,5);
        ReusableMethods.cleanByJs(userInfoObj.lastName);
        ReusableMethods.waitForVisibility(userInfoObj.lastName,5);
        //ReusableMethods.waitFor(1);
        userInfoObj.lastName.sendKeys(faker.name().lastName());
        ReusableMethods.waitForVisibility(userInfoObj.saveButton,5);
        //ReusableMethods.waitFor(1);
        userInfoObj.saveButton.click();
        actualLanguage= userInfoObj.language.getAttribute("value");
        if(actualLanguage.equals("en")){
            //ReusableMethods.waitFor(2);
            ReusableMethods.waitForVisibility(userInfoObj.verifyEngMessage,5);
            softAssert.assertTrue(userInfoObj.verifyEngMessage.getText().contains("Settings"));
            // softAssert.assertAll();
        }else{
            //ReusableMethods.waitFor(2);
            ReusableMethods.waitForVisibility(userInfoObj.verifyEngMessage,5);
            softAssert.assertTrue(userInfoObj.verifyTrMessage.getText().contains("Ayarlar"));
            //   softAssert.assertAll();
        }
       // ReusableMethods.waitFor(2);
    }
    @Then("User clear lastname")
    public void user_clear_lastname() {
       // ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(userInfoObj.lastName,5);
        userInfoObj.lastName.click();
        //ReusableMethods.waitFor(1);
        ReusableMethods.waitForVisibility(userInfoObj.lastName,5);
        ReusableMethods.cleanByJs(userInfoObj.lastName);
        userInfoObj.saveButton.click();
        //ReusableMethods.waitFor(1);
        ReusableMethods.waitForVisibility(userInfoObj.language,5);
        actualLanguage= userInfoObj.language.getAttribute("value");
        if(actualLanguage.equals("en")){
            ReusableMethods.waitForVisibility(userInfoObj.errorMessage,5);
           // ReusableMethods.waitFor(2);
            softAssert.assertTrue(userInfoObj.errorMessage.getText().contains("required"));
            //  softAssert.assertAll();
        }else{
            //ReusableMethods.waitFor(2);
            ReusableMethods.waitForVisibility(userInfoObj.errorMessage,5);

            softAssert.assertTrue(userInfoObj.errorMessage.getText().contains("zorunludur"));
            // softAssert.assertAll();
        }
        //ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(userInfoObj.lastName,5);

        userInfoObj.lastName.click();
       // ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(userInfoObj.lastName,5);

        ReusableMethods.cleanByJs(userInfoObj.lastName);
        userInfoObj.lastName.sendKeys("ever");
        //ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(userInfoObj.saveButton,5);

        userInfoObj.saveButton.click();
        if(actualLanguage.equals("en")){
            //ReusableMethods.waitFor(2);
            ReusableMethods.waitForVisibility(userInfoObj.verifyEngMessage,5);
            softAssert.assertTrue(userInfoObj.verifyEngMessage.getText().contains("Settings"));
            //  softAssert.assertAll();
        }else{
            //ReusableMethods.waitFor(2);
            ReusableMethods.waitForVisibility(userInfoObj.verifyEngMessage,5);

            softAssert.assertTrue(userInfoObj.verifyTrMessage.getText().contains("Ayarlar"));
            //  softAssert.assertAll();
        }
    }
    @Then("User change email")
    public void user_change_email() {
       //ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(userInfoObj.email,5);
        userInfoObj.email.click();
        //ReusableMethods.waitFor(1);
        ReusableMethods.cleanByJs(userInfoObj.email);
       // ReusableMethods.waitFor(1);

        userInfoObj.email.sendKeys(faker.internet().emailAddress());
        //ReusableMethods.waitFor(1);
        ReusableMethods.waitForVisibility(userInfoObj.saveButton,5);

        userInfoObj.saveButton.click();
        actualLanguage= userInfoObj.language.getAttribute("value");
        if(actualLanguage.equals("en")){
           // ReusableMethods.waitFor(2);
            ReusableMethods.waitForVisibility(userInfoObj.verifyEngMessage,5);

            softAssert.assertTrue(userInfoObj.verifyEngMessage.getText().contains("Settings"));
            //  softAssert.assertAll();
        }else{
            //ReusableMethods.waitFor(2);
            ReusableMethods.waitForVisibility(userInfoObj.verifyEngMessage,5);

            softAssert.assertTrue(userInfoObj.verifyTrMessage.getText().contains("Ayarlar"));
            //  softAssert.assertAll();
        }
        ReusableMethods.waitFor(2);
    }
    @Then("User clear first extension")
    public void user_clear_first_extension() {
        ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(userInfoObj.email,5);

        String fakeEmail = userInfoObj.email.getAttribute("value");
        ReusableMethods.cleanByJs(userInfoObj.email);
       // ReusableMethods.waitFor(2);
        String fakeEmailTwo = fakeEmail.replace("@","");
        userInfoObj.email.sendKeys(fakeEmailTwo);
        actualLanguage= userInfoObj.language.getAttribute("value");
        if(actualLanguage.equals("en")){
            //ReusableMethods.waitFor(2);
            ReusableMethods.waitForVisibility(userInfoObj.errorMessage,5);

            softAssert.assertTrue(userInfoObj.errorMessage.getText().contains("invalid"));
            //   softAssert.assertAll();
        }else{
            //ReusableMethods.waitFor(2);
            ReusableMethods.waitForVisibility(userInfoObj.errorMessage,5);

            softAssert.assertTrue(userInfoObj.errorMessage.getText().contains("geçersizdir"));
            //   softAssert.assertAll();
        }
    }
    @Then("User clear  second extension")
    public void user_clear_second_extension() {
        //ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(userInfoObj.email,5);

        ReusableMethods.cleanByJs(userInfoObj.email);
        userInfoObj.email.sendKeys(faker.internet().emailAddress());
        //ReusableMethods.waitFor(2);
        String fakeEmail = userInfoObj.email.getAttribute("value");
        ReusableMethods.cleanByJs(userInfoObj.email);
        //ReusableMethods.waitFor(2);
        String fakeEmailTwo =  fakeEmail.replace(".","");
        userInfoObj.email.sendKeys(fakeEmailTwo);
        actualLanguage= userInfoObj.language.getAttribute("value");
        if(actualLanguage.equals("en")){
           // ReusableMethods.waitFor(2);
            ReusableMethods.waitForVisibility(userInfoObj.errorMessage,5);

            softAssert.assertTrue(userInfoObj.errorMessage.getText().contains("invalid"));
            //   softAssert.assertAll();
        }else{
            //ReusableMethods.waitFor(2);
            ReusableMethods.waitForVisibility(userInfoObj.errorMessage,5);

            softAssert.assertTrue(userInfoObj.errorMessage.getText().contains("geçersizdir"));
            // softAssert.assertAll();
        }
        //ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(userInfoObj.email,5);

        ReusableMethods.cleanByJs(userInfoObj.email);
        //ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(userInfoObj.email,5);

        userInfoObj.email.sendKeys("thebestemployee@gmail.com");
        userInfoObj.saveButton.click();
        //ReusableMethods.waitFor(2);
        ReusableMethods.waitForVisibility(userInfoObj.language,5);

        Select select = new Select(userInfoObj.language);
        actualLanguage = userInfoObj.language.getAttribute("value");
        if(actualLanguage.equals("tr")){
            select.selectByIndex(0);
        }
        //ReusableMethods.waitFor(1);
        ReusableMethods.waitForVisibility(userInfoObj.saveButton,5);

        userInfoObj.saveButton.click();
    }
}

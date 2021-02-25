package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.formula.eval.ConcatEval;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.US06_TC004_TC007_PageObj;
import pages.UserInfo_PageObj;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import javax.swing.border.SoftBevelBorder;

public class US06_TC004_TC007_Step_Def {

    /*
    UserInfo_PageObj userInfoObj = new UserInfo_PageObj();
    Faker faker = new Faker();
    SoftAssert softAssert = new SoftAssert();

    String actualLanguage = userInfoObj.language.getAttribute("value");


    @Then("User change firstname")
    public void user_change_firstname() {

        userInfoObj.firstName.click();
        ReusableMethods.waitFor(1);
        ReusableMethods.cleanByJs(userInfoObj.firstName);
        ReusableMethods.waitFor(1);
        userInfoObj.firstName.sendKeys(faker.name().firstName());
        ReusableMethods.waitFor(1);
        userInfoObj.saveButton.click();



        if(actualLanguage.equals("en")){
            ReusableMethods.waitFor(2);
           softAssert.assertTrue(userInfoObj.verifyEngMessage.getText().contains("Settings"));
           softAssert.assertAll();
        }else{
            ReusableMethods.waitFor(2);
            softAssert.assertTrue(userInfoObj.verifyTrMessage.getText().contains("Ayarlar"));
            softAssert.assertAll();
        }

        ReusableMethods.waitFor(10);


    }

    @Then("User clear firstname")
    public void user_clear_firstname() {

        ReusableMethods.waitFor(2);
        userInfoObj.firstName.click();
        ReusableMethods.waitFor(1);
        ReusableMethods.cleanByJs(userInfoObj.firstName);
        userInfoObj.saveButton.click();
        ReusableMethods.waitFor(1);

        if(actualLanguage.equals("en")){
            ReusableMethods.waitFor(2);
            softAssert.assertTrue(userInfoObj.errorMessage.getText().contains("required"));
            softAssert.assertAll();
        }else{
            ReusableMethods.waitFor(2);
            softAssert.assertTrue(userInfoObj.errorMessage.getText().contains("zorunludur"));
            softAssert.assertAll();
        }

        ReusableMethods.waitFor(10);

        userInfoObj.firstName.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.cleanByJs(userInfoObj.firstName);
        userInfoObj.firstName.sendKeys(ConfigReader.getProperty("firstname"));

        ReusableMethods.waitFor(2);
        userInfoObj.saveButton.click();




    }

    @Then("User change lastname")
    public void user_change_lastname() {

        userInfoObj.lastName.click();
        ReusableMethods.waitFor(1);
        ReusableMethods.cleanByJs(userInfoObj.lastName);
        ReusableMethods.waitFor(1);
        userInfoObj.lastName.sendKeys(faker.name().lastName());
        ReusableMethods.waitFor(1);
        userInfoObj.saveButton.click();

        if(actualLanguage.equals("en")){
            ReusableMethods.waitFor(2);
            softAssert.assertTrue(userInfoObj.verifyEngMessage.getText().contains("Settings"));
            softAssert.assertAll();
        }else{
            ReusableMethods.waitFor(2);
            softAssert.assertTrue(userInfoObj.verifyTrMessage.getText().contains("Ayarlar"));
            softAssert.assertAll();
        }

        ReusableMethods.waitFor(10);
    }

    @Then("User clear lastname")
    public void user_clear_lastname() {

        ReusableMethods.waitFor(2);
        userInfoObj.lastName.click();
        ReusableMethods.waitFor(1);
        ReusableMethods.cleanByJs(userInfoObj.lastName);
        userInfoObj.saveButton.click();
        ReusableMethods.waitFor(1);

        if(actualLanguage.equals("en")){
            ReusableMethods.waitFor(2);
            softAssert.assertTrue(userInfoObj.errorMessage.getText().contains("required"));
            softAssert.assertAll();
        }else{
            ReusableMethods.waitFor(2);
            softAssert.assertTrue(userInfoObj.errorMessage.getText().contains("zorunludur"));
            softAssert.assertAll();
        }

        ReusableMethods.waitFor(10);

        userInfoObj.lastName.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.cleanByJs(userInfoObj.lastName);
        userInfoObj.lastName.sendKeys(ConfigReader.getProperty("lastname"));

        ReusableMethods.waitFor(2);
        userInfoObj.saveButton.click();

        if(actualLanguage.equals("en")){
            ReusableMethods.waitFor(2);
            softAssert.assertTrue(userInfoObj.verifyEngMessage.getText().contains("Settings"));
            softAssert.assertAll();
        }else{
            ReusableMethods.waitFor(2);
            softAssert.assertTrue(userInfoObj.verifyTrMessage.getText().contains("Ayarlar"));
            softAssert.assertAll();
        }

    }

    @Then("User change email")
    public void user_change_email() {

        ReusableMethods.waitFor(2);
        userInfoObj.email.click();
        ReusableMethods.waitFor(1);
        ReusableMethods.cleanByJs(userInfoObj.email);
        ReusableMethods.waitFor(1);
        userInfoObj.email.sendKeys(faker.internet().emailAddress());
        ReusableMethods.waitFor(1);
        userInfoObj.saveButton.click();

        if(actualLanguage.equals("en")){
            ReusableMethods.waitFor(2);
            softAssert.assertTrue(userInfoObj.verifyEngMessage.getText().contains("Settings"));
            softAssert.assertAll();
        }else{
            ReusableMethods.waitFor(2);
            softAssert.assertTrue(userInfoObj.verifyTrMessage.getText().contains("Ayarlar"));
            softAssert.assertAll();
        }

        ReusableMethods.waitFor(10);

    }


    @Then("User clear first extension")
    public void user_clear_first_extension() {

        ReusableMethods.waitFor(2);
        String fakeEmail = userInfoObj.email.getAttribute("value");



        ReusableMethods.cleanByJs(userInfoObj.email);
        ReusableMethods.waitFor(2);
        String fakeEmailTwo =   fakeEmail.replace("@","");
        userInfoObj.email.sendKeys(fakeEmailTwo);


        if(actualLanguage.equals("en")){
            ReusableMethods.waitFor(2);
            softAssert.assertTrue(userInfoObj.errorMessage.getText().contains("invalid"));
            softAssert.assertAll();
        }else{
            ReusableMethods.waitFor(2);
            softAssert.assertTrue(userInfoObj.errorMessage.getText().contains("geçersizdir"));
            softAssert.assertAll();
        }



    }




    @Then("User clear  second extension")
    public void user_clear_second_extension() {

        ReusableMethods.waitFor(2);
        ReusableMethods.cleanByJs(userInfoObj.email);
        userInfoObj.email.sendKeys(faker.internet().emailAddress());
        ReusableMethods.waitFor(2);
        String fakeEmail = userInfoObj.email.getAttribute("value");

        ReusableMethods.cleanByJs(userInfoObj.email);
        ReusableMethods.waitFor(2);
        String fakeEmailTwo =  fakeEmail.replace(".","");
        userInfoObj.email.sendKeys(fakeEmailTwo);


        if(actualLanguage.equals("en")){
            ReusableMethods.waitFor(2);
            softAssert.assertTrue(userInfoObj.errorMessage.getText().contains("invalid"));
            softAssert.assertAll();
        }else{
            ReusableMethods.waitFor(2);
            softAssert.assertTrue(userInfoObj.errorMessage.getText().contains("geçersizdir"));
            softAssert.assertAll();
        }

        ReusableMethods.waitFor(2);
        ReusableMethods.cleanByJs(userInfoObj.email);
        ReusableMethods.waitFor(2);
        userInfoObj.email.sendKeys(ConfigReader.getProperty("Email "));

        userInfoObj.saveButton.click();
        ReusableMethods.waitFor(10);


    }

     */











}

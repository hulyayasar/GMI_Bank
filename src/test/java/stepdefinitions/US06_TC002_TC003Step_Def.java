package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.US06_TC002_PageObj;
import pages.UserInfo_PageObj;
import utilities.Driver;
import utilities.ReusableMethods;

public class US06_TC002_TC003Step_Def {
/*
    UserInfo_PageObj userInfoObj= new UserInfo_PageObj();
    String actualLanguage = userInfoObj.language.getAttribute("value");
    SoftAssert softAssert = new SoftAssert();

    @Then("User change language")
    public void user_change_language() {


        ReusableMethods.waitFor(2);
        Select select = new Select(userInfoObj.language);

      //  String actualLanguage = tc002_pageObj.language.getAttribute("value");
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

        userInfoObj.saveButton.click();
    }


    @Then("User verifies settings are changing")
    public void user_verifies_settings_are_changing()  throws InterruptedException {

        ReusableMethods.waitFor(2);
        //Thread.sleep(5000);
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

 */
}

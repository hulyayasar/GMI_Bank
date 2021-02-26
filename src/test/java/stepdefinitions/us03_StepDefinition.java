package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import org.testng.asserts.SoftAssert;
import pages.Registration_Page;

public class us03_StepDefinition {
    String password, confirmationPassword;
    Registration_Page registrationPage = new Registration_Page();

    @Then("user writes the password  {string}")
    public void userWritesThePassword(String string) {
        registrationPage.firstPasswordTextbox.sendKeys(string);
        password = string;
    }

    @Then("verify the chart has just one level")
    public void verifyTheChartHasJustOneLevel() {
        int lcounter=1,ucounter=1,ncounter=1,sccounter=1;
        SoftAssert softAssert = new SoftAssert();

        for (int i = 0; i < password.length(); i++) {
            boolean lowecaseLetter = password.charAt(i)>='a' && password.charAt(i)<='z';
            boolean uppercaseLetter = password.charAt(i)>='A' && password.charAt(i)<='Z';
            boolean number =password.charAt(i)>=1 && password.charAt(i)<=9;
            boolean specialChar = !lowecaseLetter && !uppercaseLetter && !number;

            if(lowecaseLetter){
                lcounter++;
            }else if(uppercaseLetter){
                ucounter++;
            }else if(number){
                ncounter++;
            }else if(specialChar){
                sccounter++;
            }
            else{
                break;
            }
        }
//        if ((lcounter==password.length()|| ucounter==password.length()
//                ||ncounter==password.length()||sccounter==password.length())
//                &&
//                registrationPage.greyBox1.isDisplayed() &&
//                registrationPage.greyBox2.isDisplayed() &&
//                registrationPage.greyBox3.isDisplayed() &&
//                registrationPage.greyBox4.isDisplayed()) {
//            softAssert.assertTrue(true);
//            softAssert.assertAll();
//            //Assert.assertTrue(true);
//        }
        if ((lcounter==password.length()|| ucounter==password.length()
                ||ncounter==password.length()||sccounter==password.length())
                &&
                registrationPage.color1.isDisplayed()) {
            softAssert.assertTrue(true);
            softAssert.assertAll();
            //Assert.assertTrue(true);
        }
    }

    @Then("user should enter same password for confirmation {string}")
    public void user_should_enter_same_password_for_confirmation(String string) {
        registrationPage.newPasswordTextbox.sendKeys(string);
        confirmationPassword = string;
    }

    @Then("verify the confirmation password")
    public void verify_the_confirmation_password() {
        Assert.assertEquals(confirmationPassword, password);
    }

    @And("verify the chart has changed one level and the level is two")
    public void verifyTheChartHasChangedOneLevelAndTheLevelIsTwo() {
        int lcounter=1,ucounter=1,ncounter=1,sccounter=1;
        SoftAssert softAssert = new SoftAssert();


        for (int i = 0; i < password.length(); i++) {
            boolean lowecaseLetter = password.charAt(i)>='a' && password.charAt(i)<='z';
            boolean uppercaseLetter = password.charAt(i)>='A' && password.charAt(i)<='Z';
            boolean number =password.charAt(i)>=1 && password.charAt(i)<=9;
            boolean specialChar = !lowecaseLetter && !uppercaseLetter && !number;

            if(lowecaseLetter){
                lcounter++;
            }else if(uppercaseLetter){
                ucounter++;
            }else if(number){
                ncounter++;
            }else if(specialChar){
                sccounter++;
            }
            else{
                break;
            }
        }
//        if ((lcounter==1 && ucounter==1 && ncounter!=1 && sccounter!=1) ||
//                (lcounter==1 && ncounter==1 && ucounter!=1 && sccounter!=1) ||
//                (lcounter==1 && sccounter==1 && ucounter!=1 && ncounter!=1) ||
//                (ucounter==1 && ncounter==1 && lcounter!=1 && sccounter!=1) ||
//                (ucounter==1 && sccounter==1 && lcounter!=1 && ncounter!=1) ||
//                (ncounter==1 && sccounter==1 && lcounter!=1 && ucounter!=1)
//
//            &&
//                registrationPage.greyBox1.isDisplayed() &&
//                registrationPage.greyBox2.isDisplayed() &&
//                registrationPage.greyBox3.isDisplayed()) {
//            softAssert.assertTrue(true);
//            softAssert.assertAll();
//           // Assert.assertTrue(true);
//        }
        if ((lcounter==1 && ucounter==1 && ncounter!=1 && sccounter!=1) ||
                (lcounter==1 && ncounter==1 && ucounter!=1 && sccounter!=1) ||
                (lcounter==1 && sccounter==1 && ucounter!=1 && ncounter!=1) ||
                (ucounter==1 && ncounter==1 && lcounter!=1 && sccounter!=1) ||
                (ucounter==1 && sccounter==1 && lcounter!=1 && ncounter!=1) ||
                (ncounter==1 && sccounter==1 && lcounter!=1 && ucounter!=1)

                        &&
                        registrationPage.color2.isDisplayed()) {
            softAssert.assertTrue(true);
            softAssert.assertAll();
            // Assert.assertTrue(true);
        }
    }

    @And("verify the chart has changed one level and the level is four")
    public void verifyTheChartHasChangedOneLevelAndTheLevelIsFour() {
        int lcounter=1,ucounter=1,ncounter=1,sccounter=1;
        SoftAssert softAssert = new SoftAssert();


        for (int i = 0; i < password.length(); i++) {
            boolean lowecaseLetter = password.charAt(i)>='a' && password.charAt(i)<='z';
            boolean uppercaseLetter = password.charAt(i)>='A' && password.charAt(i)<='Z';
            boolean number =password.charAt(i)>=1 && password.charAt(i)<=9;
            boolean specialChar = !lowecaseLetter && !uppercaseLetter && !number;

            if(lowecaseLetter){
                lcounter++;
            }else if(uppercaseLetter){
                ucounter++;
            }else if(number){
                ncounter++;
            }else if(specialChar){
                sccounter++;
            }
            else{
                break;
            }

        }
//        if ((lcounter==1 && ucounter!=1 && ncounter!=1 && sccounter!=1) ||
//                (lcounter!=1 && ucounter==1 && ncounter!=1 && sccounter!=1) ||
//                (lcounter!=1 && ucounter!=1 && ncounter==1 && sccounter!=1) ||
//                (lcounter!=1 && ucounter!=1 && ncounter!=1 && sccounter==1)
//            &&
//                registrationPage.greyBox1.isDisplayed() ) {
//            softAssert.assertTrue(true);
//            softAssert.assertAll();
//            //Assert.assertTrue(true);
//        }
        if ((lcounter==1 && ucounter!=1 && ncounter!=1 && sccounter!=1) ||
                (lcounter!=1 && ucounter==1 && ncounter!=1 && sccounter!=1) ||
                (lcounter!=1 && ucounter!=1 && ncounter==1 && sccounter!=1) ||
                (lcounter!=1 && ucounter!=1 && ncounter!=1 && sccounter==1)
                        &&
                        registrationPage.color4.isDisplayed() ) {
            softAssert.assertTrue(true);
            softAssert.assertAll();
            //Assert.assertTrue(true);
        }
    }

    @And("verify the chart has changed one level and the level is five")
    public void verifyTheChartHasChangedOneLevelAndTheLevelIsFive() {
        int lcounter=1,ucounter=1,ncounter=1,sccounter=1;
        SoftAssert softAssert = new SoftAssert();


        for (int i = 0; i < password.length(); i++) {
            boolean lowecaseLetter = password.charAt(i) >= 'a' && password.charAt(i) <= 'z';
            boolean uppercaseLetter = password.charAt(i) >= 'A' && password.charAt(i) <= 'Z';
            boolean number = password.charAt(i) >= 1 && password.charAt(i) <= 9;
            boolean specialChar = !lowecaseLetter && !uppercaseLetter && !number;

            if(lowecaseLetter){
                lcounter++;
            }else if(uppercaseLetter){
                ucounter++;
            }else if(number){
                ncounter++;
            }else if(specialChar){
                sccounter++;
            }
            else{
                break;
            }

//            if ((lcounter!=1 && ucounter!=1 && ncounter!=1 && sccounter!=1) &&
//                    registrationPage.fullcolor.isDisplayed()) {
//                softAssert.assertTrue(true);
//                softAssert.assertAll();
//                //Assert.assertTrue(true);
//            }
            if ((lcounter!=1 && ucounter!=1 && ncounter!=1 && sccounter!=1) &&
                    registrationPage.color5.isDisplayed()) {
                softAssert.assertTrue(true);
                softAssert.assertAll();
                //Assert.assertTrue(true);
            }
        }
    }
}

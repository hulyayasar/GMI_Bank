
package stepdefinitions;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_08;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;



public class US_08SD {
    US_08 uS_08ChangePassword = new US_08();


    @Given("^Go to given URL$")
    public void goToHomePage() throws PendingException {
        Driver.getDriver().get((ConfigReader.getProperty("url")));
    }

    @When("^Go to User Login$")
    public void clickSignInButton() throws PendingException {
        uS_08ChangePassword.personSignToSignInMenu.click();
        ReusableMethods.waitFor(4);
    }

    @And("^Click Login Button$")
    public void enterUsernameAndPassword() throws InterruptedException {
        uS_08ChangePassword.signInMenu.click();
        Thread.sleep(1000);
        uS_08ChangePassword.usernameTextBox.sendKeys(ConfigReader.getProperty("UserName"));
        Thread.sleep(1000);
        uS_08ChangePassword.passwordTextBox.sendKeys(ConfigReader.getProperty("CurrentPassword"));
        Thread.sleep(1000);
        uS_08ChangePassword.signInButton.click();
    }

    @When("^Click Sign In Button$")
    public void clickSignInBox() throws InterruptedException {
        Thread.sleep(1000);
        uS_08ChangePassword.AngelaCruzLink.click();

    }

    @And("^Select Password button$")
    public void clickPassword() throws InterruptedException {
        Thread.sleep(1000);
        uS_08ChangePassword.passwordSegment.click();
    }

    @Given("^To enter Current Password credential$")
    public void enterCurrentPassword() throws InterruptedException {
        Thread.sleep(1000);
        uS_08ChangePassword.currentPassword.click();
        Thread.sleep(1000);
        uS_08ChangePassword.currentPassword.sendKeys(ConfigReader.getProperty("CurrentPassword"));
    }

    @And("^To enter the Current Password in New password Box$")
    public void enterTheCurrentPasswordInNewPasswordBox() {
        uS_08ChangePassword.newPassword.sendKeys(ConfigReader.getProperty("CurrentPassword"));
    }

    @And("^To enter to Current Password in New password confirmation Box$")
    public void enterToCurrentPasswordInNewPasswordConfirmationBox() {
        uS_08ChangePassword.confirmPassword.sendKeys(ConfigReader.getProperty("CurrentPassword"));
    }
    @And("^To click to Save Button$")
    public void clickToSaveButton() throws InterruptedException {
        Thread.sleep(1000);
        uS_08ChangePassword.saveButton.click();
    }
    @And("^Assert that Save Alert Negative$")
    public void assertThatSaveAlertNegative() {
        Assert.assertFalse(uS_08ChangePassword.alert.isDisplayed());
        Driver.closeDriver();
    }
    @And("^To enter the New Password to New password box$")
    public void enterTheBasicPasswordToNewPasswordBox() {
        uS_08ChangePassword.currentPassword.sendKeys(ConfigReader.getProperty("CurrentPassword"));
        uS_08ChangePassword.newPassword.sendKeys(ConfigReader.getProperty("NewPassword"));
        uS_08ChangePassword.confirmPassword.sendKeys(ConfigReader.getProperty("CurrentPassword"));
    }
    @And("^To enter the Password with one uppercase adding to New password box$")
    public void enterThePasswordWithOneUppercaseAddingToNewPasswordBox() {
        uS_08ChangePassword.currentPassword.sendKeys(ConfigReader.getProperty("CurrentPassword"));
        uS_08ChangePassword.newPassword.sendKeys(ConfigReader.getProperty("NewPasswordWithOneUpperCase"));
        uS_08ChangePassword.confirmPassword.sendKeys(ConfigReader.getProperty("NewPasswordWithOneUpperCase"));
    }
    @And("^To enter to UpperCase Password in New password confirmation Box$")
    public void enterThePasswordNewPasswordToNewPasswordBox(){
        uS_08ChangePassword.currentPassword.sendKeys(ConfigReader.getProperty("CurrentPassword"));
        uS_08ChangePassword.newPassword.sendKeys(ConfigReader.getProperty("NewPassword"));
        uS_08ChangePassword.confirmPassword.sendKeys(ConfigReader.getProperty("NewPassword"));
    }
    @And("Assert password strength level3")
    public void assertThatLevelChart3() {
        uS_08ChangePassword.passwordStrengthlevel3.sendKeys(ConfigReader.getProperty("expectedchart3"));
        String color = uS_08ChangePassword.passwordStrengthlevel3.getCssValue("background-color");
        System.out.println(color);
        Assert.assertTrue(color.contains(ConfigReader.getProperty("lime")));
        Driver.passwordReliability();
    }
    @And("^Enter to Password with more special char adding to New password box$")
    public void enterToPasswordWithMoreSpecialCharAddingToNewPasswordBox() {
        uS_08ChangePassword.newPassword.clear();
        uS_08ChangePassword.newPassword.sendKeys(ConfigReader.getProperty("NewPasswordWithMoreSpecialChar"));
    }
    @And("Assert password strength level2")
    public void assertThatLevelChart2() {
        uS_08ChangePassword.passwordStrengthlevel2.sendKeys(ConfigReader.getProperty("expectedchart3"));
        String color = uS_08ChangePassword.passwordStrengthlevel2.getCssValue("background-color");
        System.out.println(color);
        Assert.assertTrue(color.contains(ConfigReader.getProperty("orange")));
        Driver.passwordReliability();
    }






//    @Then("^To enter the valid Password has least 7 chars to New password box$")
//    public void enterTheValidPasswordHasLeastCharsToNewPasswordBox(){
//        uS_08ChangePassword.newPassword.clear();
//        uS_08ChangePassword.newPassword.sendKeys(ConfigReader.getProperty("NewPasswordHasLeastSevenChars"));
//    }
//    @Then("^Assert password strength level4$")
//    public void assertThatLevelChart4() throws PendingException{
//        String actualchart4 = uS_08ChangePassword.passwordStrengthlevel4.getAttribute("style");
//        Assert.assertTrue(actualchart4.equals(ConfigReader.getProperty("expectedchart4")));
//    }
//    @Then("^To enter the valid  Password  has least 7 chars to New password confirmation box$")
//    public void enterTheValidPasswordHasLeastCharsToNewPasswordConfirmationBox(){
   //   uS_08ChangePassword.newPassword.clear();
//      uS_08ChangePassword.confirmPassword.sendKeys(ConfigReader.getProperty("NewPasswordHasLeastSevenChars"));
//    }
//    @Then("^Submit the save button$")
//    public void clickToSaveInButton() {
//        uS_08ChangePassword.saveButton.submit();
//    }
//    @Then("^Assert that Save Alert$")
//    public void assertThatSaveAlert() {
//        Assert.assertTrue(uS_08ChangePassword.alert.isDisplayed());
//        Driver.closeDriver();
//    }

}


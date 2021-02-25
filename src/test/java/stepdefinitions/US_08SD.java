
package stepdefinitions;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import org.testng.asserts.SoftAssert;
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
    @When("^User login$")
    public void clickSignInButton()throws PendingException {
        uS_08ChangePassword.personSignToSignInMenu.click();
        ReusableMethods.waitFor(4);
    }
    @And("^Click Account Menu$")
    public void enterUsernameAndPassword()throws PendingException {
        uS_08ChangePassword.signInMenu.click();
        uS_08ChangePassword.usernameTextBox.sendKeys(ConfigReader.getProperty("UserName"));
        uS_08ChangePassword.passwordTextBox.sendKeys(ConfigReader.getProperty("CurrentPassword"));

    }
    @When("^To click Sign In Box$")
    public void clickSignInBox() throws InterruptedException {
        Thread.sleep(1000);
        uS_08ChangePassword.signInButton.click();
    }

    @And("^Select Password button$")
    public void clickPassword()throws PendingException {
        uS_08ChangePassword.passwordSegment.click();
    }

    @Given("^To enter Current Password credential$")
    public void enterCurrentPassword() throws PendingException{
        uS_08ChangePassword.currentPassword.click();
        uS_08ChangePassword.currentPassword.sendKeys(ConfigReader.getProperty("CurrentPassword"));
    }
    @And("^To enter the Current Password in New password Box$")
    public void enterTheCurrentPasswordInNewPasswordBox() throws PendingException{
        uS_08ChangePassword.newPassword.sendKeys(ConfigReader.getProperty("CurrentPassword"));
    }
    @And("^To enter to Current Password in New password confirmation Box$")
    public void enterToCurrentPasswordInNewPasswordConfirmationBox()throws PendingException{
        uS_08ChangePassword.confirmPassword.sendKeys(ConfigReader.getProperty("CurrentPassword"));
    }
    @And("^Assert password strength level5$")
    public void assertThatLevelChart5()throws PendingException{
        String actualchart5 = uS_08ChangePassword.passwordStrengthlevel5.getAttribute("style");
        Assert.assertTrue(actualchart5==(ConfigReader.getProperty("expectedchart5")));
    }
    @And("^To click to Save Button$")
    public void clickToSaveButton()throws PendingException {
        uS_08ChangePassword.saveButton.click();
    }
    @And("^Assert that Save Alert Negative$")
    public void assertThatSaveAlertNegative() throws PendingException{
        Assert.assertTrue(uS_08ChangePassword.alertError.isDisplayed());
        Driver.closeDriver();
    }
    @And("^To enter the New Password to New password box$")
    public void enterTheBasicPasswordToNewPasswordBox() throws PendingException{
        uS_08ChangePassword.currentPassword.sendKeys(ConfigReader.getProperty("CurrentPassword"));
        uS_08ChangePassword.newPassword.sendKeys(ConfigReader.getProperty("CurrentPassword"));
    }
    @And("^To enter the Password with one uppercase adding to New password box$")
    public void enterThePasswordWithOneUppercaseAddingToNewPasswordBox()throws PendingException {
        uS_08ChangePassword.newPassword.sendKeys(ConfigReader.getProperty("NewPasswordWithOneUpperCase"));
    }
    @And("^Assert password strength level1$")
    public void assertThatLevelChart1()throws PendingException{
        String actualchart1=uS_08ChangePassword.passwordStrengthlevel1.getAttribute("style");
        Assert.assertTrue(actualchart1==(ConfigReader.getProperty("expectedchart1")));

    }
    @And("^To enter the Password with more one digit adding to New password box$")
    public void enterThePasswordWithMoreOneDigitAddingToNewPasswordBox()throws PendingException{
        uS_08ChangePassword.newPassword.clear();
        uS_08ChangePassword.newPassword.sendKeys(ConfigReader.getProperty("NewPasswordWithMoreOneDigit"));
    }
    @And("^Assert password strength level2$")
    public void assertThatLevelChart2()throws PendingException {
        String actualchart2 = uS_08ChangePassword.passwordStrengthlevel2.getAttribute("style");
        Assert.assertTrue(actualchart2==(ConfigReader.getProperty("expectedchart2")));

    }
    @And("^Enter to Password with more special char adding to New password box$")
    public void enterToPasswordWithMoreSpecialCharAddingToNewPasswordBox()throws PendingException {
        uS_08ChangePassword.newPassword.clear();
        uS_08ChangePassword.newPassword.sendKeys(ConfigReader.getProperty("NewPasswordWithMoreSpecialChar"));
    }
    @And("^Assert password strength level3$")
    public void assertThatLevelChart3() throws PendingException{
        String actualchart3 = uS_08ChangePassword.passwordStrengthlevel3.getAttribute("style");
        Assert.assertTrue(actualchart3==(ConfigReader.getProperty("expectedchart3")));
    }
    @Then("^To enter the valid Password has least 7 chars to New password box$")
    public void enterTheValidPasswordHasLeastCharsToNewPasswordBox()throws PendingException{
        uS_08ChangePassword.newPassword.clear();
        uS_08ChangePassword.newPassword.sendKeys(ConfigReader.getProperty("NewPasswordHasLeastSevenChars"));
    }
    @Then("^Assert password strength level4$")
    public void assertThatLevelChart4() throws PendingException{
        String actualchart4 = uS_08ChangePassword.passwordStrengthlevel4.getAttribute("style");
        Assert.assertTrue(actualchart4==(ConfigReader.getProperty("expectedchart4")));
    }
    @Then("^To enter the valid  Password  has least 7 chars to New password confirmation box$")
    public void enterTheValidPasswordHasLeastCharsToNewPasswordConfirmationBox() throws PendingException{
        uS_08ChangePassword.confirmPassword.sendKeys(ConfigReader.getProperty("NewPasswordHasLeastSevenChars"));
    }
    @Then("^Submit the save button$")
    public void clickToSaveInButton()throws PendingException {
        uS_08ChangePassword.saveButton.submit();
    }
    @Then("^Assert that Save Alert$")
    public void assertThatSaveAlert()throws PendingException {
        Assert.assertTrue(uS_08ChangePassword.alert.isDisplayed());
        Driver.closeDriver();
    }
    @And("Enter Personal  Account")
    public void enterPersonalAccount() throws PendingException{
        uS_08ChangePassword.AngelaCruzLink.click();
    }
}


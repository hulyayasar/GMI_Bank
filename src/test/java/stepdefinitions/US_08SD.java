package stepdefinitions;

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

    @Given("To go to Home Page")
    public void goToHomePage() {
        Driver.getDriver().get((ConfigReader.getProperty("url")));
    }
    @Given("To click Sign In Button")
    public void clickSignInButton() {
        uS_08ChangePassword.personSignToSignInMenu.click();
        ReusableMethods.waitFor(4);
        uS_08ChangePassword.signInMenu.click();
    }
    @When("To enter Username and Password with valid credential ")
    public void enterUsernameAndPassword(String string) {
        uS_08ChangePassword.usernameTextBox.sendKeys(ConfigReader.getProperty("UserName"));
        uS_08ChangePassword.passwordTextBox.sendKeys(ConfigReader.getProperty("CurrentPassword"));
    }
    @When("To click Sign In Box")
    public void clickSignInBox() throws InterruptedException {
        Thread.sleep(1000);
        uS_08ChangePassword.signInButton.click();
    }
    @And("To click Password")
    public void clickPassword() {
        uS_08ChangePassword.passwordSegment.click();
    }
    @Given("To enter Current Password with credential" +
            "" +
            "")
    public void enterCurrentPassword(String string) {
        uS_08ChangePassword.currentPassword.click();
        uS_08ChangePassword.currentPassword.sendKeys(ConfigReader.getProperty("CurrentPassword"));
    }
    @Given("To enter the Current Password in New password Box.")
    public void enterTheCurrentPasswordInNewPasswordBox() {
        uS_08ChangePassword.newPassword.sendKeys(ConfigReader.getProperty("CurrentPassword"));
    }
    @Given("To enter to Current Password in New password confirmation Box.")
    public void enterToCurrentPasswordInNewPasswordConfirmationBox() {
        uS_08ChangePassword.confirmPassword.sendKeys(ConfigReader.getProperty("CurrentPassword"));
    }
    @And("To click to Save Button.")
    public void clickToSaveButton() {
        uS_08ChangePassword.saveButton.click();
    }
    @And("Assert that Save Alert Negative")
    public void assertThatSaveAlertNegative() {
        Assert.assertTrue(uS_08ChangePassword.alertError.isDisplayed());
        Driver.closeDriver();
    }
    @And("To enter the New Password to New password box.")
    public void enterTheBasicPasswordToNewPasswordBox() {
       uS_08ChangePassword.currentPassword.sendKeys(ConfigReader.getProperty("CurrentPassword"));
        uS_08ChangePassword.newPassword.sendKeys(ConfigReader.getProperty("NewPasswordAllLowerCase"));
    }
    @And("To enter the Password with one uppercase adding to New password box.")
    public void enterThePasswordWithOneUppercaseAddingToNewPasswordBox() {
        uS_08ChangePassword.newPassword.sendKeys(ConfigReader.getProperty("NewPasswordWithOneUpperCase"));
    }
    @And("Assert password strength level1")
    public void assertThatLevelChart1(){
        String actualchart1=uS_08ChangePassword.passwordStrengthlevel1.getAttribute("style");
        Assert.assertEquals(ConfigReader.getProperty("expectedchart1"), actualchart1);
    }
    @And("To enter the Password with more one digit adding to New password box.")
    public void enterThePasswordWithMoreOneDigitAddingToNewPasswordBox(){
        uS_08ChangePassword.newPassword.clear();
        uS_08ChangePassword.newPassword.sendKeys(ConfigReader.getProperty("NewPasswordWithDigit"));
    }
    @And("Assert password strength level2")
    public void assertThatLevelChart2() {
        String actualchart2 = uS_08ChangePassword.passwordStrengthlevel1.getAttribute("style");
        Assert.assertEquals(ConfigReader.getProperty("expectedchart2"), actualchart2);
    }
    @And("14Enter to Password with more special char adding to New password box.")
    public void enterToPasswordWithMoreSpecialCharAddingToNewPasswordBox() {
        uS_08ChangePassword.newPassword.clear();
        uS_08ChangePassword.newPassword.sendKeys(ConfigReader.getProperty("NewPasswordWithSpecialChar"));
    }
    @And("Assert password strength level3")
    public void assertThatLevelChart3() {
        String actualchart3 = uS_08ChangePassword.passwordStrengthlevel1.getAttribute("style");
        Assert.assertEquals(ConfigReader.getProperty("expectedchart3"), actualchart3);
    }
    @Then("To enter the valid Password has least 7 chars to New password box.")
    public void enterTheValidPasswordHasLeastCharsToNewPasswordBox(){
        uS_08ChangePassword.newPassword.clear();
        uS_08ChangePassword.newPassword.sendKeys(ConfigReader.getProperty("CurrentPassword"));
    }
    @Then("Assert password strength level4")
    public void assertThatLevelChart4() {
        String actualchart4 = uS_08ChangePassword.passwordStrengthlevel1.getAttribute("style");
        Assert.assertEquals(ConfigReader.getProperty("expectedchart4"), actualchart4);
    }
    @Then("To enter the valid  Password  has least 7 chars to New password confirmation box.")
    public void enterTheValidPasswordHasLeastCharsToNewPasswordConfirmationBox() {
        uS_08ChangePassword.confirmPassword.sendKeys(ConfigReader.getProperty("CurrentPassword"));
    }
    @Then("To click to Save In Button")
    public void clickToSaveInButton() {
        uS_08ChangePassword.saveButton.submit();
    }

    @Then("20Assert that Save Alert.")
    public void assertThatSaveAlert() {
        Assert.assertTrue(uS_08ChangePassword.alert.isDisplayed());
        Driver.closeDriver();
    }



}
/*




@When("See Password Edit Form")
public void see_Password_Edit_Form() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Enter the {string}")
public void enter_the(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Enter a {string}")
public void enter_a(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Verify fifth level bar is displayed")
public void verify_fifth_level_bar_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Enter a {string} with at least ONE upper case char")
public void enter_a_with_at_least_ONE_upper_case_char(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Verify second level bar is displayed")
public void verify_second_level_bar_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Enter a {string} with at least ONE lower case char")
public void enter_a_with_at_least_ONE_lower_case_char(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Enter a {string} with at least ONE digit")
public void enter_a_with_at_least_ONE_digit(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Enter a {string} with at least seven character long")
public void enter_a_with_at_least_seven_character_long(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Enter the  {string} as new password")
public void enter_the_as_new_password(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Enter the {string} in Confirmation box")
public void enter_the_in_Confirmation_box(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("Click the save button")
public void click_the_save_button() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("Verify {string} message is displayed")
public void verify_message_is_displayed(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}


 */
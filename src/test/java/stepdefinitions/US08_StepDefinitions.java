package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_08Pages;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US08_StepDefinitions {
    US_08Pages us08Pages = new US_08Pages();


    @Given("^Enter username$")
    public void enterUsername() throws InterruptedException {
        us08Pages.userNameTextBox.sendKeys(ConfigReader.getProperty("UserName"));
        Thread.sleep(3);
    }
    @Given("^Enter password$")
    public void enterPassword() throws InterruptedException {
        us08Pages.passwordTextBox.sendKeys(ConfigReader.getProperty("CurrentPassword"));
        Thread.sleep(3);
    }
    @Given("^Click to account menu$")
    public void clickToAccountMenu() {
        us08Pages.AngelaCruzLink.click();
    }
    @And("^Click to password segment button$")
    public void clicksToPasswordSegment() {
        us08Pages.passwordButton.click();
    }
    @Then("^Verifies there is old password password$")
    public void verifiesBug() {
        us08Pages.currentPasswordBox.sendKeys(ConfigReader.getProperty("CurrentPassword"));
        us08Pages.newPasswordBox.sendKeys(ConfigReader.getProperty("CurrentPassword"));
        us08Pages.newPasswordConfirmationBox.sendKeys(ConfigReader.getProperty("CurrentPassword"));
        us08Pages.saveButton.click();
        ReusableMethods.waitFor(5);
        String pageText = Driver.getDriver().getPageSource();
        System.out.println(pageText);
        Assert.assertTrue(pageText.contains("Password changed"));
        System.out.println("This is bug");
    }
    @Then("Enter new passwords {string} and verifies that  should be at least one {string}")
    public void enterNewValidPasswords(String string, String string2) {
        us08Pages.currentPasswordBox.sendKeys(ConfigReader.getProperty("CurrentPassword"));
        us08Pages.newPasswordBox.sendKeys(string);
        String color = us08Pages.passwordStrengthlevel1.getCssValue("background-color");
        Assert.assertTrue(color.contains(ConfigReader.getProperty("orange")));
    }
    @Then("^Verifies new valid password confirmation$")
    public void verifiesPasswordConfirmation() {
        verifiesBug();
        System.out.println("Password change is confirmed");
    }

}



package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AfterLogin;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class us12_stepdefinitions {

    AfterLogin afterLogin = new AfterLogin();

    @Given("User goes to the home page and log in")
    public void user_goes_to_the_home_page_and_log_in() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        WebElement userIcon = Driver.getDriver().findElement(By.id("account-menu"));
        userIcon.click();
        ReusableMethods.waitFor(2);

        WebElement signIn = Driver.getDriver().findElement(By.linkText("Sign in"));
        signIn.click();
        ReusableMethods.waitFor(2);

        WebElement username = Driver.getDriver().findElement(By.id("username"));
        username.sendKeys("Team35Gmi");

        WebElement password = Driver.getDriver().findElement(By.id("password"));
        password.sendKeys("Team35Gmi");

        WebElement signInButton = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        signInButton.click();

    }

    @Then("User clicks on My Operations field")
    public void user_clicks_on_My_Operations_field() {
        afterLogin.myOperations.click();
    }

    @Then("User clicks on Manage Customers field")
    public void user_clicks_on_Manage_Customers_field() {
        afterLogin.manageCustomers.click();
    }
}

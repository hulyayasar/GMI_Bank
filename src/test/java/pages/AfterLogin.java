package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AfterLogin {
    public AfterLogin() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(linkText = "My Operations")
    public WebElement myOperations;
    @FindBy(linkText = "Manage Customers")
    public WebElement manageCustomers;
    @FindBy(linkText = "Manage Accounts")
    public WebElement manageAccounts;
}






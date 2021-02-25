package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_015Pages {
    public US_015Pages(){ PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']" )
    public WebElement userIcon;

    @FindBy(linkText = "Sign in")
    public WebElement signIn;

    @FindBy(id ="username")
    public  WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")//<button type="submit" class="btn btn-primary"><span>Sign in</span></button>bulamadi
    public WebElement signInButton;

    @FindBy(linkText = "My Operations")
    public WebElement myOperations;

    @FindBy(xpath = "a//[@href='/customer/tp-customer-accounts/75193']")
    public WebElement customerAccounts;

    @FindBy(xpath = " //a[@href=/customer/tp-customer-accounts/transfer/75193']")
    public WebElement transferMoney;

    @FindBy(xpath = "//select[@name='fromAccountId']" )
    public WebElement fromBox;

    @FindBy(xpath = "//select[@name='toAccountId']")
    public WebElement toBox;

    @FindBy(xpath = "//input[@name='balance']")
    public WebElement balanceBox;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement description;

    @FindBy(id = "make-transfer")
    public WebElement transferButton;



    @FindBy(linkText = "My Accounts")
    public WebElement myAccounts;//bunu bulamadi

    @FindBy(linkText= "View Transaction")
    public WebElement viewTransaction;

}

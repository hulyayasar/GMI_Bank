package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Loginpage {
    public Loginpage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "account-menu")
    public WebElement selectSingin;

    @FindBy(id = "login-item")
    public WebElement Sing_in;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement SinginButton;
    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public  WebElement CancelButton;

    @FindBy(xpath = "(//div[@class='alert alert-warning fade show'])[1]")
    public WebElement resetPassword;

    @FindBy(xpath = "(//a[@href='/account/register'])[2]")
    public WebElement RegisterANewAccount;

    @FindBy(xpath = "//div[@class='alert alert-danger fade show']")
    public WebElement failedToSignIn;

    @FindBy(className = "invalid-feedback")
    public WebElement emptyError;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement emptyErrorSecond;

    @FindBy(xpath = "//div//h1//span")
    public WebElement resetTitle;

    @FindBy(xpath = "//h1[@id='register-title']")
    public WebElement registrationTitle;
}

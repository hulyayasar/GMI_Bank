package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserInfoPage{


    public UserInfoPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement peopleImage;

    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    public WebElement mainSignInButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']//span[contains(text(),'Sign in')]")
    public WebElement singInButton;


    @FindBy(xpath = "//li[@id='account-menu']//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement profilImage;

    @FindBy(xpath = "//a[@href='/account/settings']")

    public WebElement userInfo;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//select[@id='langKey']")
    public WebElement language;

    //The other case
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//strong[normalize-space()='Ayarlar kaydedildi!']")
    // @FindBy(xpath = "//*[.='Ayarlar kaydedildi!']")
    public WebElement verifyTrMessage;

    @FindBy(xpath = "//strong[normalize-space()='Settings saved!']")
    //@FindBy(xpath = "//*[.='Settings saved!']")
    public WebElement verifyEngMessage;


    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement errorMessage;


}

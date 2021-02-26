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




}

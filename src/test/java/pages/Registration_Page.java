package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Registration_Page {

    public Registration_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="ssn")
    public WebElement ssn;

    @FindBy(id="firstname")
    public WebElement firstname;

    @FindBy(id="lastname")
    public WebElement lastname;

    @FindBy(id="address")
    public WebElement address;

    @FindBy(id="mobilephone")
    public WebElement mobilephone;

    @FindBy(id="username")
    public WebElement username;

    @FindBy(id="email")
    public WebElement email;

    @FindBy(id = "firstPassword")
    public WebElement firstPasswordTextbox;

    @FindBy(id = "secondPassword")
    public WebElement newPasswordTextbox;

    @FindBy(id = "register-submit")
    public WebElement registerButton;

    @FindBy(xpath = "//*[contains(text(),'translation-not-foun'")
    public WebElement toastContainer;












}

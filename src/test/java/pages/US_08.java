package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_08 {
    public US_08 (){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath="//a[@href='#']")
    public WebElement personSignToSignInMenu;

    @FindBy (xpath = "//a[@id='login-item']")
    public WebElement signInMenu;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    @FindBy (xpath="//span[contains(text( ),'Angela Cruz')]")
   public WebElement AngelaCruzLink;

    @FindBy (xpath="//span[contains(text( ),'Password')]")
    public WebElement passwordSegment;

    @FindBy (xpath="//input[@name='currentPassword']")
    public WebElement currentPassword;

    @FindBy( xpath = "//input[@name='newPassword']")
    public WebElement newPassword;

    @FindBy (xpath = "//li[@class='point'][1]")
    public WebElement passwordStrengthlevel1;

    @FindBy (xpath = "//li[@class='point'][2]")
   public WebElement passwordStrengthlevel2;

   @FindBy (xpath = "//li[@class='point'][3]")
    public WebElement passwordStrengthlevel3;

    @FindBy (xpath = "//li[@class='point'][4]")
    public WebElement passwordStrengthlevel4;

//    @FindBy (xpath = "//li[@class='point'][5]")
//    public WebElement passwordStrengthlevel5;
    @FindBy(xpath = "//li[@style='background-color: rgb(0, 255, 0);'][5]")
    public WebElement passwordStrengthlevel5;
   @FindBy (xpath = "//input[@name='confirmPassword']")
    public WebElement confirmPassword;

    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast--success toastify-toast']")
    public WebElement alert;

    @FindBy(xpath = "//div[@class='Toastify__toast-body']")
    public WebElement alertError;

    @FindBy(xpath = "/html/body/div/div/div/div[3]/div[1]/div/div/div/div/div/form/button")
    public WebElement saveButton;
}


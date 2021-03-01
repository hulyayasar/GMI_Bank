package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NewPasswordPage {
    public NewPasswordPage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userNameTextBox ;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordTextBox ;

    @FindBy (xpath="//span[contains(text( ),'Angela Cruz')]")
    public WebElement AngelaCruzLink;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/nav/div/ul/li[9]/div/a[2]/span")
    public WebElement passwordButton;

    @FindBy(id = "currentPassword")
    public WebElement currentPasswordBox;

    @FindBy(id = "newPassword")
    public WebElement   newPasswordBox;

    @FindBy(id = "confirmPassword")
    public WebElement   newPasswordConfirmationBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement   saveButton;

    @FindBy(xpath= "//li[@class='point'][1]")
    public WebElement  passwordStrengthlevel1;

    @FindBy (xpath = "//li[@class='point'][4]")
    public WebElement passwordStrengthlevel4;


}



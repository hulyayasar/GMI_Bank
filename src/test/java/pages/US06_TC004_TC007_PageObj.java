package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US06_TC004_TC007_PageObj {

    public US06_TC004_TC007_PageObj() {

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lastName;

    @FindBy(xpath = "//select[@id='langKey']")
    public WebElement language;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//strong[normalize-space()='Ayarlar kaydedildi!']")
   // @FindBy(xpath = "//*[.='Ayarlar kaydedildi!']")
    public WebElement verifyTrMessage;

    // @FindBy(xpath = "//strong[normalize-space()='Settings saved!']")
    @FindBy(xpath = "//strong[normalize-space()='Settings saved!']")
    public WebElement verifyEngMessage;

    @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;




}

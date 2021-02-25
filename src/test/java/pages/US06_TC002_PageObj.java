package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.WeakHashMap;

public class US06_TC002_PageObj {

    public US06_TC002_PageObj() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//select[@id='langKey']")
    public WebElement language;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement saveButton;

    @FindBy(xpath = "//strong[normalize-space()='Ayarlar kaydedildi!']")
   // @FindBy(xpath = "//*[.='Ayarlar kaydedildi!']")
    public WebElement verifyTrMessage;

   @FindBy(xpath = "//strong[normalize-space()='Settings saved!']")
    //@FindBy(xpath = "//*[.='Settings saved!']")
    public WebElement verifyEngMessage;


}

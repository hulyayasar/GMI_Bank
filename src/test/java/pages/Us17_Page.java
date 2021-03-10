package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


    public class Us17_Page {

        public Us17_Page() {

            PageFactory.initElements(Driver.getDriver(), this);
        }


        @FindBy(xpath = "//*[.='Administration']")
        public WebElement administrationLink;
        @FindBy(xpath = "//*[.='User management']")
        public WebElement userManagementButton;
        @FindBy(xpath = "(//button[@class='btn btn-success'])[1]")
        public WebElement activateButton;
        @FindBy(xpath = "(//button[@class='btn btn-danger'])[1]")
        public WebElement deActivateButton;
        @FindBy(xpath = "//tbody/tr[1]/td[6]")
        public WebElement checkRole;
        @FindBy(xpath="//dd[1]//span[1]")
        public WebElement userName1;
        @FindBy(xpath="//dd[1]//span[1]")
        public WebElement userName;
        @FindBy(xpath = "//input[@name='login']")
        public WebElement userEditLogin;
        @FindBy(xpath = "//input[@name='firstName']")
        public WebElement userEditFirstName;
        @FindBy(xpath = "//input[@name='lastName']")
        public WebElement userEditLastName;
        @FindBy(xpath = "//button[@type='submit']")
        public WebElement userEditSaveButton;
        @FindBy(xpath=("//body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[10]/div[1]/a[3]/span[1]/span[1]"))
        public WebElement deleteButton;
        @FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/button[2]")
        public WebElement deletes;


    }




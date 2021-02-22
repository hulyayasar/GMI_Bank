package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ManageCustomers {
    public ManageCustomers() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//tbody//*//td[2]")
    public List<WebElement> firstNames;

    @FindBy(xpath = "//tbody//*//td[3]")
    public List<WebElement> lastNames;

    @FindBy(xpath = "//tbody//*//td[4]")
    public List<WebElement> middleInitials;

    @FindBy(xpath = "//tbody//*//td[5]")
    public List<WebElement> emails;

    @FindBy(xpath = "//tbody//*//td[6]")
    public List<WebElement> mobilePhoneNumbers;

    @FindBy(xpath = "//tbody//*//td[7]")
    public List<WebElement> phoneNumbers;

    @FindBy(xpath = "//tbody//*//td[8]")
    public List<WebElement> addresses;

    @FindBy(xpath = "//tbody//*//td[9]")
    public List<WebElement> createDates;

    @FindBy(xpath = "//tbody/tr[1]/td[10]/div[1]/a[1]")
    public WebElement viewButton;

    @FindBy(xpath= "//tbody//tr[1]//td[1]//a[@class='btn btn-success btn-sm']")
    public WebElement firstIDOnThePage;

    @FindBy(linkText = "Back")
    public WebElement backButton;
}

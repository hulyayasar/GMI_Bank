package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ManageCustomerPage {
    public ManageCustomerPage() {
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

//    @FindBy(linkText = "Back")
    @FindBy(xpath = "//span[contains(text(),'Back')]")
    public WebElement backButton;

//    @FindBy(xpath = "//body/div[@id='root']/div/div/div[@id='app-view-container']/div/div/div/div/div/a[1]")
//    public WebElement backButton;

    @FindBy(linkText = "Edit")
    public WebElement editButton;

    @FindBy(id = "tp-customer-firstName")
    public WebElement editFirstName;

    @FindBy(id = "tp-customer-lastName")
    public WebElement editLastName;

    @FindBy(id = "tp-customer-middleInitial")
    public WebElement editMiddleInitial;

    @FindBy(id = "tp-customer-email")
    public WebElement editEmail;

    @FindBy(id = "tp-customer-mobilePhoneNumber")
    public WebElement editMobilePhoneNumber;

    @FindBy(id = "tp-customer-phoneNumber")
    public WebElement editPhoneNumber;

    @FindBy(id = "tp-customer-zipCode")
    public WebElement editZipCode;

    @FindBy(id = "tp-customer-address")
    public WebElement editAddress;

    @FindBy(id = "tp-customer-city")
    public WebElement editCity;

    @FindBy(id = "tp-customer-zelleEnrolled")
    public WebElement editZelleEnrolled;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@role='alert']")
    public WebElement successAlert;

    @FindBy(xpath = "//tbody/tr[8]/td[10]/div[1]/a[3]")
    public WebElement mainDeleteButton;

    @FindBy(xpath = "//button[@class='btn btn-secondary']")
    public WebElement cancelButtonOnDeletion;

    @FindBy(id = "jhi-confirm-delete-tPCustomer")
    public WebElement deleteButtonOnDeletion;
}

package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import java.util.List;
public class CreateNewAccountPage {
    public CreateNewAccountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Create a new Account")
    public WebElement createANewAccount;
    @FindBy(id = "tp-account-description")
    public WebElement description;
    @FindBy(className = "invalid-feedback")
    public WebElement descRequired;
    @FindBy(className = "invalid-feedback")
    public WebElement balRequired;
    @FindBy(name = "balance")
    public WebElement balance;
    @FindBy(id = "tp-account-accountType")
    public WebElement accountType;
    @FindBy(id = "tp-account-accountStatusType")
    public WebElement accountStatusType;
    @FindBy(id = "tp-account-createDate")
    public WebElement createDate;
    @FindBy(id = "tp-account-closedDate")
    public WebElement closedDate;
    @FindBy(id = "tp-account-employee")
    public WebElement accountEmployee;
    @FindBy(id = "save-entity")
    public WebElement saveButton;
    @FindBy(xpath = "//tbody//tr[*]//td[2]")
    public List<WebElement> accountList;
}
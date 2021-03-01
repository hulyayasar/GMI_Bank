package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CreateNewCustomerPage {
    public CreateNewCustomerPage (){PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy(id = "tp-customer-firstName")
    public WebElement firstName;

    @FindBy(id = "tp-customer-lastName")
    public WebElement lastName;

    @FindBy(id = "tp-customer-middleInitial")
    public WebElement middleInitial;

    @FindBy(id = "tp-customer-email")
    public WebElement email;

    @FindBy(id = "tp-customer-mobilePhoneNumber")
    public WebElement mobilePhoneNumber;

    @FindBy(id = "tp-customer-phoneNumber")
    public WebElement phoneNumber;

    @FindBy(id = "tp-customer-zipCode")
    public WebElement zipCode;

    @FindBy(id = "tp-customer-address")
    public WebElement address;

    @FindBy(id = "tp-customer-city")
    public WebElement city;

    @FindBy(id = "tp-customer-ssn")
    public WebElement ssn;

    @FindBy(id = "tp-customer-country")
    public WebElement country;

    @FindBy(id = "tp-customer-state")
    public WebElement state;

    @FindBy(id = "save-entity")
    public WebElement saveButton;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement EmptyError1;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[2]")
    public WebElement EmptyError2;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement EmptyError3;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[4]")
    public WebElement EmptyError4;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement EmptyError5;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[6]")
    public WebElement EmptyError6;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement EmptyError7;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[8]")
    public WebElement EmptyError8;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[9]")
    public WebElement EmptyError9;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[10]")
    public WebElement EmptyError10;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[11]")
    public WebElement EmptyError11;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[12]")
    public WebElement EmptyError12;

    public WebElement errorMethod(int i){

        if(i==1){
            return EmptyError1 ;
        }else if(i==2){
            return EmptyError2;
        }else if(i==3){
            return EmptyError3;
        }else if(i==4){
            return EmptyError4;
        }else if(i==5){
            return EmptyError5;
        }else if(i==6){
            return EmptyError6;
        }else if(i==7){
            return EmptyError7;
        }else if(i==8){
            return EmptyError8;
        }else if(i==9){
            return EmptyError9;
        }else if(i==10){
            return EmptyError10;
        }else if(i==11){
            return EmptyError11;
        }else if(i==12){
            return EmptyError12;
        }else {
            return EmptyError1;
        }

    }
    @FindBy(name="createDate")
    public WebElement date;

    @FindBy(id="tp-customer-user")
    public WebElement userDropdown;

    @FindBy(id = "tp-customer-account")
    public  WebElement account;

    @FindBy(id = "tp-customer-zelleEnrolled")
    public WebElement checkBoxZelle;


    @FindBy(linkText = "Create a new Customer")
    public WebElement createANewCustomer ;
    //<input name="search-ssn" placeholder="000-00-0000" id="search-ssn" type="text" class="form-control is-touched is-pristine av-valid form-control" value="">
    @FindBy(xpath = "//input[@id='search-ssn']")
    public WebElement searchCustomer;
    //<button type="button" class="btn btn-secondary">Search</button>
    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement searchButton;



}
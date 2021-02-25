package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class US_09Pages {
 public US_09Pages(){
 PageFactory.initElements(Driver.getDriver(),this);
}
 @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']" )
  public WebElement userIcon;

  @FindBy(linkText = "Sign in")
  public WebElement signIn;

  @FindBy(id ="username")
  public  WebElement username;

  @FindBy(id = "password")
  public WebElement password;

  @FindBy(xpath = "//button[@type='submit']")
  public WebElement signInButton;

  @FindBy(linkText = "My Operations")
   public WebElement myOperations;

  @FindBy(linkText = "Manage Customers")
  public WebElement manageCustomers;

  @FindBy(linkText = "Create a new Customer")
  public WebElement createANewCustomer ;

 @FindBy(id = "search-ssn")
  public WebElement searchCustomer;
//
 @FindBy(linkText = "Search")
  public WebElement searchButton;
//<button type="button" class="btn btn-secondary">Search</button>
//<button type="button" class="btn btn-secondary">Search</button>

}

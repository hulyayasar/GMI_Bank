package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class US_09Pages {
 public US_09Pages(){
 PageFactory.initElements(Driver.getDriver(),this);
}



  @FindBy(linkText = "Create a new Customer")
  public WebElement createANewCustomer ;
//<input name="search-ssn" placeholder="000-00-0000" id="search-ssn" type="text" class="form-control is-touched is-pristine av-valid form-control" value="">
 @FindBy(xpath = "//input[@id='search-ssn']")
  public WebElement searchCustomer;
//<button type="button" class="btn btn-secondary">Search</button>
@FindBy(xpath = "//button[normalize-space()='Search']")
public WebElement searchButton;

}

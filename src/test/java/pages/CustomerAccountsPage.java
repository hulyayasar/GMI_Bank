package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CustomerAccountsPage {
    public CustomerAccountsPage(){ PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "a//[@href='/customer/tp-customer-accounts/75193']")
    public WebElement customerAccounts;



    @FindBy(xpath = "//select[@name='fromAccountId']" )
    public WebElement fromBox;

    @FindBy(xpath = "//select[@name='toAccountId']")
    public WebElement toBox;

    @FindBy(xpath = "//input[@name='balance']")
    public WebElement balanceBox;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement description;

    @FindBy(id = "make-transfer")
    public WebElement transferButton;



    @FindBy(xpath = "//a[@class='d-flex align-items-center dropdown-toggle nav-link']")
    public WebElement dropdown;

    @FindBy(xpath = "(//*[.='View Transaction'])[1]")
    public WebElement viewTransaction ;
   // @FindBy(linkText= "View Transaction")
    //public WebElement viewTransaction;
//<a class="dropdown-item" tabindex="0" role="menuitem" href="/customer/tp-customer-accounts/74742">My Accounts</a>
    //<a aria-haspopup="true" href="#" class="d-flex align-items-center dropdown-toggle nav-link" aria-expanded="true" style="color: rgb(255, 255, 255);"><svg aria-hidden="true" focusable="false" data-prefix="fas" data-icon="th-list" class="svg-inline--fa fa-th-list fa-w-16 " role="img" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path fill="currentColor" d="M149.333 216v80c0 13.255-10.745 24-24 24H24c-13.255 0-24-10.745-24-24v-80c0-13.255 10.745-24 24-24h101.333c13.255 0 24 10.745 24 24zM0 376v80c0 13.255 10.745 24 24 24h101.333c13.255 0 24-10.745 24-24v-80c0-13.255-10.745-24-24-24H24c-13.255 0-24 10.745-24 24zM125.333 32H24C10.745 32 0 42.745 0 56v80c0 13.255 10.745 24 24 24h101.333c13.255 0 24-10.745 24-24V56c0-13.255-10.745-24-24-24zm80 448H488c13.255 0 24-10.745 24-24v-80c0-13.255-10.745-24-24-24H205.333c-13.255 0-24 10.745-24 24v80c0 13.255 10.745 24 24 24zm-24-424v80c0 13.255 10.745 24 24 24H488c13.255 0 24-10.745 24-24V56c0-13.255-10.745-24-24-24H205.333c-13.255 0-24 10.745-24 24zm24 264H488c13.255 0 24-10.745 24-24v-80c0-13.255-10.745-24-24-24H205.333c-13.255 0-24 10.745-24 24v80c0 13.255 10.745 24 24 24z"></path></svg><span>My Operations</span></a>
}
//<a class="dropdown-item" tabindex="0" role="menuitem" href="/customer/tp-customer-accounts/transfer/75193">Transfer Money</a>
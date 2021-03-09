package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CustomerAccountsPage {
    public CustomerAccountsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "a//[@href='/customer/tp-customer-accounts/75193']")
    public WebElement customerAccounts;


    @FindBy(xpath = "//select[@name='fromAccountId']")
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


    @FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
    public WebElement viewTransaction;
}



//<a class="dropdown-item" tabindex="0" role="menuitem" href="/customer/tp-customer-accounts/transfer/75193">Transfer Money</a>


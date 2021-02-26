package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Registration_Page {

    public Registration_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="ssn")
    public WebElement ssn;

    @FindBy(id="firstname")
    public WebElement firstname;

    @FindBy(id="lastname")
    public WebElement lastname;

    @FindBy(id="address")
    public WebElement address;

    @FindBy(id="mobilephone")
    public WebElement mobilephone;

    @FindBy(id="username")
    public WebElement username;

    @FindBy(id="email")
    public WebElement email;

    @FindBy(id = "firstPassword")
    public WebElement firstPasswordTextbox;

    @FindBy(id = "secondPassword")
    public WebElement newPasswordTextbox;

    @FindBy(id = "register-submit")
    public WebElement registerButton;

    @FindBy(xpath = "//*[contains(text(),'translation-not-foun'")
    public WebElement toastContainer;

    @FindBy(xpath = "(//li[@style='background-color: rgb(221, 221, 221);'])[1]")
    public WebElement greyBox1;

    @FindBy(xpath = "(//li[@style='background-color: rgb(221, 221, 221);'])[2]")
    public WebElement greyBox2;

    @FindBy(xpath = "(//li[@style='background-color: rgb(221, 221, 221);'])[3]")
    public WebElement greyBox3;

    @FindBy(xpath = "(//li[@style='background-color: rgb(221, 221, 221);'])[4]")
    public WebElement greyBox4;

    @FindBy(xpath = "//li[@style='background-color: rgb(0, 255, 0);']")
    public WebElement fullcolor;

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

    public WebElement errorsMethod(int i){

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
        }else {
            return EmptyError1;
        }

    }

    @FindBy(id="register-form")
    public WebElement register_form;

    @FindBy(xpath = "(//li[@style='background-color: rgb(255, 0, 0);']")
    public WebElement color1;

    @FindBy(xpath = "(//li[@style='background-color: rgb(255, 153, 0);']")
    public WebElement color2;

    @FindBy(xpath = "(//li[@style='background-color: rgb(255, 255, 0);']")
    public WebElement color3;

    @FindBy(xpath = "(//li[@style='background-color: rgb(153, 255, 0);']")
    public WebElement color4;

    @FindBy(xpath = "(//li[@style='background-color: rgb(0, 255, 0);']")
    public WebElement color5;


}

package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.NewPasswordPage;
import pages.Us17_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class us17_StepDefinitions {


    Us17_Page us17_page=new Us17_Page();
    NewPasswordPage newPasswordPage=new NewPasswordPage();
    String userName;
    String checkrole=String.valueOf(us17_page.checkRole);
    @Given("^Enter adminUsername$")
    public void enter_adminUsername() {
        newPasswordPage.userNameTextBox.sendKeys(ConfigReader.getProperty("adminUsername"));
    }
    @Given("^Enter adminPassword$")
    public void enter_adminPassword() {
        newPasswordPage.passwordTextBox.sendKeys(ConfigReader.getProperty("adminPassword"));
    }
    @Then("^click Administration Menu$")
    public void click_Administration_Menu() {
        us17_page.administrationLink.click();
        us17_page.userManagementButton.click();
    }
//    @Given("^Check Profiles as ROLE_USER$")
//    public void check_Profiles_as_ROLE_USER() {
//        Assert.assertEquals(us17_page.checkRole.getText(), "ROLE_USER");
//        System.out.println("First role is Role_User");
//        ReusableMethods.waitFor(2);
//    }
//    @Given("^check Profiles as ROLE_EMPLOYEE$")
//    public void check_Profiles_as_ROLE_EMPLOYEE() {
//        Assert.assertEquals(us17_page.checkRole.getText(), "ROLE_EMPLOYEE");
//        System.out.println("First role is Role_Employee");
//        ReusableMethods.waitFor(2);
//    }
//    @Given("^Check Profiles as ROLE_MANAGER$")
//    public void check_Profiles_as_ROLE_MANAGER() {
//        Assert.assertEquals(us17_page.checkRole.getText(), "ROLE_MANAGER");
//        System.out.println("First role is Role_Manager");
//        ReusableMethods.waitFor(2);
//    }
//    @Given("^Check Profiles as ROLE_ADMIN$")
//    public void check_Profiles_as_ROLE_ADMIN() {
//        Assert.assertEquals(us17_page.checkRole.getText(), "ROLE_ADMIN");
//        System.out.println("First role is Role_Admin");
//        ReusableMethods.waitFor(2);
//    }
    @Given("check Profiles")
        public void check_profile() {


        switch (checkrole) {
            case "User":
                Assert.assertEquals(us17_page.checkRole.getText(), "ROLE_USER");
                System.out.println("First role is Role_User");
                ReusableMethods.waitFor(2);
                break;
            case "Employee":
                Assert.assertEquals(us17_page.checkRole.getText(), "ROLE_EMPLOYEE");
                System.out.println("First role is Role_Employee");
                ReusableMethods.waitFor(2);
                break;
            case "Manager":
                Assert.assertEquals(us17_page.checkRole.getText(), "ROLE_MANAGER");
                System.out.println("First role is Role_Manager");
                ReusableMethods.waitFor(2);
                break;
            case "Admin":
                Assert.assertEquals(us17_page.checkRole.getText(), "ROLE_ADMIN");
                System.out.println("First role is Role_Admin");
                break;

        }
    }
    @Then("^admin deActivates method$")
    public void admin_deActivate_method() {

        if (us17_page.deActivateButton.isSelected()) {
            Assert.assertEquals(us17_page.deActivateButton.getText(), "Deactivated");
        } else if (us17_page.activateButton.isSelected()) {
            {
                ReusableMethods.waitFor(1);
            }
        } else {
            us17_page.activateButton.click();
            ReusableMethods.waitFor(1);
        }
    }
    @Then("^admin activates method$")
    public void admin_activate_method() {

        if (us17_page.activateButton.isSelected()) {
            Assert.assertEquals(us17_page.activateButton.getText(), "Activated");
        } else if (us17_page.deActivateButton.isSelected()) {
            {
                ReusableMethods.waitFor(1);
            }
        } else {
            us17_page.deActivateButton.click();
            ReusableMethods.waitFor(1);
        }
    }
    @And("^admin asserts activation$")
            public void admin_asserts_activation(){

            Assert.assertTrue(us17_page.successPopup.isDisplayed());
        }

        @Given("admin clicks on view button {string}")
        public void admin_click_on_view_button(String string) {
           userName=Driver.getDriver().findElement(By.xpath("(//*[contains(text(),'" + string + "')]//..//..//..//td[2])[1]")).getText();
            us17_page.userViewButton.click();
        }
        @Then("^admin asserts all information$")
        public void verify_admin_is_on_view_page() {
            ReusableMethods.waitForVisibility(us17_page.userName, 60);
            Assert.assertEquals(us17_page.userName1.getText(), userName.toString());
        }
        @Given("admin clicks on edit button {string}")
        public void admin_click_on_edit_button(String string) throws InterruptedException {
            Thread.sleep(10);
            WebElement userEditButton=Driver.getDriver().findElement(By.xpath("//tbody//tr//td[6]//*[contains(text(),'" + string + "')]//..//..//..//td[10]//a[2]"));
            Thread.sleep(10);
            userEditButton.click();
        }
        @Given("^admin changes all user info$")
        public void admin_change_the_profile_to_ADMIN() {
            us17_page.userEditLogin.sendKeys("e");
            us17_page.userEditFirstName.sendKeys("e");
            us17_page.userEditLastName.sendKeys("e");
            userName=us17_page.userEditLogin.getAttribute("value");
            us17_page.userEditSaveButton.click();
        }
        @Given("^User clicks on Delete button on a user$")
        public void user_clicks_on_Delete_button_on_a_user() {
            us17_page.deleteButton.click();
            ReusableMethods.waitFor(2);
        }
        @Given("^User confirms the deletes$")
        public void user_confirms_the_deletion() {
            Assert.assertTrue(us17_page.deletes.isDisplayed());
        }
        @Then("Admin deletes user")
        public void deleteUser(){
            us17_page.deletes.click();
        }
    }




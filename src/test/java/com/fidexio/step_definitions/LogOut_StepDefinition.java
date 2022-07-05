package com.fidexio.step_definitions;

import com.fidexio.pages.HomePage;
import com.fidexio.pages.LogOutPage;
import com.fidexio.pages.LoginBasePage;
import com.fidexio.utilities.BrowserUtils;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class LogOut_StepDefinition {

    HomePage homePage = new HomePage();
    LoginBasePage loginBasePage = new LoginBasePage();
    LogOutPage logOutPage = new LogOutPage();


    @And("User is navigate to fidexio home page")
    public void user_is_navigate_to_fidexio_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @And("User enters valid {string} to username field")
    public void user_enters_valid_to_username_field(String string) {
        loginBasePage.userName.sendKeys(string);
    }

    @And("user enters valid {string} to password field")
    public void user_enters_valid_to_password_field(String string) {
        loginBasePage.password.sendKeys(string);
    }

    @And("User click on Login button")
    public void user_click_on_login_button() {
        loginBasePage.loginButton.click();

    }

    @When("User click Log Out button")
    public void user_click_log_out_button() {
        Select dropdown = new Select( logOutPage.menuOption5);
        dropdown.getAllSelectedOptions();

    }

   /* @Then("After logout User should see on the login page {string}")


    public void after_logout_user_should_see_on_the_login_page(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    */


}

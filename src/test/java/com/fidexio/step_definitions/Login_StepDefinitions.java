package com.fidexio.step_definitions;

import com.fidexio.pages.HomePage;
import com.fidexio.pages.LoginBasePage;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.cy_gb.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginBasePage loginBasePage = new LoginBasePage();
    HomePage homePage = new HomePage();

    @Given("User is on fidexio home page")
    public void user_is_on_fidexio_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
       // Driver.getDriver().get("https://qa.fidexio.com");
    }

    @Given("user should see {string}")
    public void user_should_see(String string) {

    }


    @When("user enters {string} to username field")
    public void user_enters_to_username_field(String string) {
        loginBasePage.userName.sendKeys(string);

    }

    @When("user enters {string} to password field")
    public void user_enters_to_password_field(String string) {
        loginBasePage.password.sendKeys(string);
    }

    @Then("user click on Login button")
    public void user_click_on_login_button() {
        loginBasePage.loginButton.click();

    }

    @Then("user should on the home #Inbox page {string}")
    public void user_should_on_the_home_ınbox_page(String string) {
        String expectedTitle = "Congratulations, your inbox is empty";
        String actualTitle = homePage.homePageTitle.getText();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("user should see on the login page {string}")
    public void user_should_see_on_the_login_page(String string) {
        String expectedMessage = "Wrong login/password";
        String actualMessage = homePage.wrongMessage.getText();
        System.out.println(actualMessage);
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Then("user should see on the login page {string} if the password is empty")
    public void user_should_see_on_the_login_page_if_the_password_is_empty(String string) {
        String expectedMessageEmptyUser = "Lütfen bu alanı doldurun.";
        String actualMessageEmptyUser = loginBasePage.password.getAttribute("validationMessage");
        System.out.println(actualMessageEmptyUser);

        Assert.assertEquals(expectedMessageEmptyUser, expectedMessageEmptyUser);

    }

    @Then("user should see on the login page {string} if the username is empty")
    public void user_should_see_on_the_login_page_if_the_username_is_empty(String string) {
        String expectedMessageEmptyPassword = "Lütfen bu alanı doldurun.";
        String actualMessageEmptyPassword = loginBasePage.userName.getAttribute("validationMessage");
        System.out.println(actualMessageEmptyPassword);

        Assert.assertEquals(expectedMessageEmptyPassword, actualMessageEmptyPassword);
    }

    @When("user click reset password button")
    public void user_click_reset_password_button() {
        loginBasePage.resetPassword.click();
    }
    @Then("user should go to the Reset password link")
    public void user_should_go_to_the_reset_password_link() {
        String expectedTitle="Reset password | Best solution for startups";
        String actualTitle= Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("User should see the password in bullet signs by default")
    public void user_should_see_the_password_in_bullet_signs_by_default() {
        String expectedType = "password";
        String actualType = loginBasePage.password.getAttribute("type");
        Assert.assertEquals(expectedType, actualType);
    }





}

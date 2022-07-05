package com.fidexio.step_definitions;

import com.fidexio.pages.HomePage;
import com.fidexio.pages.LoginBasePage;
import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitionsValid {

    LoginBasePage loginBasePage = new LoginBasePage();
    HomePage homePage = new HomePage();

    @Given("User is on fidexio home page")
    public void user_is_on_fidexio_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
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

}

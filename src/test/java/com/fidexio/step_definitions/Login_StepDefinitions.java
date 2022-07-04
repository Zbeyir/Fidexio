package com.fidexio.step_definitions;

import com.fidexio.utilities.ConfigurationReader;
import com.fidexio.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    @Given("User is on fidexio home page")
    public void user_is_on_fidexio_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @Given("user should see nnnn")
    public void user_should_see_nnnn() {

    }
    @When("user enters {string} to username field")
    public void user_enters_to_username_field(String string) {

    }
    @When("user enters {string} to password field")
    public void user_enters_to_password_field(String string) {

    }
    @Then("user click on Login button")
    public void user_click_on_login_button() {

    }




}

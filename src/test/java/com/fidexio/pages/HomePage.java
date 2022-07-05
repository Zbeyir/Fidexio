package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "o_thread_title")
    public WebElement homePageTitle;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongMessage;


}

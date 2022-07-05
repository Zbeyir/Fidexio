package com.fidexio.pages;

import com.fidexio.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
    public LogOutPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//ul[@class='dropdown-menu'])[2]/li[6]/a")
    public WebElement posManager;

    @FindBy(xpath = "(//ul[@class='dropdown-menu'])[2]/li[6]/a")
    public WebElement menuOption5;


}

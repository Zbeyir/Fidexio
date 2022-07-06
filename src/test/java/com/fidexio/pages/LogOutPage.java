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
    public WebElement menuOption5;

    @FindBy(xpath = "//ul[@class='dropdown-menu']")
    public WebElement dropDown;


    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement poss;

    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement logout;

    @FindBy(xpath = "//div[@class='o_dialog_warning modal-body']")
    public WebElement afterLogoutWrongMessage;


}

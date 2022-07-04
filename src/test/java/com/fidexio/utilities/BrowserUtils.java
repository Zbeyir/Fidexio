package com.fidexio.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserUtils {
       /*
    This method will accept int (in seconds) and execute Thread.sleep for given duration
     */

    public static void sleep(int second) {
        second *= 1000;

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }

    }


    /*
     This method accepts 3 arguments.
        Arg1: webdriver
        Arg2: expectedInUrl : for verify if the url contains given String.
            - If condition matches, will break loop.
        Arg3: expectedInTitle to be compared against actualTitle
     */
    public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle) {
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowHandles) {
            Driver.getDriver().switchTo().window(each);

            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }

        }


        //5. Assert: Title contains 'expectedInTitle'
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

        // Assert.assertTrue(driver.getTitle().contains("Etsy")); ===> yukarida ki daha sonra baktigimizda daha anlasilirmisss

        /*
        ###--Bunu Gürhan ile 7. gün yaptik---###
        TC #2: Create utility method
        1. Create a new class called BrowserUtils
        2. Create a method to make Task1 logic re-usable
        3. When method is called, it should switch window and verify title.


        Method info:
        • Name: switchWindowAndVerify
        • Return type: void
        • Arg1: WebDriver
        • Arg2: String expectedInUrl
        • Arg3: String expectedTitle

         */


    }


    //This method accepts a String "expectedTitle" and Asserts if it is true
    public static void verifyTitle(String expectedTitle) {

        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);

    }


    //Creating a utility method for ExplicitWait, so we don't have to repeat the lines

    public static void waitForInvisibilityOf(WebElement webElement) {
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }


    //17. gün gÜRHAN ile yaptik(WebTableStepDefinitions)--> ALLTA KI Icin--> /** sonra enter yap

    /**
     * This method will accept  A String value and verify actual URL CONTAINS THE VALUE
     *
     * @param expectedInTitle
     */
    public static void verifyURLContains(String expectedInTitle) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInTitle));
    }

    /**
     * day17
     * #day_17-Task06....dropdown task da yaptik
     * bunu----> DataTable_StepDefinitions ----> kullandik
     * This method will accept as a WebElement and
     * return all of the options' text in a List of String
     *
     * @param dropdownElement
     * @return
     */
    public static List<String> dropdownOptionsAsString(WebElement dropdownElement) {
        Select select = new Select(dropdownElement);

        //List of all ACTUAL month <options> as a web element --> 1-)burada web element halinde
        List<WebElement> actualOptionsAsWebElement = select.getOptions();

        //List of all ACTUAL month <options> as a String  --> 2-)burada String haline getirdik
        List<String> actualOptionsAsString = new ArrayList<>();

        for (WebElement each : actualOptionsAsWebElement) {
            actualOptionsAsString.add(each.getText());
        }
        return actualOptionsAsString;
    }


    /**
     *  DAY 18 WITH Gürhan.
     *  Uygulamasi---> Order_StepDefinitions class 'da.
     *  And user enters credit card type "MasterCard"......bu kisim dan esinlendik ve bunu kurduk
     *  This method will accept a group radio buttons as a List of WebElement.
     *  It will loop through the list, and click to the radio button with provided attributeValue
     */
    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue) {

        for (WebElement each : radioButtons) {

            if (each.getAttribute("value").equalsIgnoreCase(attributeValue)){
                each.click();
            }
        }

    }




}

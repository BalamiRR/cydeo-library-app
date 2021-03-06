package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {


//    public WebDriver driver;

    /**
     *  This method will accept int (in seconds) and execute Thread.sleep
    for given duration
    * */
    public static void sleeping(int second){
        second *=1000;
        try {
            Thread.sleep(second);
        }catch (InterruptedException e ) {

        }
    }

    /**
     * This method accepts 3 arguments
    arg1: Webdriver
    aRg2: expectedUrl : for verify if the url contains givern Strgin
          - if condition matches, will break loop
    arg3: expectedInTitle to be compared against actualTitle
    * */
    public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle){

        Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

        for(String each:allWindowsHandles){
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL : " + Driver.getDriver().getCurrentUrl());

            if(Driver.getDriver().getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

        //5. Assert: Title contains “Etsy”
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    /** This method accepts a String "expectedTitle" and Asserts if it is true
     * */
    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

    /**
      Creating a utility method for ExplicitWait, so we don't have to repeat the lines
     */
    public static void waitForInvisibilityOf(WebElement webElement){
        //Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }

    /**
     *This method will accept a String as expected value and verify actual URL CONTAINS the value
     *@param expectedInURL
    */
    public static void verifyURLContains(String expectedInURL){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInURL));
    }

    public static List<String> dropdownOptionsAsString(WebElement dropdownElement){

        Select select = new Select(dropdownElement);

        //List of all Actuall month <options> as a web element
        List<WebElement> actualOptionsAsWebElement = select.getOptions();

        //List of all Actual month <options> as a string
        List<String> actualOptionsAsString = new ArrayList<>();

        for(WebElement each: actualOptionsAsWebElement){
            actualOptionsAsString.add(each.getText());
        }
        return actualOptionsAsString;
    }

    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue){
        //WebElement selectCreditCard = Driver.getDriver().findElement(By.xpath("//input[@value='American Express']"));
        //selectCreditCard.click();

        for(WebElement each : radioButtons){
            if(each.getAttribute("value").equalsIgnoreCase(attributeValue)){
                each.click();
            }
        }


    }

}

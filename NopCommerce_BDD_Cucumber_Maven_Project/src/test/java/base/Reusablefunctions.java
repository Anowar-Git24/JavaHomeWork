package base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import myhooks.Hook;
import utilities.PropertyFilereader;

public class Reusablefunctions {

    static WebDriver driver;
    private static WebDriverWait wait;

    public Reusablefunctions(WebDriver driver) {
        Reusablefunctions.driver = Hook.driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Increase default wait time
    }
    
    public void navigateToWebsite() {
        try {
            String appLink = PropertyFilereader.getPropertyValue("applicationUrl");
            driver.get(appLink);
            wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));  // Ensure page load
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Get properties methods...

    // Set text on any input field
    public void setText(WebElement element, String text) {
        waitForElementToBeVisible(element);
        element.clear();
        element.sendKeys(text);
    }

    // Method to click on any element
    public static void click(WebElement element) {
        waitForElementToBeVisible(element);
        element.click();
    }

    // Waits for an element to be visible on the page
    public static void waitForElementToBeVisible(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(webDriver -> ((JavascriptExecutor) webDriver)
            .executeScript("return document.readyState").equals("complete"));
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
    }

    // Method for selecting any option from a drop down
    public void selectDropDown(WebElement element, String text) {
        waitForElementToBeVisible(element);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    // Method to get text from any element
    public String getText(WebElement element) {
        return element.getText();
    }
    
	/************** Click on element with WebElement ****************/
    public void clickOn(WebElement element, Duration timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            
            // Scroll down to the element
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            
            // Click on the element
            element.click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to close browser
    public void closeBrowser() {
        driver.quit();
    }

    public void takeScreenshot(String filepath) {
        TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
        File srcFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(filepath);
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

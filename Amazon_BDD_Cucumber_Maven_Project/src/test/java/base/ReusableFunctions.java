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
import myhooks.Hook2;
import utilities.PropertyFilereader;

public class ReusableFunctions {

    WebDriver driver;
    private WebDriverWait wait;

    public ReusableFunctions(WebDriver driver) {
        this.driver = Hook.getDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    }
    
    public void navigateToWebsite() {
        try {
            String appLink = PropertyFilereader.getPropertyValue("applicationUrl");
            driver.get(appLink);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUserNameFromProperty() {
        try {
            return PropertyFilereader.getPropertyValue("username");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getPasswordFromProperty() {
        try {
            return PropertyFilereader.getPropertyValue("password");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public String getFirstNameFromProperty() {
        try {
            return PropertyFilereader.getPropertyValue("firstname");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public String getLastNameFromProperty() {
        try {
            return PropertyFilereader.getPropertyValue("lastname");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public String getStreetNameFromProperty() {
        try {
            return PropertyFilereader.getPropertyValue("streetname");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public String getCityNameFromProperty() {
        try {
            return PropertyFilereader.getPropertyValue("cityname");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public String getStateNameFromProperty() {
        try {
            return PropertyFilereader.getPropertyValue("statename");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public String getZipCodeFromProperty() {
        try {
            return PropertyFilereader.getPropertyValue("zipcode");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public String getPhoneNumberFromProperty() {
        try {
            return PropertyFilereader.getPropertyValue("phonenumber");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public String getEmailFromProperty() {
        try {
            return PropertyFilereader.getPropertyValue("email");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Set text on any input field
    public void setText(WebElement element, String text) {
        waitForElementToBeVisible(element);
        element.clear();
        element.sendKeys(text);
    }

    // Method to click on any element
    public void click(WebElement element) {
        waitForElementToBeVisible(element);
        element.click();
    }

    // Waits for an element to be visible on the page
    public void waitForElementToBeVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
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

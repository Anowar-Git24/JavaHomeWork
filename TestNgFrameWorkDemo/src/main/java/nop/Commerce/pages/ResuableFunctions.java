package nop.Commerce.pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResuableFunctions {

	private static WebDriver driver;
	private WebDriverWait wait;
	
	public ResuableFunctions() {
		ResuableFunctions.driver=driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	public static WebDriver invokeBrowser() {
		return driver=DriverSetup.invokeBrowser();
	}
	//method to open a website
	public void openWebsite(String url) {
		driver.get(url);
	}
	//set text on any input field
	public void setText(WebElement element, String text) {
		waitForElementToBeVisible(element);
		element.clear();
		element.sendKeys(text);
	}
	//method to click on any element
	public void click(WebElement element) {
		waitForElementToBeVisible(element);
		element.click();
	}
	//waits for an element to be visible on the page
	public void waitForElementToBeVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	//method for selecting any option from a drop down
	public void selectDropDown(WebElement element, String text) {
		waitForElementToBeVisible(element);
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	//method to get text from any element
	public String getText(WebElement element) {
		return element.getText();
	}
	//method to close browser
	public void closeBrowser() {
		
		driver.quit();
	}
	public static void takeScreenshot(String filepath) {
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

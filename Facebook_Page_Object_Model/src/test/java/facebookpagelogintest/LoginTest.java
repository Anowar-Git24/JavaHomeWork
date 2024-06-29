package facebookpagelogintest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import facebookpage.LoginPage;
import utils.ScreenshotUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginTest {

    private static final Logger logger = LogManager.getLogger(LoginTest.class);
    private WebDriver driver;
    private LoginPage loginPage;
    private ScreenshotUtil screenshotUtil;

    @BeforeMethod
    public void setUp() {
       
        logger.info("Initializing ChromeDriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Optional: maximize the browser window
        driver.get("https://www.facebook.com/");
        loginPage = new LoginPage(driver);
        screenshotUtil = new ScreenshotUtil(driver);
    }

    @Test
    public void testLoginWithScreenshots() {
        try {
            logger.info("Navigating to Facebook login page");
            driver.get("https://www.facebook.com/");
            loginPage.enterEmail("mahossain3094@gmail.com");
            loginPage.enterPassword("password123");
            screenshotUtil.takeScreenshot("/Users/mdhossain/Desktop/Screenshots/login_before_click.png");
            logger.info("Taking screenshot before clicking login");
            loginPage.clickLoginButton();
            screenshotUtil.takeScreenshot("/Users/mdhossain/Desktop/Screenshots/login_after_click.png");
            logger.info("Taking screenshot after clicking login");
        } catch (Exception e) {
            logger.error("Test failed: ", e);
            throw e;
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

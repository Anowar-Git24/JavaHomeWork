package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pagesOfNopCommerce.LoginPage;
import pagesOfNopCommerce.RegisterPage;
import utils.ScreenshotUtil;

public class ScreenShotRegisterLoginTest {

    private WebDriver driver;
    private RegisterPage registerPage;
    private LoginPage loginPage;
    private ScreenshotUtil screenshotUtil;

    @BeforeMethod
    public void setUp() {
        // Set the path to the ChromeDriver executable
       // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");  // Adjust path as needed

        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Optional: maximize the browser window
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
        screenshotUtil = new ScreenshotUtil(driver);
    }

    @Test
    public void testRegisterAndLogin() {
        // Registration
        registerPage.selectGender("Male");
        registerPage.enterFirstName("MD");
        registerPage.enterLastName("Hossain");
        registerPage.selectDateOfBirth("1", "June", "1987");
        registerPage.enterEmail("mahossain3094@gmail.com");
        registerPage.enterPassword("password123");
        registerPage.enterConfirmPassword("password123");
        screenshotUtil.takeScreenshot("/Users/mdhossain/Desktop/Screenshots/register_before_click.png");
        registerPage.clickRegisterButton();
        screenshotUtil.takeScreenshot("/Users/mdhossain/Desktop/Screenshots/register_after_click.png");

        // Login
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
        loginPage.enterEmail("mahossain3094@gmail.com");
        loginPage.enterPassword("password123");
        screenshotUtil.takeScreenshot("/Users/mdhossain/Desktop/Screenshots/login_before_click.png");
        loginPage.clickLoginButton();
        screenshotUtil.takeScreenshot("/Users/mdhossain/Desktop/Screenshots/login_after_click.png");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

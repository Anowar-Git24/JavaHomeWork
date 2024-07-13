package islahiartTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import pages.SignupPage;
import utils.ScreenshotUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SignUpLoginTest {

    private static final Logger logger = LogManager.getLogger(SignUpLoginTest.class);
    private WebDriver driver;
    private SignupPage signupPage
    private ScreenshotUtil screenshotUtil;

    @BeforeMethod
    public void setUp() {
       
        logger.info("Initializing ChromeDriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Optional: maximize the browser window
        driver.get("https://www.facebook.com/");
        signupPage = new SignUpPage(driver)
        screenshotUtil = new ScreenshotUtil(driver);
    }
    @Test
    public void SignUpLoginTest () {
        // Registration
       
    	SignUpPage.enterEmail("mahossain3094@gmail.com");
    	SignUpPage.enterPassword("password123");
        registerPage.enterConfirmPassword("password123");
        registePage.clickRegisterButton();

        // Login
        driver.get("");
        loginPage.enterEmail("mahossain3094@gmail.com");
        loginPage.enterPassword("password123");
        loginPage.clickLoginButton();
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

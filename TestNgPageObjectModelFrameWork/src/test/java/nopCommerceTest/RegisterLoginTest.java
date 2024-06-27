package nopCommerceTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pagesOfNopCommerce.RegisterPage;
import pagesOfNopCommerce.LoginPage;

public class RegisterLoginTest {

    private WebDriver driver;
    private RegisterPage registerPage;
    private LoginPage loginPage;

    @BeforeMethod
    public void setUp() {
        // Update the path to the chromedriver executable as needed
       // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        registerPage = new RegisterPage(driver);
        loginPage = new LoginPage(driver);
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
        registerPage.clickRegisterButton();

        // Login
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
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

package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageStepsDefinitions {
	private static WebDriver driver;
    public final static int TIMEOUT = 5;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        driver.findElement(By.xpath("//*[@id=\\\"content\\\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/ul/li[1")).click();
    }

    @When("User enters login username {string}")
    public void user_enters_user_name(String username) {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/form/div[1]/div[1]/div/input")).sendKeys(username);
    }

    @When("User enters login password {string}")
    public void user_enters_login_password(String password) {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/form/div[1]/div[2]/div/input")).sendKeys(password);
    }

    @When("User clicks the login button")
    public void user_clicks_the_login_button() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/form/button")).click();
    }
    
    @When("user click on remember button")
    public void user_clicks_the_remember_button() {
    	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/form/div[2]/label/input")).click();
    }
    
    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        // Add logic to verify the user is logged in, e.g., check for a logout button or user profile element
        assertTrue(driver.findElement(By.id("logout-button-id")).isDisplayed());
    }    
        @After
        public void tearDown() {
            if (driver != null) {
                driver.quit();
    }
}
}
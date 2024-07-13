package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;

public class SignupPageStepsDefinitions {
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

    @Given("User is on Islahi Art signup page {string}")
    public void user_is_on_islahi_art_signup_page(String url) {
        driver.get(url);
    }

    @When("User clicks on the signup button")
    public void user_clicks_on_the_signup_button() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/ul/li[2]")).click();
    }

    @When("User enters email {string}")
    public void user_enters_email(String email) {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[3]/div/form/div/div[1]/div/input")).sendKeys(email);
    }

    @When("User enters first name {string}")
    public void user_enters_first_name(String firstName) {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[3]/div/form/div/div[2]/div/input")).sendKeys(firstName);
    }

    @When("User enters last name {string}")
    public void user_enters_last_name(String lastName) {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[3]/div/form/div/div[3]/div/input")).sendKeys(lastName);
    }

    @When("User enters password {string}")
    public void user_enters_password(String password) {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[3]/div/form/div/div[4]/div/input")).sendKeys(password);
    }

    @When("User confirms password {string}")
    public void user_confirms_password(String password) {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[3]/div/form/div/div[5]/div/input")).sendKeys(password);
    }

    @When("User accepts the Privacy Policy")
    public void user_accepts_privacy_policy() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[3]/div/form/div/div[6]/div/label/input")).click();
    }

@Then("user click on signup button")
public void user_click_on_signup_button() {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[3]/div/form/button")).click();
    }

    @Then("User should be able to successfully sign up for an account")
    public void user_should_be_able_to_successfully_sign_up_for_an_account() {
        // Check if a specific element is displayed that confirms successful signup
        boolean isSignedUp = driver.findElement(By.xpath("YOUR_XPATH_FOR_SUCCESS_MESSAGE")).isDisplayed();
        if (!isSignedUp) {
            throw new AssertionError("User was not able to sign up successfully");
        }
    }

    @Then("user should see a confirmation welcome message")
    public void user_should_see_a_confirmation_welcome_message() {
        // Ensure the welcome message is displayed
        boolean isWelcomeMessageDisplayed = driver.findElement(By.xpath("YOUR_XPATH_FOR_WELCOME_MESSAGE")).isDisplayed();
        if (!isWelcomeMessageDisplayed) {
            throw new AssertionError("Welcome message was not displayed");
        }
    }

    @Then("User should take a screenshot after sucessfully sign up account")
    public void user_should_take_a_screenshot_after_sucessfully_sign_up_account() {
        // Take screenshot
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        String screenshotName = "screenshot_" + UUID.randomUUID() + ".png";
        File destFile = new File(System.getProperty("/IslahiArt_BDD_Cucumber_Maven_Project/target") + "/screenshots/" + screenshotName);
        try {
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
    
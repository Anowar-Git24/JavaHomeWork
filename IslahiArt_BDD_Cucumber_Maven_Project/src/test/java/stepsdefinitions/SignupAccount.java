package stepsdefinitions;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myhooks.Hook2;
import pageobjectsmodel.SignupPage;

public class SignupAccount {

    WebDriver driver;
    SignupPage signup;

    public SignupAccount() {
        this.driver = Hook2.getDriver();
        this.signup = new SignupPage(driver); // Assuming SignupPage is correctly implemented
    }

    @Given("the user is on the signup page {string}")
    public void the_user_is_on_the_signup_page(String url) {
        driver.get(url);
    }

    @Given("user clicks on the signup tab")
    public void user_clicks_on_the_signup_tab() {
        signup.clicksignupTab();
    }

    @When("User enters email {string}")
    public void user_enters_email(String email) {
        signup.enterEmail(email);
    }

    @When("User enters first name {string}")
    public void user_enters_first_name(String firstName) {
        signup.enterFirstname(firstName);
    }

    @When("User enters last name {string}")
    public void user_enters_last_name(String lastName) {
        signup.enterLastname(lastName);
    }

    @When("User enters password {string}")
    public void user_enters_password(String password) {
        signup.enterPassword(password);
    }

    @When("User confirms password {string}")
    public void user_confirms_password(String confirmPassword) {
        signup.enterConfirmPassword(confirmPassword);
    }

    @When("User accepts the Privacy Policy")
    public void user_accepts_the_privacy_policy() {
        signup.acceptPrivacyPolicy();
    }

    @When("User clicks on the signup button")
    public void user_clicks_on_the_signup_button() {
        signup.clicksignupButton();
    }

    @Then("the user will land on the home page {string}")
    public void the_user_will_land_on_the_home_page(String homePageUrl) {
        Assert.assertEquals(driver.getCurrentUrl(), homePageUrl);
    }

    @Then("User should be able to successfully sign up for an account")
    public void user_should_be_able_to_successfully_sign_up_for_an_account() {
        String successMessage = driver.findElement(By.xpath("//div[contains(text(),'Welcome')]")).getText();
        Assert.assertTrue(successMessage.contains("Welcome"));
    }

    @Then("user should see a confirmation welcome message")
    public void user_should_see_a_confirmation_welcome_message() {
        String confirmationMessage = driver.findElement(By.id("confirmationMessage")).getText();
        Assert.assertTrue(confirmationMessage.contains("Welcome"));
    }

    @Then("User should take a screenshot after successfully signing up for an account")
    public void user_should_take_a_screenshot_after_successfully_signing_up_for_an_account() {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        String screenshotName = "screenshot_" + UUID.randomUUID() + ".png";
        File destFile = new File(System.getProperty("user.dir") + "/target/screenshots/" + screenshotName);
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

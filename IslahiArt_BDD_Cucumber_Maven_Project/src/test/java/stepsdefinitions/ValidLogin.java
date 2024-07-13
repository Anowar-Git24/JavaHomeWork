package stepsdefinitions;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myhooks.Hook2;
import pageobjectsmodel.LoginPage;

public class ValidLogin {

    WebDriver driver;
    LoginPage login;

    public ValidLogin() {
        this.driver = Hook2.getDriver();
        this.login = new LoginPage(driver);
    }

    @Given("the user is on the login page {string}")
    public void the_user_is_on_the_login_page(String loginpageurl) {
        driver.get(loginpageurl);
    }

    @When("the user clicks the login in tab")
    public void the_user_clicks_the_login_in_tab() {
        login.clickloginTab();
    }

    @When("the user enters a valid username {string}")
    public void the_user_enters_a_valid_username(String user) {
        login.enterEmail(user);
    }

    @When("the user enters a valid password {string}")
    public void the_user_enters_a_valid_password(String pass) {
        login.enterPassword(pass);
    }

    @When("the user clicks the log in button")
    public void the_user_clicks_the_log_in_button() {
        login.clickloginnButton();
    }

    @Then("the user will land on home page {string}")
    public void the_user_will_land_on_home_page(String welcomepageurl) {
        driver.get(welcomepageurl);
    }

    @Then("the user should take a screenshot")
    public void the_user_should_take_a_screenshot() {
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

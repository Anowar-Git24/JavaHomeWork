package stepsdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import myhooks.Hook;
import org.openqa.selenium.WebDriver;
import pom.LoginPage;

public class ValidLoginSteps {

    private WebDriver driver;
    private LoginPage loginPage;

    public ValidLoginSteps() {
        this.driver = Hook.getDriver();
        this.loginPage = new LoginPage(driver);
    }

   // @Given("the user clicks on the login tab")
   // public void the_user_clicks_on_the_login_tab() {
    //    loginPage.clickloginTab();
   // }

    @When("the user is on the login page {string}")
    public void the_user_is_on_the_login_page(String url) {
        driver.get(url);
    }

    @When("the user enters a valid username {string}")
    public void the_user_enters_a_valid_username(String username) {
        loginPage.enterEmail(username);
    }

    @When("the user enters a valid password {string}")
    public void the_user_enters_a_valid_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("the user clicks the remember button")
    public void the_user_clicks_the_remember_button() {
        loginPage.clickremembermeButton();
    }

    @Then("the user clicks the log in button")
    public void the_user_clicks_the_log_in_button() {
        loginPage.clickloginnButton();
    }
}

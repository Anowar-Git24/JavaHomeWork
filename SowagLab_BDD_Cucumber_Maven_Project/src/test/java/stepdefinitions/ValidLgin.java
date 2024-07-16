package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myhooks.Hook;
import pom.LoginPage;

public class ValidLgin {

	private WebDriver driver;
	private LoginPage loginPage;

	public void ValidLogin() {
		this.driver = Hook.getDriver();
		this.loginPage = new LoginPage(driver);
	}
	
	@When("the user is on the login page {string}")
    public void the_user_is_on_the_login_page(String url) {
        driver.get(url);
    }

	@When("the user enters a valid username {string}")
	public void the_user_enters_a_valid_username(String username) {
		loginPage.enterUserName(username);
	}

	@When("the user enters a valid password {string}")
	public void the_user_enters_a_valid_password(String password) {
		loginPage.enterPassword(password);
	}

	@Then("the user clicks the log in button")
	public void the_user_clicks_the_log_in_button() {
		loginPage.clickloginnButton();
	}

}

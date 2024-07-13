package stepsdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myhooks.Hook;
import pom.CreateAccount;

public class CreateValidAccount {
	
	WebDriver driver;
    CreateAccount signup;

    public void CreateAccount() {
        this.driver = Hook.getDriver();
        this.signup = new CreateAccount();
    }

	@Given("the user is on the home page {string}")
	public void the_user_is_on_the_home_page(String url) {
	   driver.get(url);
	}

	@When("user clicks on the account tab")
	public void user_clicks_on_the_account_tab() {
	    signup.clickAccountTab();
	}

	@When("user see the account creation page")
	public void user_see_the_account_creation_page() {
	    
	}

	@When("User enters first and last name {string}")
	public void user_enters_first_and_last_name(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enters email {string}")
	public void user_enters_email(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enters password {string}")
	public void user_enters_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User reentered password {string}")
	public void user_reentered_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on the continue button")
	public void user_clicks_on_the_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should be able to successfully create  an account")
	public void user_should_be_able_to_successfully_create_an_account() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the user will land on the home page {string}")
	public void the_user_will_land_on_the_home_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should see a confirmation welcome message")
	public void user_should_see_a_confirmation_welcome_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}




}

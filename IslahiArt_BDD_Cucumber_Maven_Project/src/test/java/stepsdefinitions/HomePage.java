package stepsdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myhooks.Hook2;

public class HomePage {

    WebDriver driver;
    HomePage home;

    public HomePage() {
        this.driver = Hook2.driver();
        this.home = new HomePage();
    }

    @Given("User is on the IslahI Art Home Page")
    public void user_is_on_the_islah_i_art_home_page() {
        driver.get("https://islahiart.com/");
    }

    @When("user see the Islahi Art Home Page")
    public void user_see_the_islahi_art_home_page() {
        // Add logic to verify that the user sees the home page
        // Example: Check for a specific element on the home page
        boolean isHomePageVisible = home.isHomePageVisible();
        assert(isHomePageVisible);
    }

    private boolean isHomePageVisible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Then("user click on  account tab")
    public void user_click_on_account_tab() {
        home.clickAccountTab();
    }

    private void clickAccountTab() {
		// TODO Auto-generated method stub
		
	}

	@Then("user should see Account Creation Page")
    public void user_should_see_account_creation_page() {
        // Add logic to verify that the user is on the Account Creation Page
        // Example: Check for a specific element on the account creation page
        boolean isAccountCreationPageVisible = home.isAccountCreationPageVisible();
        assert(isAccountCreationPageVisible);
    }

	private boolean isAccountCreationPageVisible() {
		// TODO Auto-generated method stub
		return false;
	}
}

package stepsdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import myhooks.Hook;
import pom.LoginPage;

public class ValidLoginSteps {
	 WebDriver driver;
	    LoginPage login;
	    
	    public void ValidLogin() {
	        this.driver = Hook.driver;
	        this.login = new LoginPage(driver);
	    }
   @Given("the user clicks on the login tab")
	public void the_user_clicks_on_the_login_tab() {
	   login.clickloginTab();
   }
    @Given("the user is on the login page {string}")
    public void the_user_is_on_the_login_page(String loginpageurl) {
    	driver.get(loginpageurl); 
    }

    @Given("the user enters a valid username {string}")
    public void the_user_enters_a_valid_username(String user) {
    	login.enterEmail(user);
       
    }

    @Given("the user enters a valid password {string}")
    public void the_user_enters_a_valid_password(String pass) {
    	login.enterPassword(pass);
    	
    }
    
    @When("the user clicks the remember button")
    public void the_user_clicks_the_remember_button() {
    	login.clickremembermeButton();
    }

    @Given("the user clicks the log in button")
    public void the_user_clicks_the_log_in_button() {
    	login.clickloginnButton();
    	
    }




}
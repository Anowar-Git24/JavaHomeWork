package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Reusablefunctions;
import myhooks.Hook;

public class LoginPage {
    
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver=Hook.driver;
        PageFactory.initElements(driver, this);
              
    }
    
    @FindBy(xpath="//*[@id=\"user-name\"]")
    WebElement username;
    
    @FindBy(xpath="//*[@id=\"password\"]")
    WebElement password;
    
    @FindBy(xpath="//*[@id=\"login-button\"]")
    WebElement loginButton;
    
    public void enterUserName(String user) {
        username.sendKeys(user);
    }
    
    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }
    
    public void clickloginnButton() {
    LoginPage.click(loginButton);
	}

	private static void click(WebElement loginButton2) {
		// TODO Auto-generated method stub
		
	}
}  
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
    
   // @FindBy(xpath="//a[@href='/login?returnUrl=%2F']")
    //WebElement logintab;
    
    @FindBy(id="Email")
    WebElement username;
    
    @FindBy(id="Password")
    WebElement password;
    
    @FindBy(xpath="//*[@id=\"RememberMe\"]")
    WebElement remembermeButton;
    
    @FindBy(xpath="//button[@class = 'button-1 login-button']")
    WebElement loginButton;
    
   // public void clickloginTab() {
    //	Reusablefunctions.click(logintab);
   // }
    
    public void enterEmail(String user) {
        username.sendKeys(user);
    }
    
    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }
    
    public void clickremembermeButton() {
    	Reusablefunctions.click(remembermeButton);;
    }
    
    public void clickloginnButton() {
    	Reusablefunctions.click(loginButton);
	}
    }


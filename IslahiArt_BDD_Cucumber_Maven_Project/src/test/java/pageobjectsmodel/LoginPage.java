package pageobjectsmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ReusableFunctions;
import myhooks.Hook;

public class LoginPage {

	WebDriver driver;
	ReusableFunctions reusableFunctions;
	
	public LoginPage(WebDriver driver) {
		this.driver=Hook.driver;
		this.reusableFunctions=new ReusableFunctions(driver);
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="(//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/ul/li[1]")
	WebElement loginTab;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/form/div[1]/div[1]/div/input")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/form/div[1]/div[2]/div/input")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/form/div[2]/label/input")
    WebElement rememberButton;
    
	@FindBy(xpath="//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[2]/div/form/button")
	WebElement loginButton;


	public void clickloginTab() {
		reusableFunctions.click(loginTab);
	}
	
    public void enterEmail(String user) {
    	username.sendKeys(user);
    }
    
    public void enterPassword(String pass) {
        password.sendKeys(pass);
    }
    	
	public void clickrememberButton() {
		reusableFunctions.click(rememberButton);
		
	}
	public void clickloginnButton() {
		reusableFunctions.click(loginButton);
	}
	
}
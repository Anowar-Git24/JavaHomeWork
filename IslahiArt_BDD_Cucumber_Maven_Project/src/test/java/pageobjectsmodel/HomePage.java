package pageobjectsmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ReusableFunctions;
import myhooks.Hook;

public class HomePage {
	
	WebDriver driver;
	ReusableFunctions reusableFunctions;
	
	public HomePage() {
		this.driver=Hook.driver;
		this.reusableFunctions=new ReusableFunctions(driver);
		PageFactory.initElements(driver, this);
		
	}
		
	@FindBy(xpath="(//a[@href='/my-account/']\")")
			WebElement accounttab;
	
			public void clickAccountTab() {
				reusableFunctions.click(accounttab);
			}

			public boolean isAccountCreationPageVisible() {
				// TODO Auto-generated method stub
				return false;
			}

}

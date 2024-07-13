package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ReusableFunctions;
import myhooks.Hook;

public class CreateAccount {

	WebDriver driver;
	ReusableFunctions reusableFunctions;

	public CreateAccount() {
		this.driver = Hook.getDriver();
		this.reusableFunctions = new ReusableFunctions(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span")
	WebElement accounttab;

	@FindBy(xpath = "//*[@id=\"ap_customer_name\"]")
	WebElement yourname;

	@FindBy(xpath ="//*[@id=\"ap_email\"]")
	WebElement email;

	@FindBy(xpath="//*[@id=\"ap_password\"]")
	WebElement password;

	@FindBy(xpath="//*[@id=\"ap_password_check\"]")
	WebElement reenterpassword;

	@FindBy(xpath="//*[@id=\"auth-continue-announce\"]")
	WebElement continuetab;

	public void clickAccountTab() {
		reusableFunctions.click(accounttab);
	}

	public boolean isAccountCreationPageVisible() {
		// TODO Auto-generated method stub
		return false;
	}

	public void enterYourName(String Yourname) {
		yourname.sendKeys(Yourname);
	}

	public void enterEmail(String user) {
		email.sendKeys(user);
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}

	public void reenterPassword(String pass) {
		reenterpassword.sendKeys(pass);
	}

	public void clickContinueButton() {
		reusableFunctions.click(continuetab);
	}
}

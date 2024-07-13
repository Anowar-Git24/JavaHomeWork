package pageobjectsmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ReusableFunctions;
import myhooks.Hook;

public class SignupPage {

    WebDriver driver;
    ReusableFunctions reusableFunctions;

    public SignupPage(WebDriver driver) {
        this.driver = Hook.driver;
        this.reusableFunctions = new ReusableFunctions(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/ul/li[2]")
    WebElement signuptab;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[3]/div/form/div/div[1]/div/input")
    WebElement email;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[3]/div/form/div/div[2]/div/input")
    WebElement firstname;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[3]/div/form/div/div[3]/div/input")
    WebElement lastname;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[3]/div/form/div/div[4]/div/input")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[3]/div/form/div/div[5]/div/input")
    WebElement confirmPassword;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[3]/div/form/div/div[6]/div/label/input")
    WebElement acceptPrivecyPolicyButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/section[1]/div/div/div/div/div/div/div/div[2]/div[3]/div/form/button")
    WebElement signupButton;

    public void clicksignupTab() {
        reusableFunctions.click(signuptab);
    }

    public void enterEmail(String user) {
        email.sendKeys(user);
    }

    public void enterFirstname(String FirstName) {
        firstname.sendKeys(FirstName);
    }

    public void enterLastname(String LastName) {
        lastname.sendKeys(LastName);
    }

    public void enterPassword(String password123) {
        password.sendKeys(password123);
    }

    public void enterConfirmPassword(String ConfirmPassword123) {
        confirmPassword.sendKeys(ConfirmPassword123);
    }

    public void clickacceptPrivecyPolicyButton() {
        reusableFunctions.click(acceptPrivecyPolicyButton);
    }

    public void clicksignupButton() {
        reusableFunctions.click(signupButton);
    }

	public void acceptPrivacyPolicy() {
		// TODO Auto-generated method stub
		
	}
}

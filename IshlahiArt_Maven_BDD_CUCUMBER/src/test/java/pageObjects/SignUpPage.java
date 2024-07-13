package pageObjects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusables.BasePage;

public class SignUpPage extends BasePage {

    private static final Logger logger = LogManager.getLogger(SignUpPage.class);
    private final By emailTextBoxLocator = By.id("Email");
    private final By firstNameTextBoxLocator = By.id("FirstName");
    private final By lastNameTextBoxLocator = By.id("LastName");
    private final By passwordTextBoxLocator = By.id("Password");
    private final By confirmPasswordTextBoxLocator = By.id("ConfirmPassword");
    private final By signupButtonLocator = By.id("signup-button");

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email) {
        WebElement emailTextBox = driver.findElement(emailTextBoxLocator);
        logger.info("Entering email: " + email);
        emailTextBox.sendKeys(email);
    }

    public void enterFirstName(String firstName) {
        WebElement firstNameTextBox = driver.findElement(firstNameTextBoxLocator);
        logger.info("Entering first name: " + firstName);
        firstNameTextBox.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        WebElement lastNameTextBox = driver.findElement(lastNameTextBoxLocator);
        logger.info("Entering last name: " + lastName);
        lastNameTextBox.sendKeys(lastName);
    }

    public void enterPassword(String password) {
        WebElement passwordTextBox = driver.findElement(passwordTextBoxLocator);
        logger.info("Entering password");
        passwordTextBox.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        WebElement confirmPasswordTextBox = driver.findElement(confirmPasswordTextBoxLocator);
        logger.info("Entering confirm password");
        confirmPasswordTextBox.sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {
        WebElement signupButton = driver.findElement(signupButtonLocator);
        logger.info("Clicking signup button");
        signupButton.click();
    }

    public By getSignupButtonLocator() {
        return signupButtonLocator;
    }

	public static void clickSignUpButton() {
		// TODO Auto-generated method stub
		
	}
}

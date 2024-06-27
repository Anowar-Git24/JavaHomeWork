package pagesOfNopCommerce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import reusables.BasePage;

public class LoginPage extends BasePage {

    private static final Logger logger = LogManager.getLogger(LoginPage.class);

    private final By emailTextBoxLocator = By.id("Email");
    private final By passwordTextBoxLocator = By.id("Password");
    private final By loginButtonLocator = By.xpath("//button[contains(@class, 'login-button')]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email) {
        WebElement emailTextBox = driver.findElement(emailTextBoxLocator);
        logger.info("Entering email: " + email);
        sendKeys(emailTextBox, email);
    }

    public void enterPassword(String password) {
        WebElement passwordTextBox = driver.findElement(passwordTextBoxLocator);
        logger.info("Entering password");
        sendKeys(passwordTextBox, password);
    }

    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(loginButtonLocator);
        logger.info("Clicking login button");
        click(loginButton);
    }
}

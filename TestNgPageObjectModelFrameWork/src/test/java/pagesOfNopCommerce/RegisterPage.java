package pagesOfNopCommerce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import reusables.BasePage;

public class RegisterPage extends BasePage {

    private static final Logger logger = LogManager.getLogger(RegisterPage.class);

    private final By genderRadioButtonLocator = By.id("gender-male");
    private final By firstNameTextBoxLocator = By.id("FirstName");
    private final By lastNameTextBoxLocator = By.id("LastName");
    private final By daySelectLocator = By.name("DateOfBirthDay");
    private final By monthSelectLocator = By.name("DateOfBirthMonth");
    private final By yearSelectLocator = By.name("DateOfBirthYear");
    private final By emailTextBoxLocator = By.id("Email");
    private final By passwordTextBoxLocator = By.id("Password");
    private final By confirmPasswordTextBoxLocator = By.id("ConfirmPassword");
    private final By registerButtonLocator = By.id("register-button");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void selectGender(String gender) {
        WebElement genderRadioButton = driver.findElement(genderRadioButtonLocator);
        logger.info("Selecting gender: " + gender);
        click(genderRadioButton);
    }

    public void enterFirstName(String firstName) {
        WebElement firstNameTextBox = driver.findElement(firstNameTextBoxLocator);
        logger.info("Entering first name: " + firstName);
        sendKeys(firstNameTextBox, firstName);
    }

    public void enterLastName(String lastName) {
        WebElement lastNameTextBox = driver.findElement(lastNameTextBoxLocator);
        logger.info("Entering last name: " + lastName);
        sendKeys(lastNameTextBox, lastName);
    }

    public void selectDateOfBirth(String day, String month, String year) {
        WebElement daySelect = driver.findElement(daySelectLocator);
        WebElement monthSelect = driver.findElement(monthSelectLocator);
        WebElement yearSelect = driver.findElement(yearSelectLocator);

        logger.info("Selecting date of birth: " + day + "/" + month + "/" + year);

        new Select(daySelect).selectByVisibleText(day);
        new Select(monthSelect).selectByVisibleText(month);
        new Select(yearSelect).selectByVisibleText(year);
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

    public void enterConfirmPassword(String confirmPassword) {
        WebElement confirmPasswordTextBox = driver.findElement(confirmPasswordTextBoxLocator);
        logger.info("Entering confirm password");
        sendKeys(confirmPasswordTextBox, confirmPassword);
    }

    public void clickRegisterButton() {
        WebElement registerButton = driver.findElement(registerButtonLocator);
        logger.info("Clicking register button");
        click(registerButton);
    }
}

package pagesOfNopCommerce;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import reusables.BasePage;

public class HomePage extends BasePage {
    private final By registerButtonLocator = By.xpath("//a[@href='/register?returnUrl=%2F']");

    private static final Logger logger = LogManager.getLogger(HomePage.class);

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void RegisterButton() {
        WebElement registerButton = driver.findElement(registerButtonLocator);
        Assert.assertTrue(registerButton.isDisplayed());
        logger.info("Clicking on Register Button");
        click(registerButton);
    }

}

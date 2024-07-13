package pageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import reusables.BasePage;

public class HomePage extends BasePage {
    private final By accountButtonLocator = By.xpath("//a[@href='/my-account/']");
    private static final Logger logger = LogManager.getLogger(HomePage.class);

    public HomePage(WebDriver driver) {
        super(driver); // Assuming BasePage has a constructor that accepts WebDriver
        this.driver = driver;
    }

    public void clickAccountButton() {
        WebElement accountButton = driver.findElement(accountButtonLocator);
        Assert.assertTrue(accountButton.isDisplayed(), "Account button is not displayed");
        logger.info("Clicking on Account Button");
        click(accountButton);
    }
    
    // Add more methods to interact with other elements on the Home Page
}

package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import reusables.basePage;

public class HomePage extends basePage {
    private final By accountButtonLocator = By.xpath("//a[@href='/my-account/']");

    private static final Logger logger = LogManager.getLogger(HomePage.class);

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickAccountButton() {
        WebElement accountButton = driver.findElement(accountButtonLocator);
        Assert.assertTrue(accountButton.isDisplayed());
        logger.info("Clicking on Account Button");
        click(accountButton);
    }

}

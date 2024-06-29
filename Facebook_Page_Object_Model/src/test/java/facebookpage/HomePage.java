package facebookpage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import reusables.BasePage;

public class HomePage extends BasePage {

    private static final Logger logger = LogManager.getLogger(HomePage.class);

    // Constructor
    public HomePage(WebDriver driver) {
        super(driver);
        logger.info("HomePage initialized");
    }

   
}

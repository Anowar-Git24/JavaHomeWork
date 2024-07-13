package myhooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import utilities.PropertyFilereader;

public class Hook {
    private static WebDriver driver;

    @Before
    public void setUp() {
        try {
            String browserChoice = PropertyFilereader.getPropertyValue("browserName").toLowerCase().trim();

            switch (browserChoice) {
                case "edge":
                    // Ensure msedgedriver is available and properly configured
                    System.setProperty("webdriver.edge.driver", "path/to/msedgedriver");
                    driver = new EdgeDriver();
                    break;
                case "chrome":
                    // Ensure chromedriver is available and properly configured
                    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--disable-notifications");
                    options.addArguments("--start-maximized");
                    driver = new ChromeDriver(options);
                    break;
                default:
                    throw new Exception("Invalid browser name provided in property file: " + browserChoice);
            }
        } catch (Exception e) {
            // Consider using a logging framework like Log4j or SLF4J for better logging
            e.printStackTrace();
            // Fail the setup if the driver initialization fails
            throw new RuntimeException("Failed to initialize the WebDriver", e);
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}

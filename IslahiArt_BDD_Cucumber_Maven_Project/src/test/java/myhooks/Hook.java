package myhooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import utilities.PropertyFilereader;

public class Hook {
    public static WebDriver driver;

    @Before
    public void setUp() {
        try {
            String browserChoice = PropertyFilereader.getPropertyValue("browserName").toLowerCase().trim();

            switch (browserChoice) {
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "chrome":
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--disable-notifications");
                    options.addArguments("--start-maximized");
                    driver = new ChromeDriver(options);
                    break;
                default:
                    throw new Exception("Invalid browser name provided in property file: " + browserChoice);
            }
        } catch (Exception e) {
            e.printStackTrace();
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

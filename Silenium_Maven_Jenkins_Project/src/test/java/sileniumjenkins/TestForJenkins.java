package sileniumjenkins;

import org.testng.annotations.Test;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestForJenkins {

    @Test
    public void startBrowser() {
        // Setup the ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();

        // Open the OrangeHRM website
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Assert that the page title contains "Orange"
        Assert.assertTrue(driver.getTitle().contains("Orange"), "Title does not match");

        // Close the browser
        driver.quit();
    }
}

package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;

public class PropertyFilereader {
    public static WebDriver driver;
    PropertyFilereader prop = new PropertyFilereader();

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", PropertyFilereader.getPropertyValue("driver.path"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(PropertyFilereader.getPropertyValue("url"));
    }

	public static String getPropertyValue(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}

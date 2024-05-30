package seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class ScoendTest {
	
	WebDriver driver;
	public void launchBrowser() {
	System.setProperty("webdriver.chrome.driver",
			"/Users/mdhossain/Downloads/chromedriver-mac-x64 4/chromedriver");
	 System.setProperty("webdriver.http.factory", "jdk-http-client");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
	
	public static void main(String[] args) {
		
		ScoendTest obj = new ScoendTest();
		obj.launchBrowser();
	}

	
}

package basepage;
	

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverSetup {

	private static WebDriver driver;
	
	//invoke chrome browser
	public static WebDriver invokeBrowser()  {
		
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("--start-maximized");
			 driver = new ChromeDriver(options);
			 driver.manage().window().maximize();
			 return driver;
	}
	
	
}



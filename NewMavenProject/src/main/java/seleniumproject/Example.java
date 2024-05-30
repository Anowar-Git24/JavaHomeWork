package seleniumproject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class Example {
	
	WebDriver driver;
	public void launchBrowser() {
		
	//System.setProperty("webdriver.chrome.driver",
			//"/Users/mdhossain/Downloads/chromedriver-mac-x64 4/chromedriver");
	
	 System.setProperty("webdriver.http.factory", "jdk-http-client");
	driver = new ChromeDriver();
	driver.get("https://www.w3resource.com/java-exercises/basic/index.php");
	}
	
	public static void main(String[] args) {
		
		Example obj = new Example();
		obj.launchBrowser();
	}

	
}

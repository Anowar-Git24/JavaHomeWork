package scriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class hightlightElementDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("http://www.facebook.com");

        WebElement username= driver.findElement(By.id("email"));
        highLightElement(driver,username);

    }

	private static void highLightElement(WebDriver driver, WebElement username) {
		// TODO Auto-generated method stub
		
	}


}


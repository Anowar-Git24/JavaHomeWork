package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsTab {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        
        //scroll down for 5000 pixels
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        
        // Multiple window
        driver.findElement(By.id("windowButton")).click();
        Set<String>windows = driver.getWindowHandles();
        System.out.println("Total number of windows "+ windows.size());
        
        //convert set to list
        List<String>list=new ArrayList<String>(windows);
        driver.switchTo().window(list.get(1));
        System.out.println(driver.getTitle());
        System.out.println(driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().window(list.get(0));
        System.out.println(driver.getTitle());
        
    }

}
package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehandling {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryui.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Droppable")).click();
        WebElement frm =driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frm);
        
        
        
        WebElement src=driver.findElement(By.id("draggable"));
        WebElement dest=driver.findElement(By.id("droppable"));
        
        Actions a=new Actions(driver);
        a.clickAndHold(src).moveToElement(dest).release(dest).build().perform();

    }

}




package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Forms {

    public static void main(String[] args) throws InterruptedException {
        // Set the system property for ChromeDriver
        //System.setProperty("webdriver.chrome.driver", "C:\\Chromedriver\\chromedriver.exe");
        //System.setProperty("webdriver.http.factory", "jdk-http-client");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Go to the website 
        driver.get("https://demoqa.com/automation-practice-form");

        // Fill in the first name
        driver.findElement(By.id("firstName")).sendKeys("Automation");
        
        // Fill in the last name
        driver.findElement(By.id("lastName")).sendKeys("Tester");
        
        // Fill in the email
//        driver.findElement(By.id("userEmail")).sendKeys("automation.tester@gmail.com");
        
        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
//      driver.findElement(By.id("dateOfBirthInput")).sendKeys("05/12/1991");
        driver.findElement(By.id("dateOfBirthInput")).click();
        Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
        year.selectByVisibleText("2012");
        Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
        month.selectByVisibleText("December");
        driver.findElement(By.xpath("//div[@class ='react-datepicker__day react-datepicker__day--012']")).click();
                
        }
    }
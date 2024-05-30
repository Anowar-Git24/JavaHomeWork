package testngbasics;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Findelementss {

    @Test
    public void Setup() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mycontactform.com");
        driver.manage().window().maximize();

//       username
        driver.findElement(By.id("user")).sendKeys("meus");

//        password
        driver.findElement(By.id("pass")).sendKeys("Mypass123");
        
        // Login
        driver.findElement(By.className("btn_log")).click();
                
//      transfer to another page
        driver.findElement(By.linkText("Sample Forms")).click();

//        Send to section. sales option
        driver.findElement(By.xpath("//input[@value ='1']")).click();

//        Insert subject
        driver.findElement(By.id("subject")).sendKeys("Practice selenium");

//        insert email
        driver.findElement(By.id("email")).sendKeys("mahossain3094@gmail.com");

//        Text box field
        driver.findElement(By.id("q1")).sendKeys("Life is Beautiful");

//        Text box multiple line
        driver.findElement(By.id("q2")).sendKeys("Practice makes things perfect\nSelenium is fun!");

//      Drop Down box for option
//      Declare a web element
        WebElement dropdownElement = driver.findElement(By.id("q3"));
//      Create a Select object
        Select dropdown = new Select(dropdownElement);
//      Select by visible text
        dropdown.selectByVisibleText("Third Option");

//      Radio button
        WebElement radioButton = driver.findElement(By.xpath("//input[@value='Fourth Option']"));
        radioButton.click();

//      Single check Box
        driver.findElement(By.name("q5")).click();

//      Check Box Multi Answer
        driver.findElement(By.xpath("//input[@value = 'Fifth Check Box']")).click();

//      Date Selector
        driver.findElement(By.id("q7")).sendKeys("05-29-2024");

//      Drop Down box for US State
//      Declare a web element
        WebElement dropdownElement1 = driver.findElement(By.id("q8"));
//      Create a Select object
        Select dropdown1 = new Select(dropdownElement1);
//      Select by visible text
        dropdown1.selectByVisibleText("MI");

//    Drop Down box for Country
//    Declare a web element
        WebElement dropdownElement2 = driver.findElement(By.id("q9"));
//    Create a Select object
        Select dropdown2 = new Select(dropdownElement2);
//    Select by visible text
        dropdown2.selectByVisibleText("Canada");

//    Drop Down box for State in Canada
//    Declare a web element
        WebElement dropdownElement3 = driver.findElement(By.id("q10"));
//    Create a Select object
        Select dropdown3 = new Select(dropdownElement3);
//    Select by visible text
        dropdown3.selectByVisibleText("Ontario");

//    Drop Down box for Name prefix
//    Declare a web element
        WebElement dropdownElement4 = driver.findElement(By.name("q11_title"));
//    Create a Select object
        Select dropdown4 = new Select(dropdownElement4);
//    Select by visible text
        dropdown4.selectByVisibleText("Mr.");

//    Inserting First name
        driver.findElement(By.name("q11_first")).sendKeys("Md");

//    Inserting Last name
        driver.findElement(By.name("q11_last")).sendKeys("Hossain");

    }

}

//  Date of Birth 
//  Dropdown for Month
//  Declare a web element
   //     WebElement dropdownElement5 = driver.findElement(By.name("q12_month"));
//  Create a Select object
    //    Select dropdown5 = new Select(dropdownElement5);
//  Select by visible text
     //   dropdown5.selectByVisibleText("12");

//  Dropdown for Day
//  Declare a web element
    //    WebElement dropdownElement6 = driver.findElement(By.name("q12_day"));
//  Create a Select object
     //   Select dropdown6 = new Select(dropdownElement6);
//  Select by visible text
       // dropdown6.selectByVisibleText("15");

//  Dropdown for Day
//  Declare a web element
      //  WebElement dropdownElement7 = driver.findElement(By.name("q12_year"));
//  Create a Select object
       // Select dropdown7 = new Select(dropdownElement7);
//  Select by visible text
       // dropdown7.selectByVisibleText("1999");

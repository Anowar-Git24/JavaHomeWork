package testngbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Enabled {
    
    @BeforeMethod
    public void beforemethod() {
        System.out.println("This section is executing before Method");
    }

    @BeforeClass
    public void beforeclass() {
        System.out.println("This section is executing before class");
    }
    
    @BeforeTest
    public void beforetest() {
        System.out.println("This section is executing before Test");
    }
    
    @BeforeSuite
    public void beforesuite() {
        System.out.println("This section is executing before Suite");
    }
    
    @Test
    public void mymethodone() {
        System.out.println("Execution of method One");
    }
    
    @Test(enabled = false)
    public void mymethodtwo() {
        System.out.println("Execution of method Two");
    }
    
    @Test
    public void mymethodthree() {
        System.out.println("Execution of method Three");
    }
    
    @Test
    public void mymethodfour() {
        System.out.println("Execution of method Four");
    }
    
    
    @AfterMethod
    public void aftermethod() {
        System.out.println("This section is executing after Method");
    }

    @AfterClass
    public void afterclass() {
        System.out.println("This section is executing after class");
    }
    
    @AfterTest
    public void aftertest() {
        System.out.println("This section is executing after Test");
    }
    
    @AfterSuite
    public void aftrsuite() {
        System.out.println("This section is executing after Suite");
    }
}
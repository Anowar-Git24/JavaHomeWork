package testngbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
    
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
    @Parameters({"browser","firstname"})
    public void mymethodone(String browser, String firstname) {
        System.out.println("The test is done on " + browser );
        System.out.println("In the test the first name is " + firstname);
        
    }
    
    @Test
    public void mymethodtwo() {
        System.out.println("Execution of method Two");
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
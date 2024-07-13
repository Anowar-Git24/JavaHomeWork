package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src/main/resources/Features"},
    glue = { "stepdefinitions" , "myhooks" },
    plugin = {"pretty", "html:target/cucumber-reports.html"})

public class CucumberTestRunners extends AbstractTestNGCucumberTests {

}
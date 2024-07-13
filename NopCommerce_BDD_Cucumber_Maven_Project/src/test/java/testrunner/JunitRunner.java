package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src\\test\\resources\\Features"},
        glue = {"stepdefinitions", "myhooks"},
        plugin = {"pretty"}
)
public class JunitRunner {
}

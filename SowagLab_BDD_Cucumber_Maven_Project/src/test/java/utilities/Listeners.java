package utilities;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import myhooks.Hook;


public class Listeners implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        WebDriver driver = Hook.getDriver();
        if (driver != null) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            try {
    			String temp = System.getProperty("/src/test/resources/Config/configeration.properties");
    			String screenshotPath = temp + "\\test-output"+ result.getName() + ".png";
                Files.copy(source.toPath(), Paths.get(screenshotPath));
                System.out.println("Screenshot saved to " + screenshotPath);
                // Add screenshot path as an attribute
                result.setAttribute("screenshotPath", screenshotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onTestStart(ITestResult result) {}

    @Override
    public void onTestSuccess(ITestResult result) {}

    @Override
    public void onTestSkipped(ITestResult result) {}

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}

    @Override
    public void onStart(ITestContext context) {}

    @Override
    public void onFinish(ITestContext context) {
        for (ITestResult result : context.getFailedTests().getAllResults()) {
            String screenshotPath = (String) result.getAttribute("screenshotPath");
            if (screenshotPath != null) {
                System.out.println("Screenshot available at: " + screenshotPath);
            }
        }
    }
}

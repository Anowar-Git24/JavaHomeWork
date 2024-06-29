package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {
    private WebDriver driver;

    public ScreenshotUtil(WebDriver driver) {
        this.driver = driver;
    }

    public void takeScreenshot(String filePath) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(source, new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

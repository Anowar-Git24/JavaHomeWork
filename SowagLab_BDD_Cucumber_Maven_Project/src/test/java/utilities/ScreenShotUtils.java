package utilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ScreenShotUtils {
    private WebDriver driver;

    public ScreenShotUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void takeScreenshot(String filePath) {
        // Create a screenshot as file
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        // Create destination file
        File destFile = new File(filePath);
        
        // Create parent directories if they don't exist
        destFile.getParentFile().mkdirs();

        try {
            // Copy the file to the destination
            FileUtils.copyFile(srcFile, destFile);
            System.out.println("Screenshot saved at: " + filePath);
        } catch (IOException e) {
            System.out.println("Error saving screenshot: " + e.getMessage());
        }
    }
}

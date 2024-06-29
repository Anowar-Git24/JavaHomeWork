package utilities;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    public static ExtentReports extent;
    public static ExtentSparkReporter htmlReporter;

    public static ExtentReports createInstance() throws IOException {
        
        String repname = "TestReport-" + getTimeStamp() + ".html";
        htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "//Reports//" + repname);
        htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "\\src\\test\\resources\\extent-config.xml");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("OS", "Macos");
        extent.setSystemInfo("Host Name", "localhost");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("User Name", "Nexvali");
        return extent;
    }

    public static String getTimeStamp() {
        return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    }
}

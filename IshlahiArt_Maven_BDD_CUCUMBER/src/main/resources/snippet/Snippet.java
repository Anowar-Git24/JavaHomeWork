package snippet;

public class Snippet {
	private ExtentReports extent;
	    private ExtentTest test;
	
	    @Override
	    public void onStart(ITestContext context) {
	        ExtentSparkReporter spark = new ExtentSparkReporter("target/ExtentReport.html");
	        extent = new ExtentReports();
	        extent.attachReporter(spark);
	    }
	
	    @Override
	    public void onTestStart(ITestResult result) {
	        test = extent.createTest(result.getMethod().getMethodName());
	    }
	
	    @Override
	    public void onTestSuccess(ITestResult result) {
	        test.pass("Test passed");
	    }
	
	    @Override
	    public void onTestFailure(ITestResult result) {
	        test.fail(result.getThrowable());
	    }
	
	    @Override
	    public void onTestSkipped(ITestResult result) {
	        test.skip("Test skipped");
	    }
	
	    @Override
	    public void onFinish(ITestContext context) {
	        if (extent != null) {
	            extent.flush();
	        }
	    }
}


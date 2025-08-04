package Reports;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Base.ScreenshotUtils;

public class ExtentTestNGListener implements ITestListener{

	ExtentReports extr = ExtentReportManager.getInstance();
	ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
	
	@Override
	public void onTestStart(ITestResult result) {
		ExtentTest extentTest = extr.createTest(result.getMethod().getMethodName());
		test.set(extentTest);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		test.get().pass("Test passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		Object testClassInstance = result.getInstance();
		WebDriver driver = null;
		
		try {
			driver = (WebDriver) testClassInstance.getClass().getDeclaredField("driver").get(testClassInstance);		
		}catch (Exception e) {
			e.printStackTrace();
		}
		String screenShotPath = ScreenshotUtils.takeScreenshot(driver, result.getMethod().getMethodName());
		test.get().fail(result.getThrowable());
		test.get().addScreenCaptureFromPath(screenShotPath,"Failure screenshot");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
	test.get().skip("Test skipped");
	}
	@Override
	public void onFinish(ITestContext context) {
		extr.flush();
	}
}

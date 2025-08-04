package Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
private static ExtentReports extr;

public static ExtentReports getInstance() {
	if(extr == null) {
		String path = System.getProperty("user.dir")+"/reports/ExtentReports.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Automation Report");
		reporter.config().setDocumentTitle("Test Report");
		
		extr = new ExtentReports();
		extr.attachReporter(reporter);
		extr.setSystemInfo("Tester","Adarsha");
	}
	return extr;
	
}
}

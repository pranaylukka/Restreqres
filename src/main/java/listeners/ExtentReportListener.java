package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.ExtentReportSetup;

public class ExtentReportListener extends ExtentReportSetup implements ITestListener{
    ExtentTest et;
	public void onTestStart(ITestResult result) {
		
		et=report.startTest(result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		
       et.log(LogStatus.PASS, result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		
	       et.log(LogStatus.FAIL, result.getMethod().getMethodName());

	}

	public void onStart(ITestContext context) {
		
               setupExtentReport();
	}

	public void onFinish(ITestContext context) {
		
		report.flush();
	}

	
	
	
	
}

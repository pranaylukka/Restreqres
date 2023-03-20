package base;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReportSetup {

	protected static ExtentReports report;
	public void setupExtentReport()
	{
		report =new ExtentReports("report.html");
	}
	
}

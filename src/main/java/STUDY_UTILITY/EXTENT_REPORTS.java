package STUDY_UTILITY;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class EXTENT_REPORTS implements ITestListener {
	
	ExtentReports reports;
	ExtentTest test;
	

	public void onTestStart(ITestResult result) {
		
		String Methodname=result.getMethod().getMethodName();
		test=reports.createTest(Methodname);
		
	
	}
	
	
	public void onTestSuccess(ITestResult result) {
	
		
		String Methodname=result.getMethod().getMethodName();
		test.log(Status.PASS, Methodname+"---->passed");
	}
	
	
   public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		test.log(Status.SKIP, methodName+"--->skipped");
		test.log(Status.SKIP, result.getThrowable());		
	}
   
  /* public void onTestFailure(ITestResult result) {
	   
	  // String msg=result.getMethod().toString();
	   String methodName=result.getMethod().getMethodName();
	   test.log(Status.FAIL, methodName+"----->Failed");
	   test.log(Status.FAIL, result.getThrowable());
	   
	   WEBDRIVERUTILITY  WUTIL=new WEBDRIVERUTILITY();
	   
	   String screenshotname=methodName+new WEBDRIVERUTILITY().getSystemDateInFormat();
	  
	   try {
		   String path=WUTIL.takeScreenShot(BASECLASS_ATEST.driver, screenshotname);
		   test.addScreenCaptureFromPath(path);
	   }
	   catch(IOException e) {
		   e.printStackTrace();
	   }
	   
	   
	}*/
   
   
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		WEBDRIVERUTILITY wLib = new WEBDRIVERUTILITY();
		//JavaUtility jLib = new JavaUtility();
		
		String methodName = result.getMethod().getMethodName();
		String screenShotName = methodName+"-"+wLib.getSystemDateInFormat();
		
		try {
			
			String path = wLib.takeScreenShot(BASECLASS_TC.driver, screenShotName);
			
			test.addScreenCaptureFromPath(path);
			
			test.log(Status.PASS, methodName+" -- FAIL");
			test.log(Status.FAIL, result.getThrowable());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   
   public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	
		
	}

	public void onStart(ITestContext context) {
		
		ExtentSparkReporter htmlreport=new ExtentSparkReporter(".\\ExtentReports\\Report-"+ new WEBDRIVERUTILITY().getSystemDateInFormat()+".html");
		htmlreport.config().setDocumentTitle("PAYTMPE PAYMENTS BANK");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setReportName("PAYTMPE Execution Report");
		
		reports = new ExtentReports();
		reports.attachReporter(htmlreport);
		reports.setSystemInfo("Base-Browser", "Chrome");
		reports.setSystemInfo("Base-platform", "Windows");
		reports.setSystemInfo("Base-URL", "http://paytmpe.qagithub.xyz");
		reports.setSystemInfo("Reporter Name", "Saicharan");
		
	}
	
	public void onFinish(ITestContext context) {
		reports.flush();
	}



		
	
	
}

package TestNGLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListeners implements ITestListener {
	
	public void onTestStart(ITestResult result) {
	}
	public void onTestSuccess(ITestResult result) {
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("for each failure step i.e. for each @Test failed");
		// to print message in report for every failure
		Reporter.log("failed");
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		
		// to add link in report which opens in the same tab
		Reporter.log("<a href=\"C:\\Users\\DELL\\Desktop\\Ranu documents\\Selenium\\eclipse-workspace\\FewFunctions\\test-output\\index.html\">Failed Report Link</a>");
		// to add link in report which opens in a new tab
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\DELL\\Desktop\\Ranu documents\\Selenium\\eclipse-workspace\\FewFunctions\\test-output\\index.html\">Link new tab</a>");
		// to add new line
		Reporter.log("<br>");
		// to add a picture in report
		Reporter.log("<a target=\"_blank\" href=\"C:\\Users\\DELL\\Desktop\\Ranu documents\\Selenium\\eclipse-workspace\\FewFunctions\\screenshot\\Mon_Jun_08_09_14_41_IST_2020.jpg\"><img src= \"C:\\Users\\DELL\\Desktop\\Ranu documents\\Selenium\\eclipse-workspace\\FewFunctions\\screenshot\\Mon_Jun_08_09_14_41_IST_2020.jpg\" height=200 width= 200></a>");
		
	}
	public void onTestSkipped(ITestResult result) {
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}
	public void onStart(ITestContext context) {
		System.out.println("before suite starts i.e. in statring of each test (not each @Test) in testing.xml )");
	}
	public void onFinish(ITestContext context) {
		System.out.println("after suite finishes i.e. in ending of each test (not each @Test) in testing.xml");
	}

	public void afterAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void afterAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		
	}

	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		
	}

	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		// TODO Auto-generated method stub
		
	}

	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		
	}

	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		// TODO Auto-generated method stub
		
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub
		
	}

	public void beforeGetText(WebElement arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateBack(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateForward(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	public void onException(Throwable arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}
}

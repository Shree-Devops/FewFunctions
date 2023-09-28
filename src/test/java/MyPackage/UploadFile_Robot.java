package MyPackage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.awt.datatransfer.StringSelection;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class UploadFile_Robot {

	public static void main(String[] args) throws InterruptedException, AWTException {

		System.setProperty("webdriver.chrome.driver", "C:\\Shree\\Apps\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver drv = new ChromeDriver(); // starting Firefox browser
		drv.manage().window().maximize(); // maximizing window
		drv.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);// for page load
//		drv.get("https://www.grammarly.com/plagiarism-checker");// open testing website
//		drv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// for Implicit wait
//
//		JavascriptExecutor js = (JavascriptExecutor) drv; // Scroll operation using Js Executor
//		js.executeScript("window.scrollBy(0,200)"); // Scroll Down(+ve) upto browse option
//		Thread.sleep(2000); // suspending execution for specified time period
//		
//		drv.findElement(By.xpath("(//*[text()='Upload a file'])[1]")).click();
//		Thread.sleep(2000); // suspending execution for specified time period
//
//		// creating object of Robot class
//		Robot rb = new Robot();
//
//		// copying File path to Clipboard
//		StringSelection str = new StringSelection("Downloads\\ShreeMohiniBaghel_QA_Resume.docx");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
//
//		// press Contol+V for pasting
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		rb.keyPress(KeyEvent.VK_V);
//		Thread.sleep(2000);
//		// release Contol+V for pasting
//		rb.keyRelease(KeyEvent.VK_CONTROL);
//		rb.keyRelease(KeyEvent.VK_V);
//		Thread.sleep(2000);
//		// for pressing and releasing Enter
//		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		// File Download using With The Browser Profile Setting
		
		ChromeOptions options = new ChromeOptions();
				
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.prompt_for_download", false);
		options.setExperimentalOption("prefs", prefs);
				
		RemoteWebDriver driver = new ChromeDriver(options);
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		drv.get("https://chromedriver.storage.googleapis.com/index.html?path=79.0.3945.36/");
		Thread.sleep(2000);
		drv.findElement(By.xpath(".//a[text()='chromedriver_win32.zip']")).click();

//		
////		FirefoxProfile profile=new FirefoxProfile();
////		profile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
////
////		drv=new FirefoxDriver(profile);
////		
//		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
//		chromePrefs.put("profile.default_content_settings.popups", 0);
//		chromePrefs.put("download.default_directory", System.getProperty("user.dir"));
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("prefs", chromePrefs);
//		WebDriver driver = new ChromeDriver(options);
	}

}

package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.HashMap;
import java.util.List;
import java.io.File;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Shree\\Apps\\drivers\\chromedriver\\chromedriver.exe");
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
//		chromePrefs.put("profile.default_content_settings.popups", 0);      //set the auto-download directory in ChromeOptions
		chromePrefs.put("download.prompt_for_download", false);
		chromePrefs.put("download.default_directory", System.getProperty("user.dir"));  //set directory for file download

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		WebDriver driver = new ChromeDriver(options);  //create the driver with that option.
		
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=79.0.3945.36/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//a[text()='chromedriver_win32.zip']")).click();
		
		//Wait 15 seconds to download the file.
		Thread.sleep(15000);
		
		File folder = new File(System.getProperty("user.dir"));
		//List the files on that folder
		File[] listOfFiles = folder.listFiles();
		boolean found = false;
		File f = null;
		     //Look for the file in the files
		     // You should write smart REGEX according to the filename
		for (File myfile : listOfFiles)
		{
			if (myfile.isFile())
			{
				String fileName = myfile.getName();
				System.out.println("File " + myfile.getName());
				if (fileName.matches("chromedriver_win32(.zip)"))
				{
				   f = new File(fileName);
				   found = true;
				}
			}
		}
		Assert.assertTrue(found, "Downloaded document is not found");
		//f.deleteOnExit();
	    }
}

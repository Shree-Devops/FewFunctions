package MyPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.*;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.google.protobuf.Duration;
//import javax.xml.datatype.Duration;
import java.time.Duration;

public class WebTable {
	static WebDriver driver;
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Ranu documents\\Selenium\\Applications\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.cricbuzz.com/cricket-scorecard-archives/scorecard/10719");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		//html[1]/body[1]/div[1]/div[2]/div[4]/div[2]/div[2]/div[1]/div[4]/div[1]/a[1] - 2nd row 1st column
		//html[1]/body[1]/div[1]/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/div[1]/a[1] - first row first column
		//html[1]/body[1]/div[1]/div[2]/div[4]/div[2]/div[2]/div[1]/div[3]/div[2]/a[1] - first row 2nd column
		
		String table = "//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']";
		
		// elements in 1st column
		for (int i=3; i<12 ; i++) {
			String text = driver.findElement(By.xpath(table+"//div[" + i + "]//div[1]")).getText();
			System.out.println(text);
		}
		// elements in 1st row
		for (int i=1; i<8 ; i++) {
			String text = driver.findElement(By.xpath(table+"//div[3]//div[" + i + "]")).getText();
			System.out.println(text);
		}
		// Whole WebTable data
		for (int row =1; row<12 ; row++) {
			for (int col =1; col<8; col++) {
				String text = driver.findElement(By.xpath(table+"//div[" + row + "]//div[" + col + "]")).getText();
				System.out.print(text + "    ");
			}
			System.out.println();
		}
		
	}
	
}

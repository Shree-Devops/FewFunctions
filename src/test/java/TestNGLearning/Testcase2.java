package TestNGLearning;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testcase2 {
	
	public static WebDriver driver;
	
	@Test(groups="group3")
	public void closeBrowser() {
		System.out.println("Close Browser");
		Reporter.log("inside close browser method");
		System.out.println("Test Case One with Thread Id:- " + Thread.currentThread().getId());
	}
	
	@Test
	@Parameters({"myname","yourname"})
	public void parameterization(String myname, String yourname) {
		System.out.println("parameterization " + myname + " " + yourname);
		Reporter.log("parameterization" + myname);
		System.out.println("Test Case One with Thread Id:- " + Thread.currentThread().getId());
	}
	
	@DataProvider //will return the data retrieved in 2 dimensional array because data can be of any data type, hence Object
	public Object[][] getData() throws IOException {
		
		ExcelReader excel = new ExcelReader(System.getProperty("user.dir") + "\\Test Excel.xlsx");
		int rowCount = excel.getRowCount("Sheet1");
		int columnCount = excel.getColumnCount("Sheet1");

		System.out.println("row = " + rowCount + ", column = " +columnCount);
		Object[][] data = new Object[rowCount-1][columnCount];
		
		for (int rows =1; rows < rowCount; rows++) {
			for(int cols=0; cols < columnCount; cols++ ) {
				//System.out.println(excel.getCellData("Sheet1", rows, cols));
				data[rows-1][cols]=excel.getCellData("Sheet1", rows, cols);
			}
		}
		return data;
	}
	@Test(dataProvider="getData")// will retrieve the data from dataProvider="getData"
	public void retrieveData(String username, String password, String YN) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Ranu documents\\Selenium\\Applications\\chromedriver.exe");
		driver  = new ChromeDriver();
		
		System.out.println(username + " " + password + " " + YN);
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(username);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.quit();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
	}
}
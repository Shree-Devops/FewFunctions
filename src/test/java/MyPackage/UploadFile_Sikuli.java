package MyPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UploadFile_Sikuli {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Ranu documents\\Selenium\\Applications\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.edureka.co/");
		driver.findElement(By.xpath("//a[contains(@class,'login_click login-vd giTrackElementHeader')]")).click();
		driver.findElement(By.xpath("//input[@id='si_popup_email']")).sendKeys("ranubaghel671994@gmail.com");
		driver.findElement(By.xpath("//input[@id='si_popup_passwd']")).sendKeys("9424372324");
		driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")).click();
		
		driver.findElement(By.xpath("//img[@class='img30']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
		driver.findElement(By.xpath("//i[@class='icon-camera']")).click();
		driver.findElement(By.xpath("//input[@id='custom-input']")).sendKeys("C:\\Users\\welcome\\Desktop\\OpenButton_capture.jpg");
		driver.findElement(By.xpath("//button[@class='submitbtn']")).click();
		driver.findElement(By.xpath("//button[@class='submitbtn']")).click();
		
		/************************ Upload a file using Sikuli *************
		 * 
		driver.get("https://www.zamzar.com/");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		//driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).sendKeys("C:\\Users\\welcome\\Desktop\\UploadFile_Zamzar.jpg");

		Screen screen = new Screen();
		Pattern img1 = new Pattern("C:\\Users\\welcome\\Desktop\\filename_capture.jpg");
		Pattern img2 = new Pattern("C:\\Users\\welcome\\Desktop\\OpenButton_capture.jpg");
		screen.wait(img1, 10);
		screen.type(img1, "C:\\Users\\welcome\\Desktop\\UploadFile_Zamzar.jpg");
		screen.click(img2);
		*/
	}
}

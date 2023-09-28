package rough;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import org.sikuli.script.FindFailed;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rough {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		/*
		System.setProperty("webdriver.chrome.driver", "D:\\Ranu documents\\Selenium\\Applications\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.edureka.co/");
		driver.findElement(By.xpath("//a[contains(@class,'login_click login-vd giTrackElementHeader')]")).click();
		driver.findElement(By.xpath("//input[@id='si_popup_email']")).sendKeys("ranubaghel671994@gmail.com");
		driver.findElement(By.xpath("//input[@id='si_popup_passwd']")).sendKeys("9424372324");
		driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")).click();
		*/
				
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver(); 
		driver.get("http://www.facebook.com/");
		Actions act = new Actions(driver);
		
		String stringText = driver.findElement(By.xpath("//button[@id='u_0_b']")).getText();
		String attributeText = driver.findElement(By.xpath("//button[@id='u_0_b']")).getAttribute("text");
		
		System.out.println("Get text value - " + stringText);
		System.out.println("Get Attribute value - " + attributeText);
		
		String stringText1 = driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).getText();
		String attributeText1 = driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).getAttribute("text");
		
		System.out.println("Get text value - " + stringText1);
		System.out.println("Get Attribute value - " + attributeText1);
	}
}

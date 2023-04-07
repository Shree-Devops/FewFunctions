package MyPackage;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarAccessing {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Ranu documents\\Selenium\\Applications\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//button[contains(text(),'Ok')]")).click();
		driver.findElement(By.xpath("//span[@class='ui-button-icon-left ui-clickable fa fa-fw fa-calendar']")).click();

		String expectedDate = "06/09/2020";
		int targetDay, targetMonth, targetYear = 0;
		int currentDay, currentMonth, currentYear = 0;
		
		Calendar cal = Calendar.getInstance();
		currentDay = cal.get(Calendar.DAY_OF_MONTH);
		currentMonth = cal.get(Calendar.MONTH)+1;
		currentYear = cal.get(Calendar.YEAR);
		System.out.println("current day - " + currentDay);
		System.out.println("current month - " + currentMonth);
		System.out.println("current year - " + currentYear);
		
		int firstIndex = expectedDate.indexOf('/'); 
		int lastIndex = expectedDate.lastIndexOf('/');
		
		targetDay = Integer.parseInt(expectedDate.substring(0,firstIndex));
		targetMonth = Integer.parseInt(expectedDate.substring((firstIndex +1), lastIndex));
		targetYear = Integer.parseInt(expectedDate.substring(lastIndex +1));
		
		System.out.println("target day - " + targetDay);
		System.out.println("target month - " + targetMonth);
		System.out.println("target year - " + targetYear);
		
		while((targetMonth!=currentMonth)) {
			if(targetMonth>currentMonth) {
				driver.findElement(By.xpath("//span[@class='fa fa-angle-right']")).click();
			}
			else {
				driver.findElement(By.xpath("//span[@class='fa fa-angle-left']")).click();
			}
			currentMonth=currentMonth+1;
		}
		driver.findElement(By.xpath("//a[contains(text(),'" + targetDay + "')]")).click();
	
	}

}

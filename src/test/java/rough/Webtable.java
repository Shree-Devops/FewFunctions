package rough;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	static WebDriver wb;

	public static void main(String[] args) {
		m1();
	}
	
	public static void m1() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Ranu documents\\Selenium\\Applications\\chromedriver_win32 (2)\\chromedriver.exe");
		wb = new ChromeDriver();
		wb.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		List<WebElement> ar = wb.findElements(By.xpath("//table//tr[1]"));
		for (WebElement e : ar){
			System.out.println(e.getText());
		}
	}

}

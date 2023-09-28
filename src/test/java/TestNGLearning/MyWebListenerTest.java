package TestNGLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class MyWebListenerTest {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Ranu documents\\Selenium\\Applications\\chromedriver.exe");
		driver = new ChromeDriver();
		
		EventFiringWebDriver driver1 = new EventFiringWebDriver(driver);
		MyWebListeners listener = new MyWebListeners();
		driver1.register(listener);
		
		driver1.get("https://www.gmail.com/");
		
		EventFiringMouse mouse = new EventFiringMouse(driver1, listener);
		Locatable element = (Locatable) driver1.findElement(By.xpath("//a[@class='h-c-button h-c-header__cta-li-link h-c-header__cta-li-link--primary']"));
		Coordinates cord = element.getCoordinates();
		mouse.mouseMove(cord);
		

	}

}

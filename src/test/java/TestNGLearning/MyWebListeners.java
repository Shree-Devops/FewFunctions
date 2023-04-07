package TestNGLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class MyWebListeners extends AbstractWebDriverEventListener { //or implements WebDriverEventListener

	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("element clicked");
	}
	
}

package com.w2automation.FewFunctions;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class functions {
	
	static WebDriver driver;
	
	// capturing Screenshots
	public static void captureScreenshots() throws IOException {
		
		Date d = new Date();
		String filename = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File( System.getProperty("user.dir") +  "//screenshot//" + filename));
	}
	/*
	public static void main(String[] args) throws InterruptedException, IOException, SQLException {
		
		DBManager.setDBConnection();// to establish connection from data base
		System.out.println(DBManager.getMySQLQuery("Select tutorial_author from selenium;"));// to run the query
		*/
	/*	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	*/	
		//driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		
		//Slider practice - https://jqueryui.com/resources/demos/slider/default.html
		/*
		Actions act = new Actions(driver);
		
				WebElement ele = driver.findElement(By.xpath("//div[@id='slider']"));
				act.dragAndDropBy(ele, 500, 0).perform();
		//Resize 
				driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
				WebElement resizable = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]"));
				act.dragAndDropBy(resizable,350, 450).perform();
		//Resize a Window
				Dimension windowSize = driver.manage().window().getSize();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				driver.manage().window().setSize(new Dimension(200,300));
		//Drag and drop an element onto another
				driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
				WebElement dragMe = driver.findElement(By.xpath("//div[@id='draggable']"));
				WebElement DropOnMe = driver.findElement(By.xpath("//div[@id='droppable']"));
				Thread.sleep(3000);
				act.dragAndDrop(dragMe, DropOnMe).perform();
		//Right click on an element
				driver.get("http://deluxe-menu.com/popup-mode-sample.html");
				act.contextClick(driver.findElement(By.xpath("//p[contains(text(),'  Click the image to show the menu')]/img[@style='cursor: pointer;']"))).perform();
		// Hover over an element
				act.moveToElement(driver.findElement(By.xpath("//td[@id='dm2m1i1td']"))).perform();
				//Practice -> http://way2automation.com/way2auto_jquery/index.php
		
		//Use Keys from keyboard
			driver.get("https://gmail.com");
			act.keyDown(driver.findElement(By.xpath("//div[@class='DRS7Fe bxPAYd k6Zj8d']")), Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
			act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();			
			act.keyDown(driver.findElement(By.xpath("//input[@id='identifierId']")), Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
			act.sendKeys(Keys.ENTER).perform();
		// Alert	
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			driver.findElement(By.xpath("//input[@name='proceed']")).click();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			//Or
			Alert alert = driver.switchTo().alert();
			alert.getText();

		// Frames
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		for (WebElement frame: frames) {
			System.out.println(frame.getAttribute("id"));
		}
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
	*/
				/*
		// handling Multiple windows or tabs
				
		driver.get("https://www.icicibank.com/");
		String mainWindow = driver.getWindowHandle();
		
		captureScreenshots();
		System.out.println("after browser opening Window Handles - " + mainWindow);
		driver.findElement(By.xpath("//div[@class='siteCaptureContent']//div[@id='modal-close']")).click();
		driver.findElement(By.xpath("//div[@class='push-popup desktop-only']//div[@id='push-modal-close']")).click();
		captureScreenshots();
		
		driver.findElement(By.xpath("//li/a[contains(text(),'Private')]")).click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		System.out.println("after clicking on private once Window Handles - " + driver.getWindowHandles());
		captureScreenshots();
		
		driver.switchTo().window(mainWindow);
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		System.out.println("after navigating back to main tab Window Handles - " + driver.getWindowHandles());
		System.out.println("Current window handle " + driver.getWindowHandle());
	
		driver.findElement(By.xpath("//li/a[contains(text(),'Private')]")).click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		System.out.println("after clicking on private 2nd time Window Handles - " + driver.getWindowHandles());
		System.out.println("Current window handle " + driver.getWindowHandle());//will return window handle of the first window only, because we need to switch to the new window (can be done using iterator) in order to get its window handle
		
		Set <String> windowIds = driver.getWindowHandles();
		Iterator<String> iterator = windowIds.iterator();
		String firstWindow = iterator.next();
		String secondWindow = iterator.next();
		String thirdWindow = iterator.next();
		
		driver.switchTo().window(secondWindow);
		System.out.println("Current/ second window handle " + driver.getWindowHandle()); //will return window handle of the current/second window.
		captureScreenshots();
		
		driver.switchTo().window(thirdWindow);
		System.out.println("Current/ third window handle " + driver.getWindowHandle()); //will return window handle of the current/third window.
		captureScreenshots();
		
		System.out.println("first window" + firstWindow);
		System.out.println("second window" + secondWindow);
		System.out.println("third window" + thirdWindow);
		
		/*
	
		/*		// CSS value -  not working right now
		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='siteCaptureContent']//div[@id='modal-close']")).click();
		driver.findElement(By.xpath("//div[@class='push-popup desktop-only']//div[@id='push-modal-close']")).click();
		
		String colour = driver.findElement(By.xpath("//a[@class='btn inline-btn newUser']")).getCssValue("colour");
		System.out.println("abc");
		System.out.println(colour);
		
		
		/*
				driver.get("http://way2automation.com/way2auto_jquery/submit_button_clicked.php");
				WebDriverWait wait = new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Signin')]")));
				driver.findElement(By.xpath("//*[contains(text(),'Signin')]")).click();
				
				WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
				WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
				WebElement button = driver.findElement(By.xpath("//input[@value='Submit']"));
				
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				executor.executeScript("arguments[0].value='shreemohini';", username);
				executor.executeScript("arguments[0].value='9424372324';", password);
				executor.executeScript("arguments[0].click();", button);
				
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Dynamic Elements')]")));
				act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Dynamic Elements')]"))).perform();
				Thread.sleep(3000);
				act.click(driver.findElement(By.xpath("//a[contains(text(),'Submit Button Clicked')]")));
				/*
				WebElement submitButton = driver.findElement(By.className("submit"));
				String id = submitButton.getAttribute("id");
				System.out.println("Id value of Submit button is - " + id);
				submitButton.click();
				id = submitButton.getAttribute("id");
				System.out.println("Id value of Submit button is - " + id);
				submitButton.click();
				id = submitButton.getAttribute("id");
				System.out.println("Id value of Submit button is - " + id);
				submitButton.click();
				id = submitButton.getAttribute("id");
				System.out.println("Id value of Submit button is - " + id);
				
				*/
				//driver.close();
	//}
}

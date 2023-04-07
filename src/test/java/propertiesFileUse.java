import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class propertiesFileUse {

	public static void main(String[] args) throws IOException {
		
		 Properties prop = new Properties();
		 
		 FileInputStream fi = new FileInputStream("src/config.properties");
		 prop.load(fi);
		 
		 System.setProperty("webdriver.gecko.driver",prop.getProperty("geckodriverpath"));
		 
		 WebDriver driver = new FirefoxDriver();
		 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 driver.get(prop.getProperty("URL"));
		
		 driver.manage().window().maximize();
		 

	}

}

package MyPackage;

import org.apache.commons.codec.binary.Base64;
//import org.apache.commons.net.util.Base64;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class FirefoxProfiles {
	
	public static void main(String[] args) {
		
		ProfilesIni profile = new ProfilesIni();
		FirefoxProfile Profile1  = profile.getProfile("default");
		FirefoxProfile Profile2  = profile.getProfile("Shree");
		
		FirefoxOptions option1 = new FirefoxOptions();
		FirefoxOptions option2 = new FirefoxOptions();
		option1.setProfile(Profile1);
		option2.setProfile(Profile2);
		
		System.setProperty("webdriver.gecko.driver", "D:\\Ranu documents\\Selenium\\Applications\\geckodriver.exe");
		
		WebDriver driver1 = new FirefoxDriver(option1);
		WebDriver driver2 = new FirefoxDriver(option2);
		driver1.get("https://way2automation.com");
		driver2.get("https://google.com");
		System.out.println(driver1.getTitle());
		System.out.println(driver2.getTitle());
		
		/********************************************************************/
		// Capabilities - Bypassing errors and certificates 
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		WebDriver driverr = new InternetExplorerDriver(options);
		driverr.get("http://www.cricbuzz.com/cricket-scorecard-archives/scorecard/10719");
		
		/********************************************************************/
		// Encoding Decoding 
		byte[] bytesEncoded = Base64.encodeBase64("Hello".getBytes());
		System.out.println("encoded value is - " + new String(bytesEncoded));
		
		byte[] valueDcoded = Base64.decodeBase64(bytesEncoded);
		System.out.println("decoded value is - " + new String(valueDcoded));
		
		
	}
}

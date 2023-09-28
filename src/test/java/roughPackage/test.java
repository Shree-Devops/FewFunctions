package roughPackage;
import java.lang.Class;
import java.lang.reflect.Method;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.util.*;
public class test {
	
	public static void main(String[] args) throws Exception{

//		AParent p1 = new AParent();
//		p1.method1();
//		AParent p2 = new BChild();
//		p2.method1();
		// BChild c1 =  new AParent(); // throw error Type mismatch: cannot convert from AParent to BChild
		// BChild c1 =  (BChild) new AParent(); // Run time exception - ClassCastException
		
		//CChild ccc = new CChild();
//		CChild.method1();
//		CChild.method2();
//		CChild.parentunique();
//		
////		BChild cc = new CChild();
//		BChild.method2();
//		BChild.parentunique();
//		BChild.method1();
//		
////		AParent c = new CChild();
//		AParent.method2();
//		AParent.parentunique();
//		AParent.method1();

//		CChild c = new CChild();
//		c.nonstaticmethod();
//		c.staticmethod();
//		c.parentChildBnonstatic();
//		c.parentChildBstatic();
//		c.parentnonstaticunique();
//		c.parentstaticunique();
//		c.parentChildcstatic();
//		c.parentChildcnonstatic();
//		c.ChildCstaticunique();
//		c.ChildCnonstaticunique();
//		c.ChildBChildCnonstatic();
//		c.ChildBChildCstatic();
		
//		BChild dd = new CChild();
//		dd.nonstaticmethod();
//		dd.staticmethod();
//		dd.parentChildBnonstatic();
//		dd.parentChildBstatic();
//		dd.parentnonstaticunique();
//		dd.parentstaticunique();
//		dd.parentChildcstatic();
//		dd.parentChildcnonstatic();
//		((CChild) dd).ChildCstaticunique();  
//		((CChild) dd).ChildCnonstaticunique(); 
//		dd.ChildBChildCnonstatic();
//		dd.ChildBChildCstatic();
		
//		AParent aa = new CChild();
//		aa.nonstaticmethod();
//		aa.staticmethod();
//		aa.parentChildBnonstatic();
//		aa.parentChildBstatic();
//		aa.parentnonstaticunique();
//		aa.parentstaticunique();
//		aa.parentChildcstatic();
//		aa.parentChildcnonstatic();
//		((CChild) aa).ChildCstaticunique(); 
//		((CChild) aa).ChildCnonstaticunique(); 
//		((CChild) aa).ChildBChildCnonstatic(); 
//		((CChild) aa).ChildBChildCstatic(); 
//		((BChild) aa).ChildBChildCnonstatic(); 
//		((BChild) aa).ChildBChildCstatic(); 
		
//		CChild.staticmethod();
//		BChild.staticmethod();
//		AParent.staticmethod();
//		CChild.parentChildBstatic(); 
//		CChild.parentstaticunique(); 
		
//		BChild bb = (BChild) new AParent(); // run time cast error 
		
		
//		//count of each character
//		
//		String str = "shree mohini baghel";
//
//		//each character count using hashmap
//		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
//		int count;
//		
//		for (int i=0; i<str.length(); i++)
//		{	
//			count =1;
//			if(hmap.keySet().contains(str.charAt(i)))
//			{
//				count = hmap.get(str.charAt(i))+1;
//			}
//			hmap.put(str.charAt(i), count);
//		}
//		Set <Character> setOfKeys = hmap.keySet(); 
//		for (Character key: setOfKeys) {
//			System.out.println(key + " Value - "+ hmap.get(key));
//		}	
		
//			System.setProperty("webdriver.chrome.driver", "C:\\Shree\\ShreeWork\\Apps\\drivers\\chromedriver\\chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
//			driver.get("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&as-pos=1&as-type=TRENDING&suggestionId=mobiles&requestId=0f0fe6a1-2532-4ad1-96ba-af715cec02b3");
//			driver.manage().window().maximize();
//			WebElement ele = driver.findElement(By.xpath("//div[@class='_31Kbhn _28DFQy']"));
//			Actions act =  new Actions(driver);
//			act.dragAndDropBy(ele, 55, 0).perform();
//			Thread.sleep(4000);
//			//act.sendKeys(ele, Keys.PAGE_DOWN).perform();
//			driver.findElement(By.xpath("//*[contains(text(), 'Contact Us')]")).sendKeys(Keys.PAGE_DOWN);
//			Thread.sleep(4000);
//			act.sendKeys(Keys.PAGE_UP).perform();
//			
//			JavascriptExecutor js = (JavascriptExecutor) driver;	
//	        js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");	// scroll till top of the page
//	        js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); // scroll till end of the page
//			 
//		HashMap<Integer,String> hmap=new HashMap<Integer,String>();  
//		hmap.size();
//		hmap.put(9, "shree4");
//		hmap.put(15, "shree1");
//		hmap.put(33, "shree3");
//		hmap.put(17, null);
//		
//		System.out.println(hmap);
//	    
//	    TreeMap<Integer,String> tmap=new TreeMap<Integer,String>(hmap); // sorted using ascending value of Key
//	    System.out.println(tmap);
//	    
//	    ArrayList<String> al = new ArrayList<String>(hmap.values());
//	    Collections.sort(al);
//	    LinkedHashMap<Integer,String> lmap=new LinkedHashMap<Integer,String>();
		
		
//		AbsChild ab = new AbsChild();
//		ab.method2();
//		ab.var1=2;
//		System.out.println("var1 from abstract class - " + ab.var1);
		
//		AbsChild ab = new AbsChild();
//		ab.method3();
//		ab.method4();
//		ab.method5();
//		ab.method14();
//		MyInterface.method15();
//		MyInterface.method16();
//
//		
//		//ab.var2=2;
//		System.out.println("var1 from abstract class - " + ab.var2);
		
		//  *
		// ***
		//*****
		int n=3;
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n-i-1; j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<(2*i+1); k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		//reverse each word
		String str ="Shree Mohini Baghel";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());
		
		String[] strar = str.split(" ");
		str="";
		for(int i=strar.length-1; i>=0; i--)
		{
			str = str+strar[i] + " ";
		}
		System.out.println(str);
		
		str="";
		for(int i=0; i<strar.length; i++)
		{
			StringBuilder sbb = new StringBuilder(strar[i]);
			str= str + sbb.reverse() + " ";
		}
		System.out.println(str);
		
		str="";
		for(int i=0; i<strar.length; i++)
		{
			for(int j=strar[i].length()-1; j>=0; j--)
			{
				str=str+strar[i].charAt(j);
			}
			str=str+" ";
		}
		System.out.println(str);
		
	}
	
}	



















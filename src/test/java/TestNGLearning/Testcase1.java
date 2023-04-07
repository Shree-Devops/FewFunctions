package TestNGLearning;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 {
	String actual = "shree";
	String expected = "shree mohini";
	@Test(groups= {"group1", "group3"})
	public void test1() {
		Assert.assertEquals(actual, actual);
		System.out.println("abc");
	}
	//@BeforeTest// before executing any annotation executed once
	public void establishConnection() {
		System.out.println("Establish connection");
	}
	//@BeforeMethod// before each @Test
	public void launchBrowser() {
		System.out.println("Launch Browser");
	}
	@Test(groups="group2")//(priority=1, dependsOnMethods="test1")
	public void doRegistration() {
		System.out.println("Executing User registration Test");
	}
	@Test(groups="group1")
	public void doLogin() {
		System.out.println("Executing Login Test");
		Assert.assertEquals(actual, actual);
	}
	//@AfterMethod // after each @Test
	public void closeBrowser() {
		System.out.println("Close Browser");
	}
	//@AfterTest // after executing all annotation executed once
	public void closeConnection() {
		System.out.println("close connection");
		
	}
	//@BeforeSuite // before the execution of all the test methods in the suite executed once
	public void method1() {
		System.out.println("close connection");
	}
	//@AfterSuite // after the execution of all the test methods in the suite executed once
	public void method2() {
		System.out.println("close connection");
	}
	//@BeforeClass // before the first method of the current class executed once
	public void method3() {
		System.out.println("close connection");
	}
	//@AfterClass // after the after the execution of all the test methods of the current class executed once
	public void method4() {
		System.out.println("close connection");
	}
	//@BeforeGroups // before execution of all test cases belonging to that group executed once
	public void method5() {
		System.out.println("close connection");
	}
	//@AfterGroups // after execution of all test cases belonging to that group executed once
	public void method6() {
		System.out.println("close connection");
	}
}

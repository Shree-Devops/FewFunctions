package JUnitLearning;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnit {
	
	public static boolean DBconnection() {
		System.out.println("DB connection");
		return true;
	}
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before Class");
		Assert.assertTrue(DBconnection());
		//if the above Assert fails, no @Test, @Before and @After annotations inside this class will execute. But @AfterClass will execute.
		// Annotations from other classes will execute without any interruption.
	}
	@Ignore
	@Test
	public void method1() {
		System.out.println("method1 inside JUnit class");
	}
	@Test
	public void method2() {
		System.out.println("method2 inside JUnit class");
	}
	@Before
	public void before() {
		System.out.println("before");
	}
	@After
	public void after() {
		System.out.println("after");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("after Class");
	}
	/*
	@ParameterizedTest
	public void ignores() {
		System.out.println("ignores");
	}
*/
}

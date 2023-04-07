package JUnitLearning;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class JUnitAssertions {
	String expectedTitle = "Title";
	String actualTitle = "Title1";
	
	@Rule
	public ErrorCollector erColletor = new ErrorCollector();
	
	@Test
	public void assertion() {
		try {
		Assert.assertTrue("Title does not match", expectedTitle.equals(actualTitle));
		System.out.println("titles match");
		}
		catch(Throwable t){
			erColletor.addError(t);
			System.out.println("titles do not match");
		}
	}
}

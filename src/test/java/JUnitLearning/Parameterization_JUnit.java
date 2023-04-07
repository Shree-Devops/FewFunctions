package JUnitLearning;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//first step
@RunWith(Parameterized.class)
public class Parameterization_JUnit {
	
	//second step - defining parameters
	String firstname;
	String lastname;
	String password;
	int age;
	
	//third step
	public Parameterization_JUnit (String firstname, String lastname, String password, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.age = age;
	}

	//fourth step
	@Parameters
	public static Collection <Object[]> getData(){
		
		Object [][] data = new Object[2][4]; // test will run twice (for 2 set of data), 4 column names
		
		data[0][0] = "Shree";
		data[0][1] = "Baghel";
		data[0][2] = "Shree123";
		data[0][3] = 26;
		
		data[1][0] = "Mohini";
		data[1][1] = "Baghel2";
		data[1][2] = "Pwd";
		data[1][3] = 27;
		return Arrays.asList(data);
	}
	
	@Test
	public void doLogin () {
		System.out.println(firstname + ", " + lastname + ", " + password + ", " + age);
	}
}

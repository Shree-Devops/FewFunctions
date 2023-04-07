package Exceptions_ExceptionsHandling;

public class uncaughtException {

	public static void main(String[] args) throws Exception {
		throw new Exception ("!!! ERROR !!!");
	}
	/*
	 Difference between throw and throws
		throw - throw an exception explicitly in the program inside a function or inside a block of code
			  - We can't through multiple exceptions using this
		throws - used in method signature used to declare an exception which might get thrown by the function while executing the code
			   - We can declare multiple exceptions e.g. public void method()throws IOException,SQLException{} 
	 */
}

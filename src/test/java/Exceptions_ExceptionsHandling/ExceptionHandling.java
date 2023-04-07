package Exceptions_ExceptionsHandling;

public class ExceptionHandling {

	public static void main(String[] args) throws NullPointerException {
		try {
			String str = null;
			str.length(); // will cause NullPointerException
			int i = 10/0; // will cause ArithmeticException
			System.out.println("in try after exception");
			
			}
		catch (ArithmeticException e) {
			System.out.println("arithmatic exception occured");
			
		}
		catch (Throwable e) { // Throwable (superclass class of Exception and Error) class can also be used instead of Exception which will handle errors as well
			System.out.println("exception occured");
			System.out.println("exception message " + e.getMessage());
			// System.exit(0); // will cause finally block to skip and not execute
		}
		finally {
			System.out.println("finally close my browser irrespective of exception occurance");
		}
		System.out.println("after all try catch");

	}

}

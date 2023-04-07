package Exceptions_ExceptionsHandling;

import java.util.ArrayList;
import java.util.Arrays;

public class Exceptions_eg {

	public static void main(String[] args) {
		
		ArrayList arraylist = new ArrayList();
		arraylist.add("aa");
		arraylist.add("bb");
		arraylist.add("cc");
		String string1 = null;
		String string2 = "shre";
		String[] stringArray = null;
		int[] intArray = {1,2,3};
		//int[] intArray2 = new int [-3]; // NegativeArraySizeExcetion
		int i = 5;
		int j = 0;
		
		//int
		//int k = i/j; // ArithmeticException
		
		// String
		//System.out.println("length of string1 - " + string1.length());// NullPointerException
		//System.out.println(myDummyMethod(string1)); //IllegalArgumentException
		
		//System.out.println("-1th element - " + string2.charAt(-1)); //StringIndexOutOfBoundException
		//System.out.println("5th element - " + string2.charAt(5)); //StringIndexOutOfBoundException
		System.out.println("index of s - " + string2.indexOf('s'));
		string2= 2 + string2 + "345"; // adding to a string
		System.out.println("length of string2 after adding 2 and 345 - " + string2.length()); //  String Length
		System.out.println("string2 - " + string2);
		
		string2 = string2.substring(0, 5) + string2.substring(6); // removing 5th element
		System.out.println("string2 - " + string2);
		
		// Adding an element to a string at an index
		StringBuffer strBuffer = new StringBuffer(string2);
		strBuffer.insert(5,"A"); // adding A at 5th index
		string2 = strBuffer.toString(); // convert back to string
		System.out.println("string2 - " + string2);
		
		// Array
		//System.out.println("length of stringArray - " + stringArray.length);// NullPointerException
		
		System.out.println("length of intArray - " + intArray.length);
		//System.out.println("-1th element - " + intArray[-3]); //ArrayIndexOutOfBound
		//System.out.println("3rd element - " + intArray[3]); //ArrayIndexOutOfBound

		// ArrayList
		//System.out.println("-1th element - " + arraylist.get(-1));// ArrayIndexOutOfBound
		//System.out.println("4th element - " + arraylist.get(4));// index out of bound

	}
	public static int myDummyMethod(String str) {
		if(str==null) { // if str is null then IllegalArgumentException will be thrown where this method is called before coming here
			throw new IllegalArgumentException("The argument cannot be null");
		}
		return str.length();
	}

}

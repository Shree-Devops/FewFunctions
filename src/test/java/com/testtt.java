package com;

import java.util.*;

public class testtt {

	// Integer, String, Boolean
	// int, boolean
	public static String stringObj = new String("trueObj");
	public static String str = "true";
	public static int i = 12;
	public static Integer intObj = new Integer(123);
	public static boolean bool = true;
	public static Boolean boolObj = new Boolean(false);

	public static void assignValues() {
		stringObj = "false";
		str = "true";
		i = 12;
		intObj = 123;
		bool = true;
		boolObj = false;
	}

	public static void main(String[] args) {
//
//	    double myDouble = 9; // Automatic casting: int to double
//	    System.out.println(myDouble);   // Outputs 9.0
//	    
//	    int myIntt = (int) 9.78d; // Manual casting: double to int
//	    System.out.println(myIntt);      // Outputs 9
//	    
//	    ArrayList al = new ArrayList (); 
//		al.add("Sachin");
//		al.add("22");
//		al.add(33);
//		al.add(true);
//		System.out.println(al);
//		System.out.println(al.get(0) + " and Class of it is - " +al.get(0).getClass());
//		System.out.println(al.get(1) + " and Class of it is - " +al.get(1).getClass());
//		System.out.println(al.get(2) + " and Class of it is - " +al.get(2).getClass());
//		System.out.println(al.get(3) + " and Class of it is - " +al.get(3).getClass());
//		String a = (String) al.get(0); // String object into string
//		System.out.println(a);
//		String b = (String) al.get(1);  // String object into string
//		System.out.println(b);
//		int c = (int) al.get(2); 		// Integer object into int
//		System.out.println(c);
//		boolean d = (boolean) al.get(3); // Boolean object into boolean
//		System.out.println(d);
//		
//		String e = al.get(0).toString();// String object into string
//		System.out.println(e);
//		String h = al.get(1).toString();// String object into string
//		System.out.println(h);
//		String f = al.get(2).toString();// Integer object into string
//		System.out.println(f);
//		String g = al.get(3).toString();// Boolean object into string
//		System.out.println(g);

		// Integer to int
		int a = intObj;
		System.out.println(a);

		// int to Integer
		assignValues();
		intObj = 2;
		System.out.println(intObj + " class - " + intObj.getClass());
		
		// Boolean to boolean
		assignValues();
		boolean b = boolObj; 
		System.out.println(b);
		
		// boolean to Boolean
		assignValues();
		boolObj = true;
		System.out.println(boolObj + " class - " + boolObj.getClass()); // boolean to Boolean

		// Integer to String
		assignValues();
		stringObj = intObj.toString();
		System.out.println(stringObj + " class - " + stringObj.getClass());
		str = intObj.toString();
		System.out.println(str);

		// String to Integer
		assignValues();
		intObj = Integer.parseInt(str);
		System.out.println(intObj + " class - " + intObj.getClass());
		intObj = Integer.parseInt(stringObj);
		System.out.println(intObj + " class - " + intObj.getClass());

		// String to Boolean
		assignValues();
		boolObj = Boolean.parseBoolean(str);
		System.out.println(boolObj + " class - " + boolObj.getClass());
		boolObj = Boolean.parseBoolean(stringObj);
		System.out.println(boolObj + " class - " + boolObj.getClass());

		// Boolean to String
		assignValues();
		str = boolObj.toString();
		System.out.println(str);
		stringObj = boolObj.toString();
		System.out.println(stringObj + " class - " + stringObj.getClass());

		// String to int
		assignValues();
		int numstr = Integer.parseInt(str); // String to int
		System.out.println(numstr);
		int numobj = Integer.parseInt(stringObj);
		System.out.println(numobj);

		// int to String
		assignValues();
		str = Integer.toString(i); // int to String
		System.out.println(str);
		stringObj = Integer.toString(i);
		System.out.println(stringObj + " class - " + stringObj.getClass());

		// String to boolean
		assignValues();
		bool = Boolean.parseBoolean(str); // String to boolean
		System.out.println(bool);
		bool = Boolean.parseBoolean(stringObj); // String to boolean
		System.out.println(bool);

		// boolean to String
		assignValues();
		str = Boolean.toString(bool); // boolean to String
		System.out.println(str);
		stringObj = Boolean.toString(bool);
		System.out.println(stringObj + " class - " + stringObj.getClass());

		// Integer to Boolean
		// Boolean to Integer		
		// Boolean to int
		// int to Boolean
		// int to boolean
		// Integer to boolean
		// boolean to Integer

	}
}

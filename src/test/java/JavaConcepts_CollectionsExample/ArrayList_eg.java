package JavaConcepts_CollectionsExample;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

public class ArrayList_eg {
	
	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		
		arrayList.add(11);
		arrayList.add("shree"); // method add accepts object as parameter hence any data type can be stored (Object is a super class of all internal primitive data type class Integer, Long etc. in java)
		arrayList.add("s");
		arrayList.add(11.23);
		arrayList.add(11);
		arrayList.add(null);
		arrayList.add(null);
		arrayList.add(999999999); // during run time compiler converts primitive data type into object of respective class e.g. Integer, Long.
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		System.out.println(arrayList.get(3));
		arrayList.remove(3);
		System.out.println(arrayList.get(3));
		
		for (Object obj: arrayList) {
			System.out.println(obj);
		}
		//OR
		Iterator itr = arrayList.iterator(); // Iterator is an interface
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Object ob = arrayList.get(0);
		// int value = 10 + ob ; // will through an error coz values present in ArrayList are objects we cannot add it to an int value.
		int value = 10 + (Integer)ob; // will work
		// but if the value at 0th index is changed to string the above line will throgh an error.
		// to avoid this generic ArrayList is used
		
		ArrayList <Integer> genericArrayList = new ArrayList <Integer> (); // Interger is class here not datatype
			genericArrayList.add(10);
			// genericArrayList.add(10.1); // will through eoor coz can only addd integer or null value

			
	}
	
}

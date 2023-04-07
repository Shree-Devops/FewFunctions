/* 
 * Save this in a file called Main.java and compile it. To test it 
 * create the file `input.txt` in the workspace / Working Directory
 * (For Eclipse/VisualStudio, by default this is the top level project folder)
 */

/* Do not add a package declaration */
package rough;
import java.util.*;
import java.util.Map.Entry;
import java.io.*;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class Rrough {

	static public void main (String[] args) {
        //process("");
    	
    	String str = "Welcome To Java";
    	String[] al = str.split(" ");
    	for (String s : al)
    	{
    		if (Character.isUpperCase(s.charAt(0)))
    			System.out.println(s.charAt(0));
    		else 
    			System.out.println("No");
    	}
    }
    
    public static void process(String str) {
    	
    	Hashtable<Integer, String> ht1 = new Hashtable<>(); // will have capacity 11
    	HashMap<Integer, String> hm = new HashMap<>();
		ht1.put(1, "one");
		ht1.put(2, "two");
		ht1.put(4, "four");
		ht1.put(5, "five");
		ht1.put(3, "three");
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(4, "four");
		hm.put(5, "five");
		hm.put(3, "three");
		
		//ht1.remove(4); 
		
		  
		//Iterate over a hashmap
		System.out.println("Iterating over a Hashmap");
		
		Set <Integer> setOfKeys = hm.keySet(); // will return a set of keys coz keys are unique
		for (Integer key: setOfKeys) {
			System.out.println(key + " " + hm.get(key));
		}
		
		//Iterate over a Hashtable
				System.out.println("Iterating over a Hashtable");
				
				for (Map.Entry<Integer, String> e : ht1.entrySet()){
					System.out.println(e.getKey() + " " + e.getValue()); 
				}  
				System.out.println(" OR ");
				
				Set <Integer> setOfHashtableKeys = ht1.keySet(); // will return a set of keys coz keys are unique
				for (Integer key: setOfHashtableKeys) {
					System.out.println(key + " " + ht1.get(key));
				}
    }
    
}

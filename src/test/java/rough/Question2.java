/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
package rough;
import java.util.*;
import java.io.*;

/* You may add any imports here, if you wish, but only from the 
   standard library */

public class Question2 {
    public static int processArray(ArrayList<Integer> array) {
        /* 
         * Modify this function to process `array` as indicated
         * in the question. At the end, return the appropriate
         * value.
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method
         *
         * Submit this entire program (not just this function)
         * as your answer
         */
    	int maxOdd=0;
    	for (int i=0; i<array.size(); i++) {
    		
    		if(!(array.get(i)%2==0)) {
    			
    			if(maxOdd<array.get(i)) {
    				maxOdd=array.get(i);
    			}
    			
    		}
    	}
    	
        return maxOdd;
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(1);
        arrayList.add(7);
        
        System.out.print( processArray(arrayList));
    }
}

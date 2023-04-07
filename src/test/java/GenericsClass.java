import java.util.ArrayList;

public class GenericsClass {
	    
		// Generic method example 
	    static <T> void genericDisplay (T element){ 
	        System.out.println(element.getClass().getName() + " = " + element); 
	    } 
	   
	    public static void main(String[] args){ 
	        genericDisplay(11); 
	        genericDisplay("GeeksForGeeks"); 
	        genericDisplay(1.0); 
	        
	        ArrayList al = new ArrayList(); 
	        
	        al.add("Sachin"); 
	        al.add("Rahul"); 
	        al.add(10); // Compiler allows this 
	  
	        String s1 = (String)al.get(0); 
	        String s2 = (String)al.get(1); 
	  
	        // Causes Runtime Exception
	        String s3 = (String)al.get(2); 
	    } 
	    
}
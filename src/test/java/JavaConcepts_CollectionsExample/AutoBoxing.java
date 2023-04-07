package JavaConcepts_CollectionsExample;

public class AutoBoxing {
	
	public static void main(String[] args) {
		int var = 10;
		Integer obj = new Integer(var); //wrapping integer value into an object
		System.out.println(obj);
		int i = obj; //unwrapping - Unboxing
	}
	
}

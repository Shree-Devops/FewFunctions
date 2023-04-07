package Reflection_eg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class testingReflection {

	public static void main(String[] args) {
		
		ReflectionTest t = new ReflectionTest();
		t.getClass(); // will return class of t object
		Class cls = t.getClass();
		System.out.println(cls.getSimpleName());
		
		Constructor[] cons = cls.getDeclaredConstructors();  // Returns an array of Constructor objects 
		for(Constructor con: cons) {
			System.out.println("Constructors - " + con.getName());
		}
		
		Method[] methods = cls.getDeclaredMethods();  //Returns an array containing Method objects of requested class or interface
		System.out.println(methods.length);
		
		Method[] allMethods = cls.getMethods();  //Returns an array containing Method objects of requested class or interface those inherited from superclasses and superinterfaces
		System.out.println(allMethods.length);

		for(Method me : methods) {
			System.out.print(" method name - " + me.getName() + ", Return type - " + me.getReturnType()); // can write inside @BeforeMethod method to get method name of each executing method
			
			Parameter[] params = me.getParameters();  //Returns an array of Parameter objects that represent all the parameters to the underlying executable represented by this object. Returns an array of length 0 if the executable has no parameters.
			for (Parameter pm: params) {
				System.out.println(" Parameters - " + pm.getType().getSimpleName());
			}
		}
		
		// Whenever an object of any class is created -> object of "Class" class is automatically created
		// Whenever a method is called -> method executed -> object of "Method" class is automatically created
		// Whenever a constructor is called ->detailes of this constructor are stored in Constructor class automatically
	}
}

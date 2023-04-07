package Reflection_eg;

import java.util.ArrayList;

public class ReflectionTest {

	public ReflectionTest() {
		
	}
	public ReflectionTest(int a) {
	}
	
	public static void main(String[] args) {
		
		ReflectionTest t = new ReflectionTest();
		System.out.println(t);
		System.out.println(t.getClass());
		System.out.println(t.getClass().getSimpleName());
	}
	void method1(){
		
	}
	
	public int method2(int a, String b){
		return a;
	}
	
	public static void method3(boolean a){
		
	}
	private ArrayList<Integer> method4(ArrayList<Integer> a) {
		return a;
	}
	

}

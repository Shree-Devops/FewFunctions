package AccessModifiers2;

import AccessModifiers.PublicModifierClass1;

public class PublicModifierClass2 extends PublicModifierClass1{
	
	public static void main(String[] args) {
		
		//method();		
	}
	
	public static void method() {
		 
		
		PublicModifierClass1 pmc1 = new PublicModifierClass1();
		System.out.println("Public Variable - " + pmc1.publicVariable);
		//System.out.println("Default Variable - " + pmc1.defaultVariable); // error coz trying to access default member outside package
		//System.out.println("Protected Variable - " + pmc1.protectedVariable); // error coz trying to access protected member outside package (without inheritance)
		//System.out.println("Private Variable - " + pmc1.privateVariable); // error coz trying to access private member outside package
		
		PublicModifierClass2 pmc2 = new PublicModifierClass2();
		System.out.println("Protected Variable - " + pmc2.protectedVariable); // accessing protected member outside package with inheritance (created object of child class)
	}
	public void PublicModifierClass2_Method1() {
		//DefaultModifierClass1 dmc1 = new DefaultModifierClass1();  // accessing default class present in another package -> can't access
		PublicModifierClass1 pmc1 = new PublicModifierClass1(); // accessing public class present in another package
	}

}

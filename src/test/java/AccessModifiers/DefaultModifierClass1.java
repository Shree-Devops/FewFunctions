package AccessModifiers;

import AccessModifiers2.PublicModifierClass2;

class DefaultModifierClass1 {

	public static void main(String[] args) {
		
		PublicModifierClass1 pmc1 = new PublicModifierClass1();
		System.out.println("Public Variable - " + pmc1.publicVariable);
		System.out.println("Default Variable - " + pmc1.defaultVariable);
		System.out.println("Protected Variable - " + pmc1.protectedVariable);
		//System.out.println("Private Variable - " + pmc1.privateVariable); // error - coz trying to access Private member outside class
	}

	public  void DefaultModifierClass_Method1 () {
		PublicModifierClass1 pmc1 = new PublicModifierClass1(); // accessing public class in same package
		PublicModifierClass2 pmc2 = new PublicModifierClass2(); // accessing public class in different package	
	}

}

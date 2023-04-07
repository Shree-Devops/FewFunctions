package AccessModifiers;

import AccessModifiers2.PublicModifierClass2;

public class PublicModifierClass1{
	
	public int publicVariable = 10;
	int defaultVariable = 20;
	protected int protectedVariable = 30;
	private int privateVariable = 40;
	
	public static void main(String[] args) {
		
		PublicModifierClass1 pmc1 = new PublicModifierClass1();
		System.out.println("Public Variable - " + pmc1.publicVariable);
		System.out.println("Default Variable - " + pmc1.defaultVariable);
		System.out.println("Protected Variable - " + pmc1.protectedVariable);
		System.out.println("Private Variable - " + pmc1.privateVariable);
	}
	
	public void publicClass_Method1() {
			
		DefaultModifierClass1 pmc1 = new DefaultModifierClass1(); // accessing default class present in same package
		PublicModifierClass2 pmc2 = new PublicModifierClass2(); // accessing public class present in different package
	}
}


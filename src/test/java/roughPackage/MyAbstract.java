package roughPackage;

public abstract class MyAbstract {
	public int var1 = 1;
	
	public MyAbstract()
	{
		System.out.println("inside abstract class Constructor");
	}

	public static void main(String[] args) {
	}
	
	public void method1()
	{
		System.out.println("inside abstract class non abstract method");
	}
	public abstract void method2();

}

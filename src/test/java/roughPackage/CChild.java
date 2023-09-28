package roughPackage;

public class CChild{
	
	private int a=2;
	
	public CChild()
	{
		System.out.println("child C constructor");
	}

	public static void staticmethod() {
		System.out.println("ChildC static method");
	}

	public void nonstaticmethod() {
		System.out.println("ChildC non static mathod");
	}
	public static void parentChildcstatic() {
		System.out.println("ChildC from parentChildc static method");
	}
	public void parentChildcnonstatic() {
		System.out.println("ChildC from parentChildc non static method");
	}
	public static void ChildBChildCstatic() {
		System.out.println("ChildC from ChildBChildC static method");
	}
	
	public void ChildBChildCnonstatic() {
		System.out.println("ChildC from ChildBChildC non static method");
	}
	public static void ChildCstaticunique()
	{
		System.out.println("child C static unique");
	}
	public void ChildCnonstaticunique()
	{
		System.out.println("child C nonstatic unique");
	}
	public void nonstaticunique()
	{
		a=3;
		System.out.println("nonstatic unique - " + a);
	}
}

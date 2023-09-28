package roughPackage;

public class BChild extends AParent{
	
	public BChild()
	{
		System.out.println("child B constructor");
	}

	public static void staticmethod() {
		System.out.println("ChildB static method");
	}

	public void nonstaticmethod() {
		System.out.println("ChildB non static mathod");
	}

	public static void ChildBstaicUnique()
	{
		System.out.println("ChildB staic Unique");
	}
	
	public static void parentChildBstatic() {
		System.out.println("ChildB from parentChildB static method");
	}
	
	public void parentChildBnonstatic() {
		System.out.println("ChildB from parentChildB non static method");
	}
	public static void ChildBChildCstatic() {
		System.out.println("ChildB from ChildBChildC static method");
	}
	
	public void ChildBChildCnonstatic() {
		System.out.println("ChildB from ChildBChildC non static method");
	}
	
	public void ChildBnonstaticUnique()
	{
		System.out.println("ChildB nonstaic Unique");
	}
}

package roughPackage;

public class AParent {
	int parentnonstaticint;
	static int parentstaticint;
	private int parentprivateint;

	public AParent() {
		System.out.println("parent constructor");
	}

	public static void staticmethod() {
		System.out.println("parent static method");
	}

	public void nonstaticmethod() {
		System.out.println("parent non static mathed");
	}

	public static void parentstaticunique() {
		System.out.println("parent static unique method");
	}
	
	public void parentnonstaticunique() {
		System.out.println("parent non static unique method");
	}
	public static void parentChildBstatic() {
		System.out.println("parent from parentChildB static method");
	}
	public void parentChildBnonstatic() {
		System.out.println("parent from parentChildB non static method");
	}
	public static void parentChildcstatic() {
		System.out.println("parent from parentChildc static method");
	}
	public void parentChildcnonstatic() {
		System.out.println("parent from parentChildc non static method");
	}
	public int getparentprivateint() {
		return parentprivateint;
	}
}

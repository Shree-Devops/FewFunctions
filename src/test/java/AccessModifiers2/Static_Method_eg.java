package AccessModifiers2;

public class Static_Method_eg {

	public static void main(String[] args) {

		Static_Method_eg st = new Static_Method_eg();
		st.go(); //static component cannot call a non static component directly, need to create object of class.
		//run("shree"); //static component can call static component directly.
	}

	public void go() {
		System.out.println("inside go.");
		come(); // non static component can call a non static component directly.
		run(); // non static component can call a static component directly.
	}
	public void come() {
		System.out.println("inside come.");
	}
	public void run() {
		System.out.println("inside run.");
	}
	public static void run(String person) {
		System.out.println("person runs.");
	}
	
	/*
	 * compile
	 * executed -> call to JVM -> JVM looks for public static void main(String[] args) method, we can't change anything in this method declaration. else main method not found.
	 * 
	 */
}

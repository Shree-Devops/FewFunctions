package AccessModifiers2;

public class Static_Method_eg2 extends Static_Method_eg {

	public static void main(String[] args) {
		
		Static_Method_eg2 st = new Static_Method_eg2();
		st.run(); // calling method in parent class using child object
	}
	
	public void run () {
		System.out.println("person is running in child class");
	}
}

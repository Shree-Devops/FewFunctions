package rough;

public class Child extends Parent{
	int num = 10;

	
	public static void main(String[] args) {
		Child ch = new Child();
		ch.myMethod();	
	}

	
	public void myMethod() {
			System.out.println("my child " + inum);
		}
	
	public void parentMethod() {
		System.out.println("child kutiya");
	}
}

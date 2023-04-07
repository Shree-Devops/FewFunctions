package rough;

public class Parent extends test{
	
	int num = 11;
	int inum = 9;
	
	public static void main(String[] args) {
		Parent p = new Parent();
		p.parentMethod();
		
	}
	public void parentMethod() {
			System.out.println("Parent kutiya " + inum);
		}
	}

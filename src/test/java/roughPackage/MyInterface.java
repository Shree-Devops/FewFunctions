package roughPackage;

public interface MyInterface {

	int var2 = 5;
	
	abstract void method3();
	void method4();
	public void method5();
	default void method14()
	{
		System.out.println("inside interface default method");
	}
	static void method15()
	{
		System.out.println("inside interface static method");
	}
	public static void method16()
	{
		System.out.println("inside interface public static method");
	}

	public class ABC {
				
		public void method6()
		{
			System.out.println("inside interface-> public class -> public method");
		}
		protected void method7()
		{
			System.out.println("inside interface-> public class -> protected method");
		}
		void method8()
		{
			System.out.println("inside interface-> public class -> default method");
		}
		private void method9() {
			System.out.println("inside interface-> public class -> private method");
		}
		public static void method10()
		{
			System.out.println("inside interface-> public class -> public static method");
		}
		protected static void method11()
		{
			System.out.println("inside interface-> public class -> protected static method");
		}
		static void method12()
		{
			System.out.println("inside interface-> public class -> default static method");
		}
		private static void method13() {
			System.out.println("inside interface-> public class -> private static method");
		}
	}
	
}

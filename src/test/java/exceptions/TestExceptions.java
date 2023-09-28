package exceptions;

public class TestExceptions {

	public static void main(String[] args) throws UserExceptions 
	{
		int age = 17;
		if(age < 18)
		{  
	        throw new UserExceptions("age is not valid to vote");    
	    }  
       else 
       {   
        System.out.println("welcome to vote");   
        }
	}

}

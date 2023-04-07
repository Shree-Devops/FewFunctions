package rough;

public class mytest
{
	public static void main(String[] args)
	{
		mytest t = new mytest();
		 t.test();	
	}
	
	 public void test()
	 {
		 int[] A = {1, 3, 6, 4, 1, 2};
		 
		boolean exist= true;
		boolean flag= false;
		boolean doesnotExist= false;
		
       for (int i=1; i<= 10;i++)
       {
           for(int j=0;j<A.length;j++)
           {
               if (i==A[j])
               {
                   exist=true;
                   flag=true;
                   break;
               }
               else
                   exist=false;
               
               if(exist==false && j==A.length-1)
               {
            	   System.out.println("1-" + i);
            	   doesnotExist=true;
            	   break;
               }
           }
           if ( doesnotExist==true)
        	   break;
           if(flag==true)
        	   continue;
           else
        	   System.out.println("3-" + (i+1));
           break;
       }
       System.out.println("4-");
       
	}
}

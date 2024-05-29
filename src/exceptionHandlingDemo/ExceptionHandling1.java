package exceptionHandlingDemo;



public class ExceptionHandling1 {

	public static void main(String[]args)
	{
		System.out.println("Start");
		
		// it will not gives Exception
		  int c= 10/2;
		
		  System.out.println("Div result is "+c);
		  
		//Gives Exception
		  try {
			  int d= 10/0;
			  System.out.println("Div result is "+d);
		  }
		catch(ArithmeticException abc)
		  {
			System.out.println("Something went wrong please check the exception "+abc.getMessage());
			System.out.println("Seems you have entered Zero please provide value >0");
		  }
		
		System.out.println("End");
	}
}

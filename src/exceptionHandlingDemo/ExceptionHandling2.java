package exceptionHandlingDemo;

import java.util.InputMismatchException;

public class ExceptionHandling2 {

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
		  catch (InputMismatchException abc)
		  {
			  System.out.println("Oops something went wrong");
			  
		  }
		  finally {
			  
			  System.out.println("Finally block");
			  System.out.println("End");
			  
		  }
		
		
	}
}

package classDemo;

public class FirstClassDemo {

	 int x=90;
	 int y=85;
	public static void main(String[]args)
	{
		System.out.println("Program Started");
		
		FirstClassDemo obj1= new FirstClassDemo();
		
		obj1.sum();
		
		System.out.println("X value is "+obj1.x);
		
		System.out.println("Y value is "+obj1.y);
		 
		 System.out.println("Program Ended");
		 
		 FirstClassDemo obj2= new FirstClassDemo();
			
			obj2.sum();
			
			System.out.println("X value is "+obj2.x);
			
			System.out.println("Y value is "+obj2.y);
			 
			 System.out.println("Program Ended");
	}
	
	public void sum()
	{
		
		int a=10;
		int b=20;
		int c= a+b;
		System.out.println("Sum of two number is "+c);
		
	}
}

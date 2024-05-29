package compileTimePolymorphism;

public class OrderOfArgument {
	public static void main(String[]args)
	{
		OrderOfArgument obj = new OrderOfArgument();
		obj.add(45, 80);
		obj.add(4, 07, 60);
		obj.add(45.28, 9.9);
		obj.add(10, 5.65);
		obj.add(45.56, 69);	
	}
     public void add(double a, int b)
	
	{
		
		double sum=  a+b;
		System.out.println("sum of number is "+sum);
	}
	
     public void add(int a, double b)
	
	{
		
		double sum=  a+b;
		System.out.println("sum of number is "+sum);
	}
	
     public void add(double a, double b)
	{
		
		
		double c=a+b;
		System.out.println("Sum of number is "+c);
		
	}
	
	public void add(int a, int b)
	{
		
		int c=a+b;
		System.out.println("Sum of number is "+c);
		
	}

	public void add(int a, int b, int d)
	{
		int c=a+b+d ;
		System.out.println("Sum of number is "+c);
		
	}
}

package compileTimePolymorphism;

public class NoOfArgument {
	public static void main(String[]args)
	{
		NoOfArgument obj = new NoOfArgument();
		obj.add(45, 80);
		obj.add(4, 07, 60);
		
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

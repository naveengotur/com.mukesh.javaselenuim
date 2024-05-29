package parametersDemo;

public class PassParamters {

	public static void main(String[]args) {
		
		PassParamters obj =new  PassParamters();
		obj.add(4, 15);
		obj.sub(15.2, 6.5);
		
	}
	
	
	public void add(int a, int b)
	{
		int c= a+b;
		System.out.println(" Hey Result is "+c);
	}
	
	public void sub(double x, double y)
	
	{
	 double result = y- x;
	 System.out.println("Hey sub result is "+result);
	 
		
	}
}

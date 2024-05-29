package thisKeywordDemo;

public class MyVariables3 {

	int x;
	int y;
	
	public MyVariables3(int x, int y)
	{ 
		//for this we get value is 0.
		x=x;
		y=y;
		
		
	}
	public void sum()
	{
		int sum= x+y;
		System.out.println(sum);
		
	}
	public static void main(String[]args)
	{
		MyVariables3 obj = new MyVariables3(10,50);
		obj.sum();
		
	}
}

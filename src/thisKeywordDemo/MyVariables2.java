package thisKeywordDemo;

public class MyVariables2 {

	int x;
	int y;
	
	public MyVariables2(int a, int b)
	{ 
		//for this we get value is 0.
		x=a;
		y=b;	
		
	}
	public void sum()
	{
		int sum= x+y;
		System.out.println(sum);
		
	}
	public static void main(String[]args)
	{
		MyVariables2 obj = new MyVariables2(10,50);
		obj.sum();
		
	}
}

package thisKeywordDemo;

public class MyVariables {

	int x;
	int y;
	
	public MyVariables(int x, int y)
	{ 
		//for this we get value is 0.
		x=x;
		y=y;
		
		//for this we get value is 60.
		this.x=x;
		this.y=y;
		
		
	}
	public void sum()
	{
		int sum= x+y;
		System.out.println(sum);
		
	}
	public static void main(String[]args)
	{
		MyVariables obj = new MyVariables(10,50);
		obj.sum();
		
	}
}

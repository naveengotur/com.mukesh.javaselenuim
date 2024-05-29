package constructorDemo;

public class Marks {

	int result;
	
	public static void main(String[]args)
	{
		Marks m = new Marks(60);
		m.displayResult(); 
		
	}
	
	public Marks(int marks )
	{
		result = marks;
		
	}
	public void displayResult()
	{
		System.out.println("Final marks for Student is "+result);
	}
}

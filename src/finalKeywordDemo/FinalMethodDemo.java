package finalKeywordDemo;

public class FinalMethodDemo extends ParentClass
{

	public static void main(String[]args)
	{
		FinalMethodDemo obj = new FinalMethodDemo();
		obj.Address();
		obj.name();
		obj.phone();
		
		Object obj2= new Object();
		
	}
	
	public void Address()
	{
		
		System.out.println("My address is Hyderbad");
	}
	public void phone()
	{
		System.out.println("My number is 78989889");
	}
	
}

package variablesDemo;

public class InstanceVariable {

	int roll= 20;
	int marks = 80;
	public static void main(String[]args)
	{
		
		InstanceVariable obj= new InstanceVariable();
		obj.show();
		InstanceVariable obj2= new InstanceVariable();
		obj2.show();
		InstanceVariable obj3= new InstanceVariable();
		obj3.show();
	}
	public void show()
	{
		
		System.out.println("Roll num "+roll+" and  marks are "+marks);
	}
	
}

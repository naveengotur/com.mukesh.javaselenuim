package variablesDemo;

public class InstanceVariableNew {

	int roll= 20;
	double marks = 80;
	int x=100;
	
	public InstanceVariableNew(int roll, double marks)
	{
		this.roll= roll;
		this.marks-= marks;
		
	}
	
	public static void main(String[]args)
	{
		
		InstanceVariableNew obj= new InstanceVariableNew(1,56.68);
		obj.show();
		InstanceVariableNew obj2= new InstanceVariableNew(2,65.8);
		obj2.show();
		InstanceVariableNew obj3= new InstanceVariableNew(3,69.2);
		obj3.show();
	}
	public void show()
	{
		int x=0;
		System.out.println(x);
		System.out.println("Roll num "+roll+" and  marks are "+marks);
	}
	
}

package inheritanceDemo;

public class ChildClass2 extends BaseClass {

	//scenario - 2
	public static void main(String[]args)
	{
		BaseClass obj= new BaseClass();
		
		obj.add();

		obj.sub();		
		
	}
	public void mul()
	{
		System.out.println("Hey i am in Base Class and multiplication is 2500");
	}
	public void div()
	{
		System.out.println("Hey i am in Base Class and Division is 250");
	}
}

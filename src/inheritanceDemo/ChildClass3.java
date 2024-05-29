package inheritanceDemo;

public class ChildClass3 extends BaseClass {

	
	//scenario - 3
	public static void main(String[]args)
	{
		BaseClass obj= new ChildClass();
		
		obj.add();
		//obj.div();
		obj.sub();
	// 	obj.mul();		
		
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

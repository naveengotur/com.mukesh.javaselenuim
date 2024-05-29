package inheritanceDemo;

public class ChildClass4 extends BaseClass {

	//scenario 4
	public static void main(String[]args)
	{
		// ChildClass obj= new BaseClass();
		
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

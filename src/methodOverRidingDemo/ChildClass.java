package methodOverRidingDemo;

public class ChildClass extends Parent
{

	public static void main(String[]args)
	{
		//scenario -1
		ChildClass obj1 = new ChildClass();
		obj1.display();
		
		//scenario - 2
		Parent obj2= new Parent();
		obj2.display();
		
		//scenario -3
		Parent obj3 = new ChildClass();
		obj3.display();
		
		//scenario -4
		// it will not work 
		//ChildClass obj4 = new Parent();
		
		
	}
	
	public void display()
	{
		System.out.println("I am in Child class display Method");
		
	}
	
	public void display(String name)
	{
		System.out.println("I am child class display method");
		
	}
}

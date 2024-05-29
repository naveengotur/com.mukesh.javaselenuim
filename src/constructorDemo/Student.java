package constructorDemo;

public class Student {

	int result;
	
	public static void main(String[]args)
	{
		Student obj = new Student();
		Student obj2 = new Student("DPS");
		Student obj3 = new Student(1);
		obj.displayResult();
		
		
	}
	
	public Student()
	{
		System.out.println("Hey welcome to School");
	}
	public Student(String schoolName)
	{
	
		System.out.println("Hey welcome to "+schoolName+" School");
	}
	public Student(int rank)
	{
		System.out.println("hey welcome to school which ranked "+rank);
		
	}
	public Student(String schoolName,int ranking)
	{
		System.out.println("hey welcome to school");
		
	}
	public Student(int ranking, String schoolName)
	{
		System.out.println("hey welcome to school");
		
	}
	public void displayResult()
	{
		System.out.println("Final marks for Student is "+result);
	}
}

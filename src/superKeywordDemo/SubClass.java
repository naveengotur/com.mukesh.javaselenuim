package superKeywordDemo;

public class SubClass extends ParentClass
{

	public SubClass()
	{
		System.out.println("I am in Child Class Contructor");
		
	}
	// note always in the method Super keyword in first line
	//in the below method mupltiple super keyword is not possible because superkeyword always in firstline.
	public SubClass(String name)
	{
		super(name);
	// 	super(name,"Otwani");
		System.out.println("I am in Child Class Contructor"+name);
		
	}
	
	
	public static void main(String[]args)
	{
		SubClass obj = new SubClass();
		SubClass obj2 = new SubClass("Mukesh");
		
	}
}

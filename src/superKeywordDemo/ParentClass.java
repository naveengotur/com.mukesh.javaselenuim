package superKeywordDemo;

public class ParentClass {

	public ParentClass()
	{
		System.out.println("I am in Parent Class Constructor");
	}
	
	public ParentClass(String name)
	{
		System.out.println("I am in Parent Class Constructor"+name);
	}
	
	public ParentClass(String fname, String lname)
	{
		System.out.println("I am in Parent Class Constructor"+fname+" "+lname);
	}
}

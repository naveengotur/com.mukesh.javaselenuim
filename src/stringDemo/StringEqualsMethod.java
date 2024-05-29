package stringDemo;

public class StringEqualsMethod {

	public static void main(String[]args)
	{
		String name="Selenium WebDriver";
		
		boolean status = name.startsWith("Selenium");
		
		System.out.println("Status is "+status);
		
		String name1="Welcome to Selenium WebDriver World";
		
		boolean status2 = name1.endsWith("World");
		
		System.out.println("New Status is "+status2);
		
           boolean status3 = name1.endsWith("QTP");
		
		System.out.println("New Status is "+status3);
		
		
		
	}
}

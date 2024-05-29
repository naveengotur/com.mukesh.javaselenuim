package stringDemo;

public class StringContainsMethod {

	public static void main(String[]args)
	{
		String actual="Welcome to Selenium WebDriver World";
		
		String expected = "Selenium";
		
		boolean status = actual.contains(expected);
		
		System.out.println(" Status is "+status);
		
        String expected2 = "selenium";
		
		boolean status2 = actual.equalsIgnoreCase(expected2);
		
		System.out.println(" Status is "+status2);
		
		
		
	}
}

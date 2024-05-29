package stringDemo;

public class StringEqualsIgnoreMethod {

	public static void main(String[]args)
	{
		String actual="Welcome to Selenium WebDriver World";
		
		String expected = "Welcome to Selenium World";
		
		boolean status = actual.equals(expected);
		
		System.out.println("New Status is "+status);
		
		String expected2 = "welcome to Selenium WebDriver World";
		
            boolean status2 = actual.equals(expected2);
		
		System.out.println("New Status is "+status2);
		
		String expected3 = "Welcome to Selenium WebDriver World";
		
        boolean status3 = actual.equals(expected3);
	
	System.out.println("New Status is "+status3);
	}
}

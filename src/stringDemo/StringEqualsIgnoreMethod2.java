package stringDemo;

public class StringEqualsIgnoreMethod2 {

	public static void main(String[]args)
	{
		String actual="Welcome to Selenium WebDriver World";
		
		String expected = "welcome to selenium webDriver worlD";
		
		boolean status = actual.equalsIgnoreCase(expected);
		
		System.out.println(" Status is "+status);
		
        String expected2 = "welcome to selenium webDriver world2";
		
		boolean status2 = actual.equalsIgnoreCase(expected2);
		
		System.out.println(" Status is "+status2);
		
		
		
	}
}

package conditionalStatements;

public class IfelseDemo {

	public static void main(String[]args)
	{
		System.out.println("Test Started");
		
		String browser="chrome";
		
		//String browser="MsEdge";
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.out.println("Testcase executed on Chrome");
			
		}
		
		else
		{
			System.out.println("Testcase executed on Firefox");
		}
		
		System.out.println("Test End");
	}
}


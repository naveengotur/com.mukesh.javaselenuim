package conditionalStatements;

public class IfelseIfDemo {

	public static void main(String[]args)
	{
		System.out.println("Test Started");
		
		String browser="msedge";
		
		//String browser="Mukesh";
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.out.println("Testcase executed on Chrome");	
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.out.println("Testcase executed on IE");
		}
		
		else if(browser.equalsIgnoreCase("MsEdge"))
		{
			System.out.println("Testcase executed on MsEdge");
		}
		else
		{
			System.out.println("Kindly provides valid browser names");
		}
		
		System.out.println("Test End");
	}
}


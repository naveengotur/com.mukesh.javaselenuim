package listDemo;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[]args)
	{
	
		ArrayList obj1=new ArrayList();
		
		obj1.add(787878); 
		
		obj1.add('M');
		
		//List will allow the duplicate 
		obj1.add("Selenium WebDriver");
		
		obj1.add("Selenium WebDriver");
		
		obj1.add(23.65);
		
		//Enhance ForLoop
		
		for(Object abc:obj1)
		{
			System.out.println("Values are "+abc);
		}
		
	}
}

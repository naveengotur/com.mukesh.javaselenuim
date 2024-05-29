package listDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4 {

	public static void main(String[]args)
	{
	
		ArrayList obj1=new ArrayList();
		
		obj1.add(787878); 
		
		obj1.add('M');
		
		//List will allow the duplicate 
		obj1.add("Selenium WebDriver");
		
		obj1.add("Selenium WebDriver");
		
		obj1.add(23.65);
		
		// Iterator is separetor interface
		
		Iterator itr = obj1.iterator();
		
		while(itr.hasNext())
		{
		
			Object value = itr.next();
			System.out.println("Values are "+value);
			
		}
		
		
	}
}

package listDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[]args)
	{
	
		ArrayList obj1=new ArrayList();
		
		obj1.add(787878); 
		
		obj1.add('M');
		
		//List will allow the duplicate 
		obj1.add("Selenium WebDriver");
		
		obj1.add("Selenium WebDriver");
		
		obj1.add(23.65);
		
		//Normal ForLoop
		
		int myListSize = obj1.size();
		
		for(int i=0; i<myListSize; i++)
		{
			System.out.println("Values from Arraylist is "+obj1.get(i)); 
			
		}
		
	}
}

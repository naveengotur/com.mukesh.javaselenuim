package listDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo5 {

	public static void main(String[]args)
	{
	
		//Generic Programs Stored All the datatypes etc..
		// Arraylist with Generic this is used in selenium
		
	ArrayList<String> obj1 = new ArrayList<String>();
	
	obj1.add("Mukesh");
	
	obj1.add("Selenium");
	
	obj1.add("HP QTP");
	
	for(String value : obj1) {
		
		System.out.println("values are "+value);
		
		
	}
		
	}
}

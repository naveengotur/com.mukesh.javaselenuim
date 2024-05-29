package listDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo6 {

	public static void main(String[]args)
	{
	
		// BaseClass reference = BaseClass Object
		//
		
	List<String> obj1 = new ArrayList<String>();
	
	obj1.add("Mukesh");
	
	obj1.add("Selenium");
	
	obj1.add("HP QTP");
	
	for(String value : obj1)
	{	
		System.out.println("values are "+value);
		
	}
		
	}
}

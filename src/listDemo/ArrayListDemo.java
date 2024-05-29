package listDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[]args)
	{
	
		ArrayList obj1=new ArrayList();
		
		obj1.add(787878);
		
		obj1.add('M');
		
		obj1.add("Selenium WebDriver");
		
		obj1.add(23.65);
		
		System.out.println(obj1);
		
		//fetching the illegal memory -> it gives error out of boundary Exception 
		//System.out.println(obj1.get(4));
		
		System.out.println(obj1.get(3));
		
	}
}

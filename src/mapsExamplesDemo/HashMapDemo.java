package mapsExamplesDemo;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[]args)
	{
		// it will not give in insertion order 
		// to Get the Values
		
		HashMap<String, String> obj1= new HashMap<String, String>();
		
		obj1.put("400", "Mukesh");
		obj1.put("601", "Sahi");
		obj1.put("502", "Ketelon");
		obj1.put("669", "Selenium");
		obj1.put("600", "QTP");
		obj1.put("700", "Appium");
		obj1.put("800", "Java Selenium");
		
		System.out.println(obj1);
		
		// Add the Values
		
		String value = obj1.get("700");
		 
		// value is incorrect -> it gives null
		System.out.println("Values from Map is "+value);
		
		// value is correct -> it gives values
		System.out.println("Values from Map is "+value);
		
		
		
	}
}

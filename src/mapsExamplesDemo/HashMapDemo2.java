package mapsExamplesDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[]args)
	{
		
        HashMap<String, String> obj1= new HashMap<String, String>();
		
		obj1.put("400", "Mukesh");
		obj1.put("601", "Sahi");
		obj1.put("502", "Ketelon");
		obj1.put("669", "Selenium");
		obj1.put("600", "QTP");
		obj1.put("700", "Appium");
		obj1.put("800", "Java Selenium");
		
		for(Map.Entry<String, String> data : obj1.entrySet())
		{
			System.out.println("KEy form Map is "+data.getKey()+" and value is "+data.getValue());	
	}
}
}
package setExamplesDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashedSetDemo3 {

	public static void main(String[]args)
	{
		//This will maintain -> get the Output Insertion Order
		
		LinkedHashSet<String> values = new LinkedHashSet<>();
		
		values.add("selenium");
		
		values.add("QTP");
		
		values.add("1");
		
		values.add("Mukesh");
		
		values.add("XYZABC");
		
		values.add("Abc");
		
		//get all the values in one line by random Ordering
		System.out.println(values);
		
		//get all the values in next line by random Ordering
		
		for(String e: values)
		{
				System.out.println(e);
		}
		
	}
}

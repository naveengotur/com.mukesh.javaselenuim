package setExamplesDemo;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[]args)
	{
		//
		
		HashSet<String> values = new HashSet<>();
		
		values.add("selenium");
		
		values.add("QTP");
		
		values.add("1");
		
		values.add("Mukesh");
		
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

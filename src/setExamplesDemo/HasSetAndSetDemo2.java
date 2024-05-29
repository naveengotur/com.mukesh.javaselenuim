package setExamplesDemo;

import java.util.HashSet;
import java.util.Set;

public class HasSetAndSetDemo2 {

	public static void main(String[]args)
	{
		//
		
		Set<String> values = new HashSet<>();
		
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

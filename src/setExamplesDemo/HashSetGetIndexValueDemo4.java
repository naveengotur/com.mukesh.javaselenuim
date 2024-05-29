package setExamplesDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetGetIndexValueDemo4 {

	public static void main(String[]args)
	{
		// Getting the Index Values in the list
		// Converting the Set or ArrayList
		
		Set<String> values = new HashSet<>();
		
		values.add("selenium");
		
		values.add("QTP");
		
		values.add("1");
		
		values.add("Mukesh");
		
		values.add("Abc");
		
		ArrayList<String> list = new ArrayList<>(values);
		
		System.out.println(list.get(2));
		
		
	}
}

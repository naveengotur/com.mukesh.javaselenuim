package wrapperClassDemo;

import java.util.ArrayList;

// When to use

public class FifthClassDemo {

	public static void main(String[]args)
	{
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		// If i use Primitive Data-type int is not allowed.
		// Because the Collection Framework is worked on the Object
		// So it allows the Wrapper Classes -> Integer, Double, Float etc.. but not use the Primitive Data-Type  
	
		 ArrayList<int> arr=new ArrayList<int>();
		
		// All the Wrapper Classes are Final 
		// String Class is also a "Final Class"
		
		 String s= "Mukesh";
		 System.out.println("String value is "+s);
	}
	
}

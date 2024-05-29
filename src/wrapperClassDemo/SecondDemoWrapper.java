package wrapperClassDemo;

public class SecondDemoWrapper {

	public static void main(String[] args) {

		// Here String can't make the Mathematics Action.
		String price1 = "463";
		String price2 = "237";

		// Here String can't make the Mathematics Action.
		String result = price1 + price2;
		// int result = price1 + price2;

		System.out.println(result);

		// Coverting String into Integer value and make action into mathematics
		//Type Casting
		
		int p1 = Integer.parseInt(price1);

		int p2 = Integer.parseInt(price2);
        System.out.println(p1 + p2);
 // or to vertify
        int sum= p1+p2;
        if(sum==700)
        {
        	System.out.println("Passed");
        }
        else {
        	System.out.println("Failed");
        }
        
	}

}

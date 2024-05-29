package wrapperClassDemo;

public class ThirdDemoWrapper2 {

	public static void main(String[]args)
	{
		
		String price1= "462.95";
		String price2= "237";
		
		// error is coming because String Value is in Double, but we Converting into "Integer"
	//	int p1= Integer.parseInt(price1);
	//	int p2= Integer.parseInt(price2);
		
	    double p1 =	Double.parseDouble(price1);
		double p2 = Double.parseDouble(price2);
		
		System.out.println(p1);
		System.out.println(p2);
	
	//int sum =p1+p2;
	//if(sum==700.00)
		double sum= p1+p2;
		System.out.println(sum);
		if(sum==700.00)
	{
		System.out.println("passed");
		
	}
	else
	{
		System.out.println("Failed");
	}
	
	}
}

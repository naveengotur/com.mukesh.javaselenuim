package superKeywordDemo;

public class ChildClass extends BaseClass {

	int int_rate=10;
	public static void main(String[]args)
	{
		ChildClass obj = new ChildClass();
		System.out.println(obj.int_rate);
		obj.showMeIntRateFromPvtBank();
		
		
		
	}
	public void showMeIntRateFromPvtBank()
	{
		System.out.println("Current Int rate from Private Bank is "+int_rate);
		System.out.println("Current Int rate from Private Bank is "+super.int_rate);
		
	}
	
}

package superKeywordDemo;

public class ChildClass2 extends BaseClass {

	int int_rate=10;
	public static void main(String[]args)
	{
		ChildClass2 obj = new ChildClass2();
		System.out.println(obj.int_rate);
		obj.showMeIntRateFromPvtBank();
		
		
		
	}
	public void showMeIntRate2()
	{
		System.out.println("I am in Child Class");
		
		
	}
	public void showMeIntRateFromPvtBank()
	{
		showMeIntRate2();
		super.showMeIntRate2(); 
		System.out.println("Current Int rate from Private Bank is "+int_rate);
		System.out.println("Current Int rate from Private Bank is "+super.int_rate);
		
	}
	
}

package methodOverRidingDemo;

public class HDFC extends RBI{

	public static void main(String[]args)
	{
		RBI r = new RBI();
		r.homeLoanIntRate();
		
	}
	
	public void homeLoanIntRate()
	{
		System.out.println("Home loan Int rate is 11 %");
	}

}

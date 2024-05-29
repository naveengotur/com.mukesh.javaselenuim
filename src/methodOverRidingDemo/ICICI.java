package methodOverRidingDemo;

public class ICICI extends RBI
{
	public static void main(String[]args)
	{
		ICICI home = new ICICI();
		home.homeLoanIntRate();
		
	}
	
	public void homeLoanIntRate()
	{
		System.out.println("Home loan Int rate is 10 %");
	}

}

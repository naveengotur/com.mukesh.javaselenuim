package methodOverRidingDemo;

public class SBI extends RBI implements Loan
{
	public static void main(String[]args)
	{
		SBI home = new SBI();
		home.homeLoanIntRate();
		
	}
	
	public void homeLoanIntRate()
	{
		System.out.println("Home loan Int rate is 9 %");
	}

	@Override
	public void homeLoan() {
		System.out.println("SBI providing home loan");
		
	}

	@Override
	public void carLoan() {
		System.out.println("SBI providing car loan");
		
	}

}

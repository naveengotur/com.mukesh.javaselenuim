package interfaceDemo;

public class AdvnaceCalc4 implements Calc
{

		public static void main(String[]args)
	{
		
	}

	public void calculatorSin()
	{
		System.out.println("I am in Advance Calc-Sin method");
	}
	
	public void calculatorCos()
	{
		System.out.println("I am in Advance Calc-Cos method");
	}
	
	
	@Override
	public void add() {
		
		System.out.println("I am in Addition method");
		
	}

	@Override
	public void sub() {
		
		System.out.println("I am in Substraction");
	}
}

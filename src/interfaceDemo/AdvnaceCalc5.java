package interfaceDemo;

public class AdvnaceCalc5 implements Calc
{

	//scenario -2
	// Java will not allow to create an Object of interface 
	public static void main(String[]args)
	{
		Calc obj =new Calc();
		obj.add();
		//obj.calculatorCos();
		//obj.calculatorSin();
		obj.sub();
		
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

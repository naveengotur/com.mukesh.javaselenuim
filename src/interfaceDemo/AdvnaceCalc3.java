package interfaceDemo;

public class AdvnaceCalc3 implements Calc
{

	//scenario -2
		public static void main(String[]args)
	{
		// Java will not allow to create an Object of interface 
		// Calc obj =new Calc();
			
		//or
			
		//AdvanceCalc2 obj2= new Calc();
		//you can not create object of an interface because it has abstract method
		
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

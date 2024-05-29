package parametersDemo;

public class PassParamters2 {

	public static void main(String[]args) {
		
		DynamicCalculator obj =new  DynamicCalculator();
		int sum = obj.add(4, 15);
	  
		System.out.println("Sum result is "+sum);
		
		double result = obj.sub(15.2, 6.5);
		
		System.out.println("Hey result is "+result);
	
		String fullname = DynamicCalculator.getMyFullName("Srinivas", "T");
		
		System.out.println("Congragulations " + fullname+ " you are selected for Infosys");

		
		 
	}
	
}

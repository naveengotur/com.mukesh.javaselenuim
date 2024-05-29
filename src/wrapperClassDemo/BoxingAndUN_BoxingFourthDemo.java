package wrapperClassDemo;

public class BoxingAndUN_BoxingFourthDemo {
	public static void main(String[] args) {
		// Auto-Boxing
		int a = 100;
		Integer b = a;
		System.out.println("Autoboxing "+b);

		// Boxing 
		int x = 90;
		Integer y = Integer.valueOf(x);
		System.out.println("Boxing "+y);
		
		// Normal Un-boxing
		Integer result=100;
		int newResult= result.intValue();
		System.out.println("Normal Unboxing "+newResult);
		
		// Auto Un-Boxing
		Integer marks=78;
		int newMarks=marks;
		System.out.println("Auto Unboxing "+newMarks);
		
	}
}

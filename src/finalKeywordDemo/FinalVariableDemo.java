package finalKeywordDemo;

public class FinalVariableDemo {

	public static void main(String[]args)
	{
		FinalVariableDemo obj = new FinalVariableDemo();
		obj.show();
		
	}
	public void show()
	{
		int marks=90;
		// re-intialize
		marks= 95;
		System.out.println(marks);
		
		final int FINALMARKS=80;
		// once final keyword is used for variable afterwards we can't re-initialize.
		//finalmarks=56;
		System.out.println(FINALMARKS);
	}
}

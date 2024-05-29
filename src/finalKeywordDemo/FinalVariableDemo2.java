package finalKeywordDemo;

public class FinalVariableDemo2 {

	final String PANCARD;
	
	public FinalVariableDemo2(String pancard)
	{
		PANCARD=  pancard;
	}

	public static void main(String[]args)
	{
		FinalVariableDemo2 obj = new FinalVariableDemo2("ADAD7878");
		
		
	}
	public void show()
	{
	System.out.println("Pancard details are "+PANCARD);
	}
}

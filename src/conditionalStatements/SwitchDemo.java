package conditionalStatements;

public class SwitchDemo {

	public static void main(String[]args)
	{
		
	//	int x=6;
		int x=4;
		switch(x)
		{
		case 1:
			System.out.println("Performance is poor");
			break;
		case 2:
			System.out.println("slow performer");
			break;
		case 3:
			System.out.println("Meeting exceptation");
			break;
		case 4:
			System.out.println("well done keep rocking");
			break;
		case 5:
			System.out.println("Employee of the Year");
			break;
			
			default:
				System.out.println("You are in notice period");
		
		}
	}
}

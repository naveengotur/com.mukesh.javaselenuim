package arrayDemo;

public class Two2DArrayDemo {

	public static void main(String[]args)
	{
		
		int school[][]= new int[2][3];
		school[0][0]=12;
		school[0][1]=24;
		school[1][0]=36;
		school[1][2]=48;
		
		System.out.println(school[1][2]);
		System.out.println(school[1][0]);
		System.out.println(school[0][0]);
		System.out.println(school[0][1]);
		
		// array out of bond exception
		System.out.println(school[1][4]);
		
		
	}
}

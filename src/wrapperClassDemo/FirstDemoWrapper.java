package wrapperClassDemo;

public class FirstDemoWrapper {

	public static void main(String[]args)
	{
		
		int a=100;
		System.out.println("Primitive "+a);
		
		//after variable we can put the -> "Any datatype" converting ->when it is Wrapper Class
		
		Integer b=200;
		System.out.println("Wrapper "+ b.byteValue() );
	}
}

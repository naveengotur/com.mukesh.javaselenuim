package arrayDemo;

public class SingleArrayDemo
{
	
	public static void main(String[]args)
	{
		//20 byte of memory
		
		int student_id[]= new int[5];
		
		student_id[0]=89;
		student_id[1]=9;
		student_id[2]=8;
		student_id[3]=890;
		student_id[4]=897;
		
		//limitation of Array
		System.out.println("Student_id is "+student_id[2]);
		
		//limitation of Type
		student_id[1]= (int) 10;
		System.out.println("Student_id is "+student_id[1]);
		
		//ArrayIndexoutof Bond Exception
		System.out.println("Student_id is "+student_id[5]);
	}

}

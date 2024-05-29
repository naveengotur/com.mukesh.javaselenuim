package arrayDemo;

public class SingleArrayDemo3 {
	public static void main(String[]args)
	{
		//20 byte of memory
		
		int student_id[]= new int[5];
		
		student_id[0]=89;
		student_id[1]=9;
		student_id[2]=8;
		student_id[3]=890;
		student_id[4]=897;
	
		int sizeofArray = student_id.length;
		
		System.out.println("Length of array is "+sizeofArray);
	
	for(int i=0; i<sizeofArray; i++)
	
	{
		System.out.println("Students id is "+student_id[i]);
	}
	
	System.out.println("Next Array list Execute");
	
	String student_name[]= new String[5];
	student_name[0]="mukesh";
	System.out.println("Student name Address is "+student_name);
	System.out.println("Student name is "+student_name[0]);
	
	}

}

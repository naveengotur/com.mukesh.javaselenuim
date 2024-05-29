package thisKeywordDemo;

public class MyDrivers {

	public MyDrivers() {
		this("Java");
		System.out.println("Loading my drivers");
	}

	public MyDrivers(String name) {
		this(15);
		System.out.println("Loading my drivers - Name is " + name);

	}

	public MyDrivers(int count) {
		System.out.println("Loading my drivers - count is " + count);
	}

	public void display() {
		System.out.println("I am in display Method");
	}

	public static void main(String[] args) {

		MyDrivers obj = new MyDrivers();
		obj.display();

	//	MyDrivers obj1 = new MyDrivers("JDBC");
		
	//	MyDrivers obj2 = new MyDrivers(10);
		
		//reduce the create the more "Object" we can use "this keyword in the Constructor method"  
		
	}

}

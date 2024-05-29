package AbstractDemo;

public class HRTeam extends ITDepartment {

	public static void main(String[] args) {
		//1st scenario
		HRTeam hr = new HRTeam();
		hr.goodies();
		hr.work();
		hr.salary();
		hr.bonus();

		ITDepartment it = new HRTeam();
		it.goodies();
		it.work();
		it.salary();

		//ITDepartment it1 = new ITDepartment();

		// if you class is not fully implemented then we will not allow to create object
        // Interface we don't have single method implemented
		//Interface is 100% abstract Class
		
	}

	public void bonus() {
		System.out.println("Bonus is 1lakh");
	}

	public void salary() {
		System.out.println("SLPA");

	}
}

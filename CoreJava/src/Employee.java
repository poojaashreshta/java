class Company{
	void positions() {
		System.out.println("1.Manager 2.Developer 3.Testing");
	}
	void selectedPosition(String position) {
		System.out.println("Position selected is "+position);
	}
	String assignedPosition() {
		return "Developer";
	}
	String expectedSalary(int salary) {
		System.out.println("Salary is "+salary);
	return "Paid";
	}
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company abc = new Company();
		abc.positions();
		abc.selectedPosition("Developer"); 
		System.out.println("Assigned Position is "+abc.assignedPosition());
		System.out.println("Salary: "+abc.expectedSalary(60000));

	}
}

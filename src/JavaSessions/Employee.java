package JavaSessions;

public class Employee {
	
	String name;
	int empId;
	String dob;
	double salary;
	boolean isPermanent;
	char gender;
	

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "Sushant";
		e1.empId = 101;
		e1.dob = "1-1-1985";
		e1.salary = 25.5;
		e1.isPermanent = true;
		e1.gender = 'm';
		
		System.out.println(e1.name + " " + e1.isPermanent + " " + e1.salary + " " + e1.gender);
		
		Employee e2 = new Employee();
		e2.name = "Sofia";
		e2.empId = 102;
		e2.dob = "1-2-1990";
		e2.salary = 20.8;
		e2.isPermanent = false;
		e2.gender = 'f';
		
		System.out.println(e2.name + " " + e2.isPermanent + " " + e2.dob + " " + e2.gender);

		
		
	}

}

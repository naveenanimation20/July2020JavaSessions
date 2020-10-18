package OOP_Encapsulation;

public class Employee {
	
	public String name;
	public int age;
	private double salary;
	
	public void getEmployeeDetails(){
		System.out.println(name + " " + age);
	}
	
	private  void getEmployeSalary(){
		System.out.println("get emp salary");
	}
	

	public static void main(String[] args) {
		
		Employee e1  = new Employee();
		e1.name = "Tom";
		e1.age = 25;
		e1.salary = 23.44;
		
		e1.getEmployeeDetails();
		e1.getEmployeSalary();

	}

}

package OOP_Encapsulation;

public class EmpData {

	public static void main(String[] args) {

		
		Employee e2 = new Employee();
		e2.name = "steve";
		e2.age = 26;
		e2.getEmployeeDetails();

		
		Company comp = new Company();
		comp.setName("IBM");
		comp.setEmpCount(1000);
		comp.setFinancialData("private info...");
		
		System.out.println(comp.getName());
		System.out.println(comp.getEmpCount());
		System.out.println(comp.getFinancialData());
		
		
		
	}

}

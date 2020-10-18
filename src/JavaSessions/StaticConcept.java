package JavaSessions;

public class StaticConcept {
	
	String name;
	int age;
	static int total;
	
	public void getName(){
		System.out.println("get name");
	}
	
	public static void getSalary(){
		System.out.println("get salary");
	}

	public static void main(String[] args) {
		
		//how to access static vars and methods:
		//no need to create the object:
		//1. call by className:
		StaticConcept.total = 100;
		StaticConcept.getSalary();
		
		//2. call them directly:
		System.out.println(total);
		getSalary();
		
		//how to call non static stuff: create the object:
		StaticConcept obj = new StaticConcept();
		obj.name = "Tom";
		obj.age = 25;
		obj.getName();
		System.out.println(obj.total);
		obj.getSalary();
		
		
		
	}
	
	
	
	

}

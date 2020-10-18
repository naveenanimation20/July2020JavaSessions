package JavaSessions;

public class ClassAndObjects {
	
	//class vars:
	String name;
	int age;
	double salary;
	int empid = 100;
	
	public static void main(String[] args) {

		int i = 10;//local var
		String name = "Naveen";
		//object of the class: using new keyword
		
		ClassAndObjects obj = new ClassAndObjects();
		obj.name = "tom";
		obj.age = 25;
		obj.salary = 34.55;
		
		System.out.println(name);
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		System.out.println(obj.empid);//100
		
		ClassAndObjects obj1 = new ClassAndObjects();
		System.out.println(obj1.name);
		
		System.out.println(obj1.age);
		System.out.println(obj1.salary);
		System.out.println(obj1.empid);//100

		ClassAndObjects a = new ClassAndObjects();

		ClassAndObjects b = new ClassAndObjects();

		
		
	}

}

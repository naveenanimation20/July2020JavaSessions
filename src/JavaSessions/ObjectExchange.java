package JavaSessions;

public class ObjectExchange {
	
	String name;
	int age;
	double salary;

	public static void main(String[] args) {

		
		ObjectExchange ob1 = new ObjectExchange();
		ob1.name = "Gilbert";
		ob1.age = 25;
		ob1.salary = 25.5;
		
		ObjectExchange ob2 = new ObjectExchange();
		ob2.name = "Manisha";
		ob2.age = 27;
		ob2.salary = 27.5;
		
		ObjectExchange ob3 = new ObjectExchange();
		ob3.name = "Sunny";
		ob3.age = 28;
		ob3.salary = 30.5;
		
		
		System.out.println(ob1.name + " " + ob1.age + " " + ob1.salary);
		System.out.println(ob2.name + " " + ob2.age + " " + ob2.salary);
		System.out.println(ob3.name + " " + ob3.age + " " + ob3.salary);
		
		ob1=ob2;
		
		System.out.println(ob1.name + " " + ob1.age + " " + ob1.salary);
		System.out.println(ob2.name + " " + ob2.age + " " + ob2.salary);
		System.out.println(ob3.name + " " + ob3.age + " " + ob3.salary);
		
		ob2=ob3;
		System.out.println(ob1.name + " " + ob1.age + " " + ob1.salary);
		System.out.println(ob2.name + " " + ob2.age + " " + ob2.salary);
		System.out.println(ob3.name + " " + ob3.age + " " + ob3.salary);
		
		ob3=ob1;
		System.out.println(ob1.name + " " + ob1.age + " " + ob1.salary);
		System.out.println(ob2.name + " " + ob2.age + " " + ob2.salary);
		System.out.println(ob3.name + " " + ob3.age + " " + ob3.salary);

	}

}

package JavaSessions;

public class Persons {

	String name;
	int age;
	String dob;
	String city;
	double height;

	// constructors:
	// 1. having the same name as class name
	// 2. const.. will never return a value -- no return keyword
	// 3. no return type, no void
	// 4. it looks like a function, but its not function
	// 5. const.. overloading is possible
	// 6. const.. with zero param -- default const..
	//7. const.. will be called when we create the object of the class
	
	public Persons() {// 0 param
		System.out.println("0 param const..");
	}
	
	public Persons(int i){//1 param
		System.out.println("1 param const.." + i);
	}
	
	public Persons(int i, int p){//2 params
		System.out.println("2 param const.." + i+p);
	}
	
	public Persons(int i, String l){//2 params
		System.out.println("2 param const.." + i+l);
	}
	
	public Persons(String i, int l){//2 params
		System.out.println("2 param const.." + l+i);
	}

	public static void main(String[] args) {

		Persons p1 = new Persons(10,20);
		
		
		
	}

}

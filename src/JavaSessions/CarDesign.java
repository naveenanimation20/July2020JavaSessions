package JavaSessions;

public class CarDesign {
	
	String name;
	String model;
	int price;
	static int wheels = 4;

	public static void main(String[] args) {

		CarDesign c1 = new CarDesign();
		c1.name = "Audi";
		c1.model = "Q5";
		c1.price = 80;
		
		
		CarDesign c2 = new CarDesign();
		c2.name = "BMW";
		c2.model = "520d";
		c2.price = 70;
		
		CarDesign c3 = new CarDesign();
		c3.name = "Honda";
		c3.model = "Civic";
		c3.price = 25;
		
		System.out.println(c1.name + c1.model+ c1.price+ CarDesign.wheels);
		
		
	}

}

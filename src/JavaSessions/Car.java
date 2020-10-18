package JavaSessions;

public class Car {
	
	String name;
	String color;
	int price;
	String model;
	String type;
		

	public static void main(String[] args) {
		
		
		Car c1 = new Car();
		c1.name = "Audi";
		c1.color = "White";
		c1.price = 80;
		c1.model = "Q5";
		c1.type = "Automatic";
		
		Car c2 = new Car();
		c2.name = "BMW";
		c2.color = "Blue";
		c2.price = 75;
		c2.model = "520d";
		c2.type = "Automatic";
		
		
		Car c3 = new Car();
		c3.name = "Nano";
		c3.color = "Red";
		c3.price = 2;
		c3.model = "nano123";
		c3.type = "Manual";
		
		Car c4 = new Car();
		c4.name = "Honda";
		c4.color = "Brown";
		
		
		System.out.println(c1.name + " " + c1.color + " " + c1.price + " " + c1.model + " " + c1.type);
		System.out.println(c2.name + " " + c2.color + " " + c2.price + " " + c2.model + " " + c2.type);
		System.out.println(c3.name + " " + c3.color + " " + c3.price + " " + c3.model + " " + c3.type);
		System.out.println(c4.name + " " + c4.color + " " + c4.price + " " + c4.model + " " + c4.type);

		

	}

}

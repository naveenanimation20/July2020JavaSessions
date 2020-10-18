package JavaSessions;

public class CarManufacture {

	String name;
	String color;
	int price;
	String model;
	String type;

	public CarManufacture(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public CarManufacture(String name, int price, String model) {
		this.name = name;
		this.price = price;
		this.model = model;
	}

	public CarManufacture(String name, String color, int price, String model, String type) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.model = model;
		this.type = type;
	}

	public static void main(String[] args) {

		CarManufacture c1  = new CarManufacture("Audi", "Red");
		System.out.println(c1.name);
		System.out.println(c1.color);
		System.out.println(c1.model);
		
		CarManufacture c2  = new CarManufacture("BMW", "BLUE", 70, "320d", "Automatic");
		System.out.println(c2.model);
		System.out.println(c1.model);
		
	}

}

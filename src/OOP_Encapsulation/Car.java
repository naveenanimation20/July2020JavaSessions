package OOP_Encapsulation;

public class Car {

	//1. using object name
	//2. using setter
	//3. using const...
	public String name;
	private String engine;

	public Car(String name, String engine) {
		this.name = name;
		this.engine = engine;
	}

//	public String getName() {
//		return name;
//	}

	public String getEngine() {
		return engine;
	}

}

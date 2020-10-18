package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.autoParking();
		b.engine();
		
		Car c = new Car();
		c.start();
		c.refuel();
		c.stop();
		c.engine();
		
		BMW b1 = (BMW) new Car();
		
		//Top casting
		Car c1 = new BMW();//child class object can be referred by parent class ref variable
		
		c1.start();
		c1.stop();
		c1.refuel();
		
		Vehicle v1 = new BMW();
		v1.engine();
		

		//down casting:
//		BMW b1 = (BMW) new Car();//ClassCastException: OOP_Inheritance.Car cannot be cast to OOP_Inheritance.BMW
//		b1.start();
		
		
	}

}

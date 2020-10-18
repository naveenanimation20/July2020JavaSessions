package OOP_Inheritance;

public class BMW extends Car{
	
	//Method Overriding: when u have the same method in parent class as well as in child class
	//with the same name and same number of params 
	//and the method is called overridden method
	
	@Override
	public void start(){
		System.out.println("BMW -- start");
	}
	
	public void autoParking(){
		System.out.println("BMW - auto parking");
	}
	
	@Override
	public void engine() {
		System.out.println("BMW -- engine");
	}
	

}

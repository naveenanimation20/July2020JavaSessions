package OOP_Interface;

public interface USMedical extends WHO {

	int min_fee = 10;
	// vars are static and final by default

	// no method body
	// only method declaration - only method prototype -- Abstract Methods...
	// can not create the object of Interface in Java

	public void cardioServices();

	public void physioServices();

	public void emergencyServices();

	public void polioServices();

	// public int testing(String name);

	// after jdk1.8:
	// 1. we can have static methods with body:
	public static void medicalDisplay() {
		System.out.println("US -- medical display");
	}

	// 2. we can have one default method:
	default void admin() {
		System.out.println("US -- admin");
	}

}

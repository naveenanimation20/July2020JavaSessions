package Exception_Handling;

public class ThrowsKeyword {

	public static void main(String[] args) {

		ThrowsKeyword obj = new ThrowsKeyword();
		try{
			obj.m1();
		}
		catch(ArithmeticException e){
			System.out.println("exception is coming...");
		}
		
		System.out.println("Bye!!");
		
	}

	public void m1() throws ArithmeticException {
		m2();
	}

	public void m2() throws ArithmeticException {
		m3();
		System.out.println("m2");
	}

	public void m3() throws ArithmeticException {
		int i = 9 / 0;
		
		System.out.println("m3");
	}

}

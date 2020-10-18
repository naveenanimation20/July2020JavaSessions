package Exception_Handling;

public class TryCatchBlock {
	int age;

	public static void main(String[] args) {

		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		try{
			System.out.println("Hi");
			int i = 9/0;
			
			TryCatchBlock obj = null;
			obj.age = 25;
			System.out.println(obj.age);
			
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");

		}
		catch(ArithmeticException e){
			System.out.println("some exception occurred");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(NullPointerException e){
			System.out.println("null pointer is coming....");
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");

		
		
		
		
	}

}

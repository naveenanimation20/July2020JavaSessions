package JavaSessions;

public class FinalizeMethod {

	public static void main(String[] args) {

		FinalizeMethod o = null;
		
		FinalizeMethod obj = new FinalizeMethod();
		
		new FinalizeMethod();
		
		FinalizeMethod obj1 = new FinalizeMethod();
		obj1 = null;
		
		Employee e = new Employee();
		e = null;

		System.gc();
		System.out.println("Bye.....");
		
		
		
		
	}
	
	@Override
	public void finalize(){
		System.out.println("finalize method body...");
	}

}

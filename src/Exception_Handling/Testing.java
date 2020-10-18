package Exception_Handling;

public class Testing {

	public static void main(String[] args) {

		System.out.println("Start test  execution");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("ending test  execution");

		
	}

}

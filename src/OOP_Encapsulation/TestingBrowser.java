package OOP_Encapsulation;

public class TestingBrowser {

	public static void main(String[] args) {

		
		BrowserLaunch br = new BrowserLaunch();
		
		br.launchBrowser("chrome");
		
		Car c1 = new Car("Audi", "Turbo q4 engine");
		c1.name = "BMW";
		//System.out.println(c1.getName());
		System.out.println(c1.name);
		System.out.println(c1.getEngine());
		
	}

}

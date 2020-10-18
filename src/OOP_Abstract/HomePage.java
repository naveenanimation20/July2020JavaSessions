package OOP_Abstract;

public class HomePage extends Page{

	@Override
	public void header() {
		System.out.println("HP -- header");
	}

	@Override
	public void footer() {
		System.out.println("HP -- footer");
	}
	
	public void accountInfo(){
		System.out.println("HP -- account info");
	}
	
	
	
	

}

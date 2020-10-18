package OOP_Abstract;

public abstract class Page {
	
	public Page(){
		System.out.println("Page -- cosnt...");
	}
	
	public abstract void header();
	public abstract void footer();
	
	public void title(){
		System.out.println("Page -- default title");
	}
	
	public static final void logo(){
		System.out.println("APP - Logo");
	}
	
	//0 to 100% abstraction
	//partial abstraction -- > abs + Non Abs
	//full abstraction --> 100%
	//zero abstraction --> 0%

}

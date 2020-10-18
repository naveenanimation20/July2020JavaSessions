package SuperKeyword;

public class Page extends Web{
	
	public Page(){
		System.out.println("Page -- launch");
	}
	
	public Page(int i){
		System.out.println("Page -- launch" + i);
	}
	
	int timeOut = 20;
	int limit = 40;
	
	public void display(){
		System.out.println("page -- display");
		System.out.println(super.timeOut);
	}
	

}

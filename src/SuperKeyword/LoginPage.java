package SuperKeyword;

public class LoginPage extends Page{
		
	int timeOut = 30;
	
	public LoginPage(){
		super();
		System.out.println("login page -- launch");
		
	}
 
	public void calculateTimeOut(){
		System.out.println("time out for session is: " + super.timeOut);
		//super.limit = 50;
		System.out.println(super.limit);
	}
	
	public void display(){
		System.out.println("login page -- display");
		
	}
	
	public void getInfo(){
		display();
		super.display();
	}

}

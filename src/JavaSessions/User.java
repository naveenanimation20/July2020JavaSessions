package JavaSessions;

public class User {

	// Method Overloading: within the same class:
	// we have:
	// 1. same method name
	// 2. different types of params
	// 3. sequence of params should be different

	public void getName() {// 0 param
		System.out.println("get name");
	}

	public void getName(int i) {// 1 param
		System.out.println("get name" + i);
	}

	public void getName(int i, int j) {// 2 params
		System.out.println("get name" + i + j);
	}

	public void getName(int i, String p) {// 2 params
		System.out.println("get name" + i + p);
	}

	public void getName(String l, int i) {// 2 params
		System.out.println("get name" + i + l);
	}

	//
	public void search() {

	}

	public void search(String name) {

	}

	public void search(String name, int price) {

	}

	public void search(String name, String color) {

	}

	public void search(String name, String color, String seller) {

	}

	//
	public void payment(String GPay) {

	}

	public void payment(String CC, int cvv) {

	}

	public void payment(String CC, int cvv, int otp) {

	}

	public void payment(String wallet, int otp, long phone) {

	}

	//
	// login:

	public void login() {

	}

	public void login(String usernmae) {

	}
	
	public void login(String usernmae, String pwd) {

	}
	
	public void login(String usernmae, String pwd, int passcode) {

	}
	
	public void login(String usernmae, String email, String pwd) {

	}
	
	public void login(String usernmae, String securityQuestion, long phone) {

	}

	public static void main(String[] args) {

		User obj = new User();
		obj.getName(100, "testing");

	}

}

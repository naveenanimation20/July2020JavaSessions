package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {

		int a = 300;
		int b = 200;

		if (b > a) {
			System.out.println("b is greater than a");
		} else {
			System.out.println("a is greater than b");
		}

		if (a == 300) {
			System.out.println("Hi");
		}

		// dead code
		if (false) {
			System.out.println("WElcome to my restaurent");
		} else {
			System.out.println("Bye");
		}

		System.out.println(1200 == 1200);
		System.out.println(a = 300);

		// < > <= >= == !=

		int marks = 200;
		if (marks <= 100) {
			System.out.println("PASS");
		}

		String x1 = "Selenium";
		String y1 = "selenium";

		if (x1.equalsIgnoreCase(y1)) {
			System.out.println("both are equal");
		} else {
			System.out.println("both are not equal");
		}

		int billAmount = -300;
		// nested if
		if (billAmount >= 100) {

			if (billAmount <= 200) {
				System.out.println("discount is 10 USD");
			} else {
				System.out.println("discount is 15 USD");
			}

		} else {
			System.out.println("bill amount is wrong");
		}

		// if - elseif
		// true && true ==> true
		// true && false ==> false
		// false && true --> false
		// false && false --> false
		int totalMarks = 101;

		if (totalMarks <= 100) {
			if (totalMarks <= 100 && totalMarks >= 80) {
				System.out.println("you got grade A");
			} else if (totalMarks <= 79 && totalMarks >= 60) {
				System.out.println("you got grade B");
			} else if (totalMarks <= 59 && totalMarks >= 40) {
				System.out.println("you got grade C");
			} else {
				System.out.println("you are failed!!");
			}
		} else {
			System.out.println("please pass the correct marks!!");
		}

		// WAP to find the highest number (given three different numbers):
		int x = 1500;
		int y = 400;
		int z = 600;

		if (x > y && x > z) {//t && f 
			System.out.println("x is the highest number..."  + x);
		} 
		else if (y > z) {//f
			System.out.println("y is the highest number..." + y);
		}
		else {
			System.out.println("z is the highest number..." + z);
		}
		
		//
		String browser = "safari";
		
		if(browser.equals("chrome")){
			System.out.println("launch chrome...");
		}
		else if(browser.equals("firefox")){
			System.out.println("launch firefox...");
		}
		else if(browser.equals("ie")){
			System.out.println("launch ie...");
		}
		else if(browser.equals("safari")){
			System.out.println("launch safari...");
		}
		
		else{
			System.out.println("plz pass the correct browser name....");
		}
		
	}

}

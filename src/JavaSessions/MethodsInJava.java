package JavaSessions;

import java.util.ArrayList;

public class MethodsInJava {

	// class vars
	// class methods
	// data members of the class - to call them, you need to create the object
	// of the class
	// can not create a method inside a method

	public static void main(String[] args) {
		System.out.println("starting...");
		MethodsInJava obj = new MethodsInJava();
		obj.test();
		obj.getTotal();
		String n1 = obj.getTrainerName();
		System.out.println(n1 + " automation labs");

		int amt = obj.getTotalAmount();
		System.out.println(amt - 10);

		int s1 = obj.sum(10, 20);
		System.out.println(s1 + 100 - 20);

		System.out.println(obj.sum(40, 50));

		int amt1 = obj.getTotalBillAmount(500);
		System.out.println(amt1 - 50);

		int amt2 = obj.getTotalBillAmount(100);
		System.out.println(amt2);

		String cap1 = obj.getCapitalName("Germany");
		System.out.println(cap1);
		
		int m1 = obj.getStudentMarks("Naveen");
		System.out.println(m1);
		
		int m2 = obj.getStudentMarks("tom");
		System.out.println(m2);
		
		System.out.println(obj.launchBrowser("ie"));
		
		if(obj.launchDriver("ie")){
			System.out.println("my chrome got launched");
			System.out.println("enter url : http://www.google.com");
		}
		
		//
		double sum = obj.calculator("add", 10.2, 10);
		System.out.println(sum);
		
		//
		int count_july = obj.getStudentNames("June").length;
		System.out.println(count_july);
		
		String july[] = obj.getStudentNames("July");
		System.out.println(july.length);
		
		//
		ArrayList<String> homeList = obj.getLinksList("HomePage");
		System.out.println("total links on the home page: " + homeList.size());
		for(String ele :  homeList){
			System.out.println(ele);
		}
		
	}

	// 1. no input and no return:
	// void - does not return anything - no return
	public void test() {
		System.out.println("test method");
	}

	public void getTotal() {
		System.out.println("get total method");
		int a = 100;
		int b = 200;
		int total = a + b;
		System.out.println(total);
	}

	// 2. no input but some return:
	// return type: String
	public String getTrainerName() {
		System.out.println("get trainer name method...");
		String name = "Naveen";
		return name;
	}

	public int getTotalAmount() {
		System.out.println("get total amount...");
		int fee = 100;
		int tax = 20;
		int amount = fee + tax;
		return amount;
	}

	// return type: int
	public int getEmpCount() {
		System.out.println("get emp count...");
		int bng_count = 100;
		int delhi_count = 200;
		int pune_count = 300;

		return bng_count + delhi_count + pune_count;
	}

	// 3. some input and some return:
	public int sum(int a, int b) {
		System.out.println("Sum method...");
		int z = a + b;
		return z;
	}

	public int getTotalBillAmount(int amount) {
		System.out.println("get total bill amount...");
		int tax = 20;
		int totalAmount = amount + tax;
		return totalAmount;
	}

	public String getCapitalName(String countryName) {

		System.out.println("get capital name for..." + countryName);

		if (countryName.equals("India")) {
			return "New Delhi";
		} else if (countryName.equals("USA")) {
			return "Washington DC";
		} else if (countryName.equals("Russia")) {
			return "Moscow";
		} else if (countryName.equals("UK")) {
			return "London";
		} else {
			System.out.println(countryName + " country name is not found....");
			return null;
		}

	}

	public int getStudentMarks(String stundentName) {

		System.out.println("getting marks for student : " + stundentName);

		int marks = -1;

		if (stundentName.equals("Sushant")) {
			marks = 70;
		}

		else if (stundentName.equals("Swapna")) {
			marks = 80;
		}

		else if (stundentName.equals("Seema")) {
			marks = 90;
		}

		else if (stundentName.equals("Naveen")) {
			marks = 10;
		}

		else {
			System.out.println(stundentName + " is not found...");
		}

		return marks;

	}
	
	//method - param -- browserName
	public boolean launchBrowser(String  browserName){
		boolean flag = false;

		System.out.println("your browser name is : " + browserName);
		if(browserName.equals("chrome")){
			System.out.println("launch chrome");
			flag = true;
		}
		else if(browserName.equals("FF")){
			System.out.println("launch FF");
			flag = true;
		}
		else if(browserName.equals("safari")){
			System.out.println("launch safari");
			flag = true;
		}
		else{
			System.out.println("please pass the correct browser name");
		}
		
		return flag;
		
	}
	
	
	public boolean launchDriver(String browserName){
		boolean flag = false;
		System.out.println("your browser name is : " + browserName);
		
		switch (browserName) {
		case "chrome":
			System.out.println("launch chrome");
			flag = true;
			break;
		case "ff":
			System.out.println("launch ff");
			flag = true;
			break;
		case "safari":
			System.out.println("launch safari");
			flag = true;
			break;

		default:
			System.out.println("please pass the correct browser name");
			break;
		}
		
		return flag;

	}
	
	
	//
	public double calculator(String name, double a, double b){
		
		double result = 0;
		if(name.equals("add")){
			result = a+b;
		}
		
		else if(name.equals("sub")){
			result = a-b;
		}
		
		else if(name.equals("mul")){
			result = a*b;
		}
		
		else if(name.equals("div")){
			result = a/b;
		}
		
		return result;
		
	}
	
	
	//WAM - input param: String batchName
	//return student names
	
	public String[] getStudentNames(String batchName){
		String students[] = null;
		System.out.println("batch name is : " + batchName);
		
		if(batchName.equals("June")){
			students = new String[3];
			students[0] = "Tom";
			students[1] = "Peter";
			students[2] = "Steve";

		}
		
		if(batchName.equals("July")){
			students = new String[2];
			students[0] = "Ravi";
			students[1] = "Neelima";
		}
		
		return students;
		
	}
	
	
	//WAM -- input param: String pageName
	//return the list of links on the page
	public ArrayList<String> getLinksList(String pageName){
		ArrayList<String> linksList = new ArrayList<String>();
		System.out.println("page name is: " + pageName);
		
		if(pageName.equals("LoginPage")){
			linksList.add("policy");
			linksList.add("signup");
			linksList.add("forgot pwd");
		}
		
		else if(pageName.equals("HomePage")){
			linksList.add("product");
			linksList.add("profile");
			linksList.add("category");
		}
		
		else{
			System.out.println("this page " + pageName + " is not available....");
		}
		
		return linksList;
		
	}
	
	
	
	
	

}

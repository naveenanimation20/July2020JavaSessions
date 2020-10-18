package JavaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		String browser = "opera";

		switch (browser) {
		
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "opera":
			System.out.println("launch opera");
			break;
		case "IE":
			System.out.println("launch IE");
			break;

		default:
			System.out.println("please pass the correct browser..." + browser);
			break;
		}
		
		
		//
		String studentName = "naveen";
		int marks = -1;
		
		switch (studentName) {
		case "Tom":
			marks = 90;
			break;
		case "Peter":
			marks = 80;
			break;
		case "Steve":
			marks = 40;
			break;
		case "Romero":
			marks = 100;
			break;

		default:
			System.out.println("student not found .. " + studentName);
			break;
		}
		
		System.out.println(studentName + " got " + marks + " marks");

	}

}

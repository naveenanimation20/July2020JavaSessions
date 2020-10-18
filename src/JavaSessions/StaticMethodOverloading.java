package JavaSessions;

public class StaticMethodOverloading {

	public static void main(String[] args) {
		

		getTeam();
	}

	public static void getTeam() {
		getTeam(10);
	}

	public static void getTeam(int i) {
		System.out.println(i);
		getTeam(10,20);
	}
	
	public static void getTeam(int i, int k) {
		System.out.println(i+k);
	}

}

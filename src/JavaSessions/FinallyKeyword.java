package JavaSessions;

public class FinallyKeyword {

	public static void main(String[] args) {

		// System.out.println("Hi");
		//
		// try{
		// int i = 9/0;
		// }
		//
		//
		// finally{
		// System.out.println("Disconnect my connection....");
		// }

		System.out.println(getScore("Kohli"));

	}

	public static int getScore(String name) {

		try {
			if (name.equals("Kohli")) {
				int i = 9/0;
				return 100;
			} else if (name.equals("Rahit")) {
				return 200;
			} else {
				return 0;
			}
		}
		catch(Exception e){
			System.out.println("some exception is coming....");
			return -1;
		}

		finally {
			System.out.println("Bye");
			return -2;
		}

	}

}

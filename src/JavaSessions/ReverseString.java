package JavaSessions;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Naveen automation lab is the best YouTube software Testing channel";

		String strArr[] = str.split(" ");
		String rev = "";

		for (int i = 0; i < strArr.length; i++) {

			if (strArr[i].length() >= 5) {
				for (int j = strArr[i].length() - 1; j >= 0; j--) {

					rev = rev + strArr[i].charAt(j);
				}
				System.out.print(rev + "\n");
				rev = "";
			}
			
		}

	}

}

package JavaSessions;

import java.util.Arrays;

/**
 * 
 * @author naveenautomationlabs
 *
 */
public class RevStringUsingStream {

	public static void main(String[] args) {

		String s = "Naveen automation labs is the best YouTube software Testing channel";
		String myArr[] = s.split(" ");
		Arrays.asList(myArr).stream().filter(ele -> ele.length() >= 5)
		.map(ele -> new StringBuffer(ele))
				.forEach(ele -> System.out.println(ele.reverse()));
	}
}

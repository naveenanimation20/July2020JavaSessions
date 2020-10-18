package JavaSessions;

public class DataConversionConcept {

	public static void main(String[] args) {

		
		String x = "100";
		System.out.println(x+20);
		
		///string to int conversion:
		
		int i = Integer.parseInt(x);//100
		System.out.println(i+20);
		
//		String y = "100test";
//		int p = Integer.parseInt(y);
//		System.out.println(p+20);//120
		
		//String to double:
		String t = "12.33";
		System.out.println(t+30);
		
		double d = Double.parseDouble(t);//12.33
		System.out.println(d+30);
		
		
		//int to String:
		int l = 100;
		System.out.println(l+20);
		
		System.out.println(l+""+20);
		
		String g = String.valueOf(l);//"100"
		System.out.println(g+20);
		
		
	}

}

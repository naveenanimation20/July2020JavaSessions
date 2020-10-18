package JavaSessions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringManipulationConcept {

	public static void main(String[] args) {

		
		String s = "This is my java code and i am so happy";
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(6));
		System.out.println(s.charAt(37));
		//System.out.println(s.charAt(38));//StringIndexOutOfBoundsException

		System.out.println(s.indexOf("T"));
		System.out.println(s.indexOf("s"));//1st occurrence of s
		
		System.out.println(s.indexOf("s", s.indexOf("s")+1));//2nd occurrence of s
		
		System.out.println(s.indexOf("java"));//11
		System.out.println(s.indexOf("naveen"));//-1

		String mesg = "welcome null";
		if(mesg.indexOf("admin")>0){
			System.out.println("admin is the username");
		}
		else{
			System.out.println("userid is null");
		}
		
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//trim:
		String st = "      hello world     ";
		
		System.out.println(st.trim());
		
		//contains:
		String message = "welcome to Amazon";
		
		System.out.println(message.contains("Amazon"));
		
		if(message.contains("Amazon")){
			System.out.println("correct message");
		}
		else{
			System.out.println("incorrect messg");
		}
		
		//comparison:
		String title_actual = "Google";
		String title_expected = "google";
		
		System.out.println(title_actual.equals(title_expected));
		System.out.println(title_actual.equalsIgnoreCase(title_expected));
		
		//replace:
		String dob = "01-01-1990"; //01/01/1990
		
		System.out.println(dob.replace("-", "/"));
		
		String str = "    hello world    ";
		System.out.println(str.trim().replace(" ", ""));
		
		//split:
		String lang = "Java_Python_JavaScript_Ruby";
		
		String langValue[] = lang.split("_");
		System.out.println(langValue.length);
		
		for(int i=0; i<langValue.length; i++){
			System.out.println(langValue[i]);
		}
		
		
		String test = "JavaxXseleniumxXxTestingXxXautomation";
		String testing[] = test.split("xX");
		
		System.out.println(testing[0]);
		System.out.println(testing[1]);
		System.out.println(testing[2]);
		System.out.println(testing[3]);
		
		String emp_info = "tom;peter;30;tom@gmail.com;909090;LA";
		
//		String firstName = emp_info.split(";")[0];
//		System.out.println(firstName);
//		System.out.println(emp_info.split(";")[1]);
		
		String emp[] = emp_info.split(";");
		for(int i=0; i<emp.length; i++){
			System.out.println(emp[i]);
		}
		
		//substring:
		String info = "your transaction id is 12345";
		
		System.out.println(info.substring(0, 10));
		System.out.println(info.substring(3, 9));
		
		System.out.println(info.substring(info.indexOf("is")+3, info.length()));
		
		System.out.println(info.substring(info.indexOf("is")+3));
		
		System.out.println(info.split(" ")[4]);
		
		String tr = "your transaction id is: 12345 and reference id is: 34567";

		System.out.println(tr.replaceAll("[^0-9]", ""));
		
		Pattern  p = Pattern.compile("\\d+");
		Matcher m  = p.matcher(tr);
		while(m.find()){
			System.out.println(m.group());
		}
		
	}

}

package JavaSessions;

public class StringReverse {

	public static void main(String[] args) {

		String str = "selenium"; //muineles
		
		StringReverse obj = new StringReverse();
		System.out.println(obj.reverseString(str));
		
		
		char c[] = str.toCharArray();
		
		
	}
	
	public String reverseString(String str){
		
		if(str.length()==1){
			return str;
		}
		
		int len = str.length();//8
		String rev = "";
		for(int i=len-1; i>=0; i--){
			
			rev = rev + str.charAt(i);//mu
			
		}
		
		return rev;
		
		
	}
	
	
	
	

}

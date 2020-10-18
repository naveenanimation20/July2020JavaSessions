package JavaSessions;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {

		System.out.println("A - Main");
		//B.main(args);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur number");
		int a = sc.nextInt();
		if(a>=10){
			System.out.println(a+10);
		}
		
	}

}

package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

		
		//while loop:
		//1 to 10:
		int i = 1;
		while(i<=10){
			System.out.println(i);//1 2 3  4 5...10
			//i++;
			i=i+1;
		}
		
		System.out.println("-------");
		
		//for loop:
		//1 to 10:
		for(int k=1; k<=10; k++){
			System.out.println(k);//1 2 3 4 ...10
		}
		
		System.out.println("-------");

		//even numbers: 0 2 4 6 8 10
		for(int even=0; even<=10; even=even+2){
			System.out.println(even);//0 2 4 6  8 10
		}
		
		System.out.println("------");
		
		//odd numbers: 1 3 5 7 9
		for(int odd=1; odd<=9; odd=odd+2){
			System.out.println(odd);
		}
		
		//
//		for( ; ; ){
//			System.out.println("welcome TAJ  hotel");
//		}
		System.out.println("------");

		//do-while:
		int p = 1;
		do{
			System.out.println(p);//1
			p++;
		}
		while(p<=10);
		
		//for each
		//for each with streams
		
		
		
	}

}

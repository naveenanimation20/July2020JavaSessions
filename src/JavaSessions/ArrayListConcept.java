package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		//ArrayList -- dynamic array
		//there is no limit of size 
		//default class in java
		//create object of ArrayList
		
		ArrayList<Object> ar = new ArrayList<Object>();
		
		System.out.println(ar.size());
		
		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size());
		
		ar.add(300);//2
		ar.add(400);//3
		
		System.out.println(ar.size());
		
		ar.add(500);//4
		ar.add(600);//5
		
		System.out.println(ar.size());

		ar.add(34.44);//6
		ar.add('t');//7
		ar.add("selenium");//8
		ar.add(true);//9
		
		ar.remove(5);
		
		System.out.println(ar.size());//10
		System.out.println(ar.get(5));
		
//		System.out.println(ar.get(0));
//		System.out.println(ar.get(9));
		//System.out.println(ar.get(10));//IndexOutOfBoundsException

		//to print all the values of arraylist: for loop
		for(int i=0; i<ar.size(); i++){
			System.out.println(ar.get(i));
		}
		
		//for each:
		for(Object  ob : ar){
			System.out.println(ob);
		}
		
		
		//generics in arraylist:
		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("tom");
		studentNames.add("peter");
		studentNames.add("steve");

		System.out.println(studentNames.size());
		
		for(String st : studentNames){
			System.out.println(st);
		}
		
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		marksList.add(10);
		marksList.add(20);
		marksList.add(30);

		for(Integer m : marksList){
			System.out.println(m);
		}
		
	}

}

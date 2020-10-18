package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArrayListFeatures {

	public static void main(String[] args) {

		
		ArrayList<Integer> marksList = new ArrayList<Integer>();
		
		marksList.add(10);//0
		marksList.add(30);//1
		marksList.add(5);
		marksList.add(40);
		marksList.add(3);
		
		marksList.add(2, 100);
		
		System.out.println(marksList);

		Collections.sort(marksList);
		
		System.out.println(marksList);
		
		Collections.swap(marksList, 0, 4);
		
		System.out.println(marksList);

		//marksList.clear();
		//marksList.removeAll(marksList);
		
		System.out.println(marksList);
		
		List<String> langList = Arrays.asList("Java", "Python", "Ruby", "JavaScript");
		System.out.println(langList);
		System.out.println(langList.size());
		
		
		ArrayList<String> colorList = new ArrayList<String>();

		colorList.add("Red");
		colorList.add("Blue");
		colorList.add("Black");
		colorList.add("Purple");
		
		System.out.println(colorList);
		
		colorList.add(0, "Green");
		System.out.println(colorList);
		
		colorList.add(colorList.size(), "Yellow");

		System.out.println(colorList);

		ArrayList<String> CountryList = new ArrayList<String>();

		CountryList.add("India");
		CountryList.add("USA");
		CountryList.add("UK");
		
		colorList.addAll(CountryList);
		
		System.out.println(colorList);
		System.out.println(colorList.size());
		
		for(String s : colorList){
			System.out.println(s);
			
				if(s.equals("India")){
					System.out.println("I am Indian");
				}
		}
		
		
		int a[] = {10,3,2,34,56,21};
		System.out.println(a.length);
		System.out.println(a);
		//for each loop for static array:
		for(int p : a){
			System.out.println(p);
		}
		
		//00 01 02 03 04
		//10 11 12 13 14
		//20 21 22 23 24
		
		for(int i=0; i<=9; i++){
			
			for(int j=0; j<=9; j++){
				
				System.out.print(i+""+j + " ");//00 01 02 03 04 10
				
				
			}
			
			System.out.println();
			
		}
		
		
		
		
		
	}

}

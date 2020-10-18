package JavaSessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListCapacity {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList(20);

		System.out.println(ar.size());

		ar.add(100);
		ar.add(200);
		ar.add(100);
		ar.add(200);
		ar.add(100);
		ar.add(200);
		ar.add(100);
		ar.add(200);
		ar.add(100);
		ar.add(200);

		System.out.println(ar.size());
		
		ar.add(1000);
		
		//Collections.sort(ar);
		
		System.out.println(ar);
		
		ar.add(4, 400);
		System.out.println(ar);

		//ar.clear();
		//ar.removeAll(ar);
		List<String> ar1 = Arrays.asList("test", "testing", "testingtesting");
		System.out.println(ar1);

		Collections.swap(ar, 0, 4);
		System.out.println(ar);
		
		ar.add(0, "naveen");
		ar.add(ar.size(), "selenium");
		Collections.reverse(ar);
		System.out.println(ar);
		
//		ar.addAll(ar1);
//		System.out.println(ar);
		
		System.out.println(ar1.subList(0, 1));
		
		int i[]=new int []{1,3,1,2,3};
		Arrays.sort(i);
		for(int p: i){
			System.out.println(p);
		}

	}

}

package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {

		//two major limitations of array:
		//1. stores only similar types of values: To overcome this issue, we can use Object Array
		//2. size is fixed: static array: to overcome this issue, we use dynamic array (ArrayList)- collections
		
		//Arrays:
		//int array:
		
		int p[] = {2,3,5,1,2,10,22};
		System.out.println(p.length);
		System.out.println(p[0]);
		
		int i[] = new int[4];
		
		//i[-1]=50;
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		//li = 0
		//hi = 3
		//length = 4
		
		//System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]);//ArrayIndexOutOfBoundsException
		//System.out.println(i[-1]);////ArrayIndexOutOfBoundsException
		
		System.out.println(i.length);
		int len = i.length;
		System.out.println("array size is: " + len);
		System.out.println("LI is: " + 0);
		System.out.println("HI is: " + (len-1));
		
		//to print all the values from array: for loop:
		for(int k=0; k<i.length; k++){
			System.out.println(i[k]);//10 20 30 40
		}
		
		
		//double  array:
		double d[] = new double[2];
		d[0]=12.33;
		d[1]=200;
		
		System.out.println(d[0] + d[1]);
		
		//char array:
		char c[] = new char[3];
		c[0] = 'A';
		c[1] = 'a';
		System.out.println(c[0]+c[1]);
		
		//String array:
		String student[] = new String[3];
		student[0] = "Tom";
		student[1] = "Priya";
		student[2] = "A";

		System.out.println(student[2]);
		
		for(int n=0; n<student.length; n++){
			System.out.println(student[n]);
		}
		
		//Object Array:
		Object ob[] = new Object[5];
		ob[0] = "Steve";
		ob[1] = 30;
		ob[2] = 'm';
		ob[3] = 34.55;
		ob[4] = true;
		
		String name[] = new String[2];
		System.out.println(name[0]);
		
		int marks[] = new int[4];
		marks[0] = 100;
		
		System.out.println(marks[2]);
		
		
		
		
	}

}

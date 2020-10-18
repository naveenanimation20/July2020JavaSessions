package JavaSessions;

public class IncrementalDecremental {

	public static void main(String[] args) {

		
		int a = 1;
		int b = a++;//post increment
		System.out.println(a);//2
		System.out.println(b);//1
		
		int c = -1;
		int d = c++;
		System.out.println(c);//0
		System.out.println(d);//-1
		
		int j = 1;
		int k = ++j; //pre increment
		System.out.println(j);//2
		System.out.println(k);//2
		
		int m = -5;
		int n = ++m;
		System.out.println(m);//-4
		System.out.println(n);//-4
		
		int g = 2;
		int h = g--; //post decrement
		System.out.println(g);//1
		System.out.println(h);//2
		
		
		int x = 2;
		int y = --x;//pre decrement
		System.out.println(x);
		System.out.println(y);
		
		int t = -99;
		int u = --t;
		System.out.println(t);
		System.out.println(u);
	}

}

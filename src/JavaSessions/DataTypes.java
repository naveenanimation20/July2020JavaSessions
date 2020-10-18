package JavaSessions;

public class DataTypes {

	public static void main(String[] args) {

		//data types:
		//1. Primitive :
			//Boolean: boolean -- true or false
			//Numeric: 
					//Character: char
					//Integral:
							//Integer: byte, short, int, long
							//floating-point: float, double
		//2. Non Primitive: 
					//String, Arrays
		
		//1. byte:
		//size: 1 byte = 8 bits
		//range: -128 to 127
		byte b = 10;
		 b = 20;
		byte b1  = 100;
		byte b2 = 0;
		byte b3 = -10;
		
		System.out.println(b);
		System.out.println(b1+b3);
		System.out.println(100+200);
		
		//2. short:
		//size: 2 bytes  = 16  bits
		//range: -32768 to 32767
		short s = 1000;
		System.out.println(s);
		
		//3. int:
		//size: 4 bytes = 32 bits
		//range: -2147483648 to 2147483647
		int i = 10000;
		int i1 = -100;
		int i2 = 0;
		
		System.out.println(i+i1+i2);
		
		//4. long:
		//size: 8 bytes = 64 bits
		//range: 
		long l = 10000000;
		long l1 = 1234;
		
		//5. float: upto 7 decimal digits
		//4 bytes = 32 bits
		float f1 = 12.33f;
		float f2 = (float)12.33;
		System.out.println(f1+100);
		System.out.println(f2+1000);
		
		//6. double: upto 16 decimal digits
		//8 bytes = 64 bits
		double d = 12.3333;
		double d1 = 1.222222;
		double d2 = 100;
		System.out.println(d2);
		
		//7. String: is not a primitve data types, its a class (default)
		String s1 = "testing";
		System.out.println(s1);
		
		String s2 = "1000";
		System.out.println(s2);
		
		//8. char:
		char c = 'a';//97
		char f = 'b';//98
		char c1 = '1';
		char c2 = '$';
		System.out.println(c);
		System.out.println(c2);
		System.out.println('t');
		System.out.println(c+f);//195
		//a-z --> 97-122
		//A-Z --> 65-90
		//0-9 --> 48-57
		
		System.out.println("gender value is  " + 'm');
		
	}

}

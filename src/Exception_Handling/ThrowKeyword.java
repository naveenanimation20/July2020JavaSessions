package Exception_Handling;

public class ThrowKeyword {

	public static void main(String[] args) {

		
//		try {
//			throw new Exception("NAVEENEXCEPTION");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		String name = null;
		
		if(name == null){
			try {
				throw new Exception("NAMEISNULLEXCEPTION");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else{
			System.out.println(name);
		}
		
		
		
	}

}

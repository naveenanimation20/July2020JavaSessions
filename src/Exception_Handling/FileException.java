package Exception_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileException {

	public static void main(String[] args) {

		try {
			FileInputStream ip = new FileInputStream("/Users/NaveenKhunteta/Downloads/0-10.jpeg");
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}

}

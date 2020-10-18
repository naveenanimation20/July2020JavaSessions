package JavaSessions;

public class Browser {

	public static void main(String []t) {

		Browser br = new Browser();
		br.launchBrowser();
		main(10);
		main(20,"selenium");
	}
	
	public static void main(int i) {

		Browser br = new Browser();
		System.out.println(i);
	}
	
	public static void main(int i, String p) {

		Browser br = new Browser();
		System.out.println(i+p);
	}
	
	
	public void launchBrowser(){
		System.out.println("lauching browser");
		checkBrowserVersion();
		System.out.println("browser is launched");
	}
	
	public void checkBrowserVersion(){
		System.out.println("check Br version");
		checkBrOSCompatibility();
	}
	
	public void checkBrOSCompatibility(){
		System.out.println("check OS");
	}
	
	
	
	
	

}

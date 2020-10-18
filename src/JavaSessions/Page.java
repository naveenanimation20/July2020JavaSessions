package JavaSessions;

public class Page {
	
	String title;
	String header;
	String url;
	int pageNumber;
	
	//create the const with class vars:
	public Page(String title){
		this.title = title;
	}
	
	public Page(String title, String header){
		this.title = title;
		this.header = header;
	}
	
	public Page(String title, String header, String url, int pageNumber) {
		this.title = title;
		this.header = header;
		this.url = url;
		this.pageNumber = pageNumber;
	}

	public static void main(String[] args) {

		Page loginPage = new Page("Google", "Google Login", "google.com", 1);
		
		System.out.println(loginPage.title + " " + loginPage.header);
		System.out.println(loginPage.url+ " " + loginPage.pageNumber);
		
		Page homePage = new Page("homeTitle", "googleHome", "google.com/homepage", 2);
		Page product = new Page("productTitle", "googleproductHome", "google.com/products", 3);

		System.out.println(homePage.header);
		
	}

}

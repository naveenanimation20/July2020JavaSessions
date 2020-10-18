package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {

		
		LoginPage lp = new LoginPage();
		
		lp.header();
		lp.footer();
		lp.title();
		lp.doLogin("admin", "admin123");
		Page.logo();
		
		
		Page p = new LoginPage();
		p.header();
		p.footer();
		p.title();

		
		
		
		
	}

}

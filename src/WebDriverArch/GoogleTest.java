package WebDriverArch;

public class GoogleTest {

	static WebDriver driver;

	public static void main(String[] args) {

		String browserName = "firefox";

		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		} 
		else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		driver.findElement("username");
		driver.close();

	}

}

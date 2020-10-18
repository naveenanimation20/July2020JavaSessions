package WebDriverArch;

public class ChromeDriver implements WebDriver {

	public ChromeDriver() {
		System.out.println("Launch Chrome");
	}

	@Override
	public void get(String url) {
		System.out.println("lauching this url: " + url);
	}

	@Override
	public String getTitle() {
		return "Google";
	}

	@Override
	public void findElement(String locator) {
		System.out.println("finding element by using " + locator);
	}

	@Override
	public void close() {
		System.out.println("close the browser");
	}

}

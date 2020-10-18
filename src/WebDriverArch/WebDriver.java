package WebDriverArch;

public interface WebDriver {
	
	public void get(String url);
	public String getTitle();
	
	public void findElement(String locator);
	
	public void close();
	
	//abs
	//non abs
	
	

}

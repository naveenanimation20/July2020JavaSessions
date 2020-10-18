package OOP_Encapsulation;

public class BrowserLaunch {

	public void launchBrowser(String browserName) {
		System.out.println("launching ...." + browserName);
		checkBrowserVersion();
		checkBrowserOSCompatability();
		interactWihBrowserLibrary();
		checkRAMSpace();
		System.out.println("browser is launched....");
	}

	private void checkBrowserVersion() {
		System.out.println("checking browser version....");
	}

	private void checkBrowserOSCompatability() {
		System.out.println("checking checkBrowserOSCompatability....");

	}

	private void interactWihBrowserLibrary() {
		System.out.println("checking interactWihBrowserLibrary....");

	}

	private void checkRAMSpace() {
		System.out.println("checking checkRAMSpace....");

	}

}

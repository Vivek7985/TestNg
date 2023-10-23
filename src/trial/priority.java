package trial;

import org.testng.annotations.Test;

public class priority {

	@Test(priority = 3)
	public void Closebrowser() {
		System.out.println("close the browser ASAP");
		}
	
	@Test(priority = 2)
	public void Launchurl() {
		System.out.println("launch web page");
		}
	
	@Test(priority = 1)
	public void Startbrowser() {
		System.out.println("start chrome");
	}
}

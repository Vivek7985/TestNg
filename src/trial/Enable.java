package trial;

import org.testng.annotations.Test;

public class Enable {

	@Test(enabled = true)
	public void Mango() {
		System.out.println("king of all fruits");
		}
	
	@Test(enabled = false)
	public void Watermelon() {
		System.out.println("i am biggest");
		}
	
	@Test()
	public void Pineapple() {
		System.out.println("i am very kateri");
	}
}

package Testpriority;

import org.testng.annotations.Test;

public class bynumber {

	@Test(priority=93)
	
	public void Vivek() {
		System.out.println("He is Traveller");
	}
	
	@Test(priority=55)
	public void Prajyot() {
		System.out.println("He is kind");
	}
	
	@Test(priority =11)
	public void Tup() {
		System.out.println("she is cute");	
	}
}

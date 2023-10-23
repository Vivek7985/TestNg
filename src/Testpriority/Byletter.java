package Testpriority;

import org.testng.annotations.Test;

public class Byletter {

	@Test(priority = 'X')
	
	public void aeroplane() {
		System.out.println("I am above clouds.");
		}
	
	@Test(priority = 'D')
	private void Ship() {
		System.out.println("i am in water.");
	}
	
	@Test(priority = 'c')
	private void Bus() {
		System.out.println("i am always on road.");
		
	}
}

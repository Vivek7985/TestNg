package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class beforeAfter {
	
	@BeforeClass
	
     public void a() {
    	 System.out.println("This code is executed Before Class");
		
	}
     
	
	@AfterClass
     public void b() {
    	 System.out.println("This code is executed After Class");
		
	}
    
	@Test
     public void c() {
    	 System.out.println("Hello");
		
	}

}

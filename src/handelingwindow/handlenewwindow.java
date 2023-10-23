package handelingwindow;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class handlenewwindow {
      
	@Test
	
	public void open() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"openwindow\"]")).click();
		Thread.sleep(1500);
		System.out.println(driver.getCurrentUrl());//To print current url on console.
		Thread.sleep(1500);
	    
		//creating array list to handle windows.
		Set<String> A=driver.getWindowHandles();
		
		Iterator<String> NW=A.iterator();
		String parent_window=NW.next();
		String child_window=NW.next();
		Thread.sleep(2000);
		
		driver.switchTo().window(child_window);
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//*[@id=\"header-part\"]/div[2]/div/div/div[2]/div/div[2]/a")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(parent_window);
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
	}
}

package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Afterbeforereload {
	
	public static WebDriver driver;//creating global variable.
	
	@BeforeMethod
	
	public void launchurl() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("done1");
	}
	
	
	@AfterMethod
	
	public void closebrowser() {
		driver.close();
		System.out.println("done2");
	}
	
	@Test
	
	public void scrolldown() throws InterruptedException {
		WebElement scroll=driver.findElement(By.xpath("//*[@id=\"mousehover\"]"));
		Thread.sleep(1000);
		
		Actions v=new Actions(driver);
		v.moveToElement(scroll).build().perform();
		
		WebElement reload=driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[2]"));
		Thread.sleep(1000);
		reload.click();
		System.out.println("final");
	}
}


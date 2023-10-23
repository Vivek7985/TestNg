package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class dropdown {
	
	@Test
	
	public void scrolldown() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement scroll=driver.findElement(By.xpath("//*[@id=\"mousehover\"]"));
		Thread.sleep(1000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//scrolling down till we find specific element.
		js.executeScript("arguments[0].scrollIntoView();",scroll);
		Thread.sleep(1000);
		
		Actions v=new Actions(driver);
		v.moveToElement(scroll).build().perform();
		
		WebElement reload=driver.findElement(By.xpath("/html/body/div[4]/div/fieldset/div/div/a[2]"));
		Thread.sleep(1000);
		reload.click();
	}

}

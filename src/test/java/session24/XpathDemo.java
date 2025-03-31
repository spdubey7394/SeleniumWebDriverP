package session24;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		
		driver.manage().window().maximize();
		
		/* xpath using single attribute
		
		 driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("checkxpath");
		
		// or we can use * instead of tag name
		
	//driver.findElement(By.xpath("//*[@id='small-searchterms']")).sendKeys("checkxpath2"); */
	
	/* xpath using multiple attribute
	
	driver.findElement(By.xpath("//input[@id='newsletter-email'][@placeholder='Enter your email here...']")).sendKeys("sprakash07031994@gmail.com");

	driver.findElement(By.xpath("//button[@id='newsletter-subscribe-button']")).click();  */
		
	//	xpath using AND OR operators:
			
			
		
				
	}

}

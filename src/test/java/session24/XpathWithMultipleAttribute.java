package session24;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathWithMultipleAttribute {

	public static void main(String[] args) {
		
WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		
		driver.manage().window().maximize();
		
		// xpath using multiple attribute
		
		driver.findElement(By.xpath("//input[@id='newsletter-email'][@placeholder='Enter your email here...']")).sendKeys("sprakash07031994@gmail.com");

		driver.findElement(By.xpath("//button[@id='newsletter-subscribe-button']")).click();  
			

	}

}

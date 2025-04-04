package session24;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathWithAndOROperator {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		
		driver.manage().window().maximize();
		
		// Xpath using 'And' , 'OR' operator
		
		//AND OPERATOR BOTH THE ATTRIBUTES OF THE ELEMENTS SHOULD MATCH, THEN ONLY IT WILL LOCATE
		
		driver.findElement(By.xpath("//input[@id='small-searchterms' and @placeholder='Search store']")).sendKeys("Iphone imaginary");
		
		//OR OPERATOR OUT OF 2 ATLEAST ONE OF THE ATTRIBUTES OF THE ELEMENTS SHOULD MATCH, THEN ONLY IT WILL LOCATE

		driver.findElement(By.xpath("//input[@id='newsletter-email'or @placeholder='Enter your email here...']")).sendKeys("Iphone imaginary");

	}

}

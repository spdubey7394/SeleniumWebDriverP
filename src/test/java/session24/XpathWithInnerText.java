package session24;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithInnerText {

	public static void main(String[] args) 
	{
WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		
		driver.manage().window().maximize();
		
		//Xpath using inner text
		
	//	driver.findElement(By.xpath("//a[text()='$25 Virtual Gift Card']")).click();
		
		String value=driver.findElement(By.xpath("//strong[text()='Featured products']")).getText();
		System.out.println(value);
		//getText() method will display the inner text value
	}

}

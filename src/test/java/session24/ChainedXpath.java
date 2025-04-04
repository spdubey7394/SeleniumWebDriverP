package session24;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChainedXpath  //combination of full xpath and partial xpath
{

	public static void main(String[] args) 
	{
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		
		driver.manage().window().maximize();
		
		//chained xpath
		
		driver.findElement(By.xpath("//div[@class='picture']/a/img")).click();
				
				
			// div is a parent class for a
			// a is child class for div and parent class for img
			//img is a child class of a;)
	}

}

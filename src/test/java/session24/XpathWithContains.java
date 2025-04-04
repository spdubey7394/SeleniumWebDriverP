package session24;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathWithContains 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		// Xpath with Contains() method: it is having 2 parameters
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search store')]")).sendKeys("Admin");
		
		
		
		

	}

}

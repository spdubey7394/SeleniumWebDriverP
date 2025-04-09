package session26;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethodsJava {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		// isDisplayed returns boolean - we can check the display status of the element
		
	Boolean logodisplay= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	System.out.println(logodisplay);

	
		//isEnabled returns boolean - we can check enable/disable of the element
	
	Boolean searchbar=driver.findElement(By.xpath("//input[@id='small-searchterms']")).isEnabled();
	System.out.println(searchbar);
	
	//isSelected returns boolean - we can use to check the element is selected or not
	
	driver.findElement(By.xpath("//input[@id='gender-female']")).click(); // clicking on radio button to check
	
	Boolean radiobutton=driver.findElement(By.xpath("//*[@id='gender-female']")).isSelected();
	System.out.println(radiobutton);
	
	driver.quit();
	}
}

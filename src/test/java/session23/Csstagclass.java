package session23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csstagclass {

	public static void main(String[] args)
	{
        WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		
		driver.manage().window().maximize(); // maximize the window
		
		//tag.classname 
		
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("abc");
		
		//note: when there is more than 1 sentence in the classname select the first one and exclude after the space
		//If there are group of elements in that scenario instead of findElement() use findElemenys()
		
	//	driver.findElements(By.cssSelector("input.sublist-toggle"));
	}

}

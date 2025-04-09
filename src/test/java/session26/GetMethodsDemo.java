package session26;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GetMethodsDemo 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		//maximize the window
		
		driver.manage().window().maximize();
		
		//get(url) - opens the url of the page
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000); //sleep time in milliseconds
		
		//getTitle - returns title of the page
		
		System.out.println(driver.getTitle());
		
		// getCurrentUrl()-  returns url of the page
		
		System.out.println(driver.getCurrentUrl());
		
		// getPageSource() - returns source code of the page
		
		System.out.println(driver.getPageSource());
		
		// getWindowHandle() - returns ID of the single browser page
		
		System.out.println(driver.getWindowHandle());
		
		// getWindowsHandles() - returns ID's of the multiple browser windows
		
		//Id is dynamic in nature, they are kept changing
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> MultipleId=driver.getWindowHandles(); // set string returns String set collections
		
		for(String a: MultipleId)  // using for loop extract multiple Id's in String format
		{
			System.out.println(a);
		}
		
		
		
	
	}

}

package session22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorsDemo {

	public static void main(String[] args) 
	{
		//1) launch chrome browser
		//	ChromeDriver driver=new ChromeDriver();
			
			//or mostly 2nd approach is used since webdriver class can handle diff. browsers
			
		WebDriver driver=new ChromeDriver();	 
			
			
			//2) open url:
			
		driver.get("https://www.demoblaze.com");
		
		//id:
		
/*		Boolean logoDisplaystatus=driver.findElement(By.id("nava")).isDisplayed();
		
		if(logoDisplaystatus=true)
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}  */
		
		//name:
		
	boolean idchecker=driver.findElement(By.name("frm")).isEnabled();
	System.out.println(idchecker);
		
	if(idchecker!=true)
	{
		System.out.println("Test passed");
	}
	else
	{
		System.out.println("Test failed");
	}
		driver.quit();

	}

}

package session21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/* Testcase:
 * 1)launch browser(chrome)
 * 2)open url https://demo.opencart.com
 * 3)validate title 
 * 4)close browser
 */

public class FirstAutomationTestCase {

	public static void main(String[] args) {
		
		//1) launch chrome browser
	//	ChromeDriver driver=new ChromeDriver();
		
		//or mostly 2nd approach is used since webdriver class can handle diff. browsers
		
	WebDriver driver=new ChromeDriver();	 
		
		
		//2) open url:
		
	driver.get("https://www.youtube.com/");
	
	//3) validate title
	
	String act_title=driver.getTitle();
	
	if(act_title.equals("YouTube"))
	{
		System.out.println("Test passed");
	}
	else
	{
		System.out.println("Test failed");
	}
	
	//4) close browser
	
	driver.close();
	
	
	
		
		

	}

}

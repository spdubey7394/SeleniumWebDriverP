package session28;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class NavigateTo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//In String Format 
		driver.navigate().to("https://demo.nopcommerce.com");
		
		Thread.sleep(5000);
		
		//In URL object format
		
		URL myurl=new URL("https://www.demoblaze.com");
		
		driver.navigate().to(myurl);

	}

}

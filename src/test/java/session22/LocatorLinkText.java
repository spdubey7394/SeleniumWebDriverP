package session22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorLinkText {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/cart.html");
		
		driver.findElement(By.linkText("Contact")).click();

	}

}

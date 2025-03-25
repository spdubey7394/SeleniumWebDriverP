package session22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextDemo {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/cart.html");
		
		//click() method to click 
		
		driver.findElement(By.partialLinkText("Cont")).click(); 

	}

}

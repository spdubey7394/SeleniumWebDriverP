package session23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class csstagid {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		
		driver.manage().window().maximize(); // maximize the window
		//tag id  tag#id
		//input is tag and id is small-searchterms and tag is not compulsory
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("tshirts");
								//OR
	//	driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("tshirts");
 
		
		

	}

}

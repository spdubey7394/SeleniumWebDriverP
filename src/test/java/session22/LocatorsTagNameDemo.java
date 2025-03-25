package session22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTagNameDemo {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		
		//to count the no of link in the navigation bar and need to import util.List
		//findElements since there are group of elements
		
		List<WebElement> allinks=driver.findElements(By.tagName(""));
		
		//webElement is datatype for list elements
		
		//size method to count:
		
		System.out.println("total number of links on the webpage: " + allinks.size());
		
		driver.quit();

	}

}

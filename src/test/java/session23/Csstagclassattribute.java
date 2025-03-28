package session23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csstagclassattribute {

	public static void main(String[] args) {
		

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		
		//css tag clssname attribute   ---->    tag.classname[attribute='value']
		//tag is optional but .is compulsory
		//when ever elements have same class and tagname to differentiate the element we use different approach
		
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("testword");
		

	}

}

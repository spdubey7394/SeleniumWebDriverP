package session23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssattribute {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com");
		
		//css tag attribute   ---->    tag[attribute='value']
		
		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("csstagattrbute");
		
		//Note: Avoid dynamic changing element, which keeps changing and use single quotation only ''
		

	}

}

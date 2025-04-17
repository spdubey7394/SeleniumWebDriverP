package session29;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class SelectSpecificCheckboxDemo {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com");
		
		driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
	}

}

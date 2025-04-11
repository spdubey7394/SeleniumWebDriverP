package session27;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class ImplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		//implicit wait method should be declare after the driver object creation and before get url
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //maximum 10seconds is preferred to performance issued is occurred
			
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

		
		
		
		
	}

}

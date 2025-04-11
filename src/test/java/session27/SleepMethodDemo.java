package session27;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class SleepMethodDemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(5000); //pause the execution
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		Thread.sleep(5000); //pause the execution

		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		
		Thread.sleep(5000); //pause the execution

		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000); //pause the execution

		driver.quit();
		
		
		
	}

}

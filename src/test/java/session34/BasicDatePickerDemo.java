package session34;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class BasicDatePickerDemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		

		// Switch frame to date picker
		
		driver.switchTo().frame(0);
		
		// since it is a input datapicker we can use sendkeys method
		
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // clicking on the input tab
		
		
		//send date to input tab using sendKeys method
		
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("03/07/1994");
		
		
			
	
		}
			
		
		
	}



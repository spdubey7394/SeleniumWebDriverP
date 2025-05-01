package session31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class HiddenDrpdwn {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//login steps:
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(@class,'oxd-button')]")).click();
		
		//navigating to the PIM section
		
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		// click on the hidden drop down
		driver.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='oxd-table-filter']/div[@class='oxd-table-filter-area']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[3]/div[1]/div[2]/div[1]/div[1]")).click();

		//select a specific single option
	//	driver.findElement(By.xpath("//span[normalize-space()='Full-Time Contract']")).click();
	//	driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		
		//counting no of options
		List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println(options.size());
		
		//print all the options
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
	}

}

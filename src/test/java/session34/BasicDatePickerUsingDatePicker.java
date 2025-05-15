package session34;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class BasicDatePickerUsingDatePicker {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
				

		// Switch frame to date picker
		
		driver.switchTo().frame(0);
				
		//Using date picker method 
		//expected data should be always in string format
		
		String year="2026";
		String month="May";
		String date="15";
		
		//Step 1: opens the date packer
	
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // clicking on the input tab
		
		
		//Step 2: select month and year by comparing with data
		
		while(true)
		{
			String CurrentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); // actual month which needs to select
			String CurrentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); // ACTUAL YEAR WHICH NEEDS TO BE SELECTED
			
			if(CurrentMonth.equals(month) && CurrentYear.equals(year))
			{
				break;
			}
			
			//click on back button on date picker
		
		 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //forward
		// driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //backward
		
		}
		
		
		//step 3: select the date
		
		List<WebElement> dt=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement sdt:dt)
		{
			if(sdt.getText().equals(date))
			{
				sdt.click();
				break;
			}
			
			
		}
			
			
			
		}
			
			
			
			
			
		}

		
		
		
		
		
			
	
		
			
		
		
	



package session34;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class DatePickerWithYearDrpdwn {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//click on the date 
		
		driver.findElement(By.xpath("//input[@id='txtDate']")).click();
		
		//Required date
		
		String Year="2035";
		String Month="Mar";
		String Date="19";
		
		Thread.sleep(5000);
		
		//select year
		
		WebElement drpyear=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select requiredyear=new Select(drpyear);
		requiredyear.selectByContainsVisibleText(Year);
		
		Thread.sleep(5000);

		
		//Select month
		WebElement drpmonth=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select requiredmonth=new Select(drpmonth);
		requiredmonth.selectByContainsVisibleText(Month);
		
		Thread.sleep(5000);
		
		//using navigation arrow
		
		List <WebElement> alldates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement sdate:alldates)
		{
			if(sdate.getText().equals(Date))
			{
				sdate.click();
			}
		}

	}

}

package session29;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class SelectMutipleCheckboxesDemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com");
		
		// extraction and storing all the elements using List webelement:
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		//Approach-1: using for loop
		
	/*	for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		} */
		
		//Approach-2: using enhanced loop
		
/*	for(WebElement c:checkboxes)
		{
			//using equals for selecting specific checkbox from muliple
			//if((c.getAttribute("value").equals("sunday" )) || (c.getAttribute("value").equals("monday" )) || (c.getAttribute("value").equals("saturday" )))
			{
			c.click();
			
			} */
			
			//Selecting only first three using for loop based on index no.
			
			for(int i=0;i<3;i++)
			{
				checkboxes.get(i).click();
			
				
		}
			Thread.sleep(10000);
			for(int i=0;i<3;i++)
			{
				checkboxes.get(i).click();
			
				
		}
	}

}

package session31;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//creating webelement to store drop down select tag
		
		WebElement drpdwnsel=driver.findElement(By.xpath("//select[@id='country']"));
		
		Select drpcountry=new Select(drpdwnsel);
		
		//selecting option from dropdownusing selectByvisibleText():
		
		drpcountry.selectByVisibleText("India");
		
		//selecting option from dropdownusing selectByvalue():
		Thread.sleep(5000);
		drpcountry.selectByValue("france");

		//selecting option from dropdownusing selectByIndex():
				Thread.sleep(5000);
				drpcountry.selectByIndex(6);
				
				
		//capturing all the options
				List<WebElement> options=drpcountry.getOptions();
				System.out.println(options.size());
				
				//printing all the options
				
				for(int i=0;i<options.size();i++)
				{
					System.out.println(options.get(i).getText());
				}
		
		// using enhanced loop
				
				for(WebElement op:options)
				{
					System.out.println(op.getText());
				}
	}

}

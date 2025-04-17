package session29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UncheckingCheckbox {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com");
		
		// extraction and storing all the elements using List webelement:
		
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
		//for unchecking checkboxes
		
		Thread.sleep(10000);
		
		for(int i=0;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}
		
	}

}

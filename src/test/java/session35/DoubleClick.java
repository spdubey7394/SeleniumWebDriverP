package session35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		

		WebElement field1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement field2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement dbutton=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		// creating action class object
		
		Actions act=new Actions(driver);
		
		//clearing the field 1
		
		field1.clear();
		
		//sending new string to field 1 
		
		field1.sendKeys("SURYA");
		
		
		//click on the double click button
		
		act.doubleClick(dbutton).build().perform();

		
		//vALIDATION of field 1 matching field 2
		
		String text=field2.getAttribute("value");
		
		if(text.equals("SURYA"))
		{
			System.out.println("Text is matching");
		}
		else
		{
			System.out.println("Text is not matching");
		}
		
		
		
	}

}

package session31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class BootStrapDrpdwn {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
	//	1) selecting the dropdown
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		// 2) capture all options and find out the size
		
		List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println("no. of elements in the dropdown:" + options.size());
		
		// 3) selecting a single option
		
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		// 4) printing all the options using for loop can be done also using enhanced loop
		
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		// 5) selecting all the options 
		
		for(WebElement op:options)
		{
			String option=op.getText();
			if(option.equals("JQuery") || option.equals("Bootstrap") || option.equals("Angular") || option.equals("C#") || option.equals("Python") || option.equals("MySQL"));
			op.click();
		}
		
		
		
		
		
		;
	}

}

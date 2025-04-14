package session28;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// opening a child webpage by CREATING WEBELEMENT variable
		
	WebElement npage=driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']"));
	npage.click();
	
	Thread.sleep(5000);
	
	Set<String> windowIDS=driver.getWindowHandles();
	
	for(String ids:windowIDS)
	{
		String title=driver.switchTo().window(ids).getTitle();
		System.out.println(title);
		
		if(title.equals("OrangeHRM"))
		{
			driver.close();
		}
		
	}
	}

}

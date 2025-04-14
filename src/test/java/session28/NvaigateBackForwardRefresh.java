package session28;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class NvaigateBackForwardRefresh {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.demoblaze.com");
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000);

		driver.navigate().back(); // backward navigation to the webpage
		
		Thread.sleep(5000);

		driver.navigate().forward(); // forward navigation to the webpage
		
		Thread.sleep(5000);

		driver.navigate().refresh(); // refreshes the browser
		
	}

}

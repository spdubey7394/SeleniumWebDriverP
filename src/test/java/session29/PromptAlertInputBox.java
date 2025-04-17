package session29;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class PromptAlertInputBox {

	public static void main(String[] args) throws InterruptedException
	{
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		//sending data data into input field and pressing ok button
		
		Alert myalert=driver.switchTo().alert();
		
		myalert.sendKeys("Hello Surya");
		
		Thread.sleep(5000);
		
	//	myalert.accept();
		
		//sending data into the input field and pressing cancel button;
		
		myalert.dismiss();
		

	}

}

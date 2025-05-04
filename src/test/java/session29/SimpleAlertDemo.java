package session29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
		
		
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		Thread.sleep(5000);

		myalert.accept();
		

	}

}

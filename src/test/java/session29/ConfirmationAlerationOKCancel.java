package session29;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


public class ConfirmationAlerationOKCancel {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		
		Thread.sleep(5000);
		
		//to click on ok button
	//	myalert.accept();
		
		//to click on cancel button
		myalert.dismiss();
		
		
		

	}

}

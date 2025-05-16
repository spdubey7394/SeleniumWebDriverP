package session35;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		Actions act=new Actions(driver);
		
		//click on right click button
		
		WebElement rightclick=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		act.contextClick(rightclick).build().perform();
		
		// click on cut
		
		driver.findElement(By.xpath("(//span[normalize-space()='Paste'])[1]")).click();
		
		//capturing alert using alert class and closing alert window
		 
		Alert myalert=driver.switchTo().alert();
		
		System.out.println(myalert.getText());
		
		myalert.accept();
		
		
		
		
		
		
	}

}

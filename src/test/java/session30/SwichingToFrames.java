package session30;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class SwichingToFrames {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");

		
		//locating frame 1
		
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);  //switch to frame
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hello Surya");
		
		// to go back to main webpage to frame
		
		driver.switchTo().defaultContent();
		
		//locating frame 2
		
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Second frame switch");
		
		driver.switchTo().defaultContent();
				
	}

}

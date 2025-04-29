package session30;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class InnerFrameDemo {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//switching to frame 3 and enter data into input
		
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("inner frame testing");
		
		//locating innerframe using embeeded url of frame 3
		
		driver.switchTo().frame(0); // switching to inner frame using index no
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement i3=mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")));
		
		i3.click();
		
		driver.findElement(By.xpath("//div[@id='i21']")).click();
		
		//to go back to mainpage
		
		driver.switchTo().defaultContent();
		
		
		
		
		
	}

}

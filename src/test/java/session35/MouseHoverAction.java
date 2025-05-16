package session35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://vinothqaacademy.com/mouse-event//");
		
		
		//Actions pre-defined class to perform mouse actions
		
		Actions act=new Actions(driver);
		
		//to perform mouse hover
		
		WebElement hoveritem=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[contains(text(),'About Me & Feedback')]"));
		WebElement inneritem=driver.findElement(By.xpath("//div[@class='collapse navbar-collapse pull-right']//a[normalize-space()='TechTalk']"));
		
		act.moveToElement(hoveritem).moveToElement(inneritem).click().build().perform();

	}

}

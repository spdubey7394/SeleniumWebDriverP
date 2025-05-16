package session35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		//creating actions object
		
		Actions act=new Actions(driver);
		
		//drag and drop action 
		
		WebElement oslo=driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement norway=driver.findElement(By.xpath("//div[@id='box101']"));
		
		act.dragAndDrop(oslo, norway).build().perform();
		
		WebElement washington=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement us=driver.findElement(By.xpath("//div[@id='box103']"));
		
		act.dragAndDrop(washington, us).build().perform();
		
		
	}

}

package session36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Creating actions class object
		
		Actions act=new Actions(driver);
		
		driver.findElement(By.xpath("//*[@id='inputText1']")).sendKeys("This session no 36 of java selenium course");
		
		// CTRL + A -- SELECTING THE TEXT
		
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).build().perform();
		
		//CTRL + C -- COPYING THE TEXT
		
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
		
		//TAB -- SWITCHING THE TAB
		
		act.keyDown(Keys.TAB).keyUp(Keys.CONTROL).build().perform();
		
		
		//CTRL + V --PASTING THE TEXT
		
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).build().perform()	;

	}

}

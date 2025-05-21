package session36;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SliderDemo 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//Creating actions class object
		
		Actions act=new Actions(driver);
		
		//Creating webelement variable for min and max sliders
		
		WebElement Min_slide=driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
		WebElement Max_slide=driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));

		//Getting the location of current slider of min slider
		
		System.out.println("Location of the min slider before" + Min_slide.getLocation()); // output will show x and y co-ordinates
		
		//performing slider shift
		
		act.dragAndDropBy(Min_slide, 100, 256).build().perform();
		
		System.out.println("Location of the min slider after" + Min_slide.getLocation()); // output will show x and y co-ordinates

		
		//Getting the location of current slider of max slider
		
				System.out.println("Location of the max slider before" + Max_slide.getLocation()); // output will show x and y co-ordinates
				
				//performing slider shift
				
				act.dragAndDropBy(Max_slide, -100, 256).build().perform();
				
				System.out.println("Location of the max slider after" + Max_slide.getLocation()); // output will show x and y co-ordinates
		
		
		
		
	}

}

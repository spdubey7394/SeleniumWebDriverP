package session32;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDrpdwnDemo {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com//");
		
		driver.findElement(By.name("q")).sendKeys("pesha"); //searchbox
		
		Thread.sleep(5000);
		
		List<WebElement> mlist=driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		
		//size
		
		System.out.println(mlist.size());
		
		//printing all the options
		
		for(WebElement op:mlist)
		{
			System.out.println(op.getText());
		}
		
		for(int i=0;i<mlist.size();i++)
		{
			if(mlist.get(i).getText().equals("peshawari sandals"))
			{
				mlist.get(i).click();
				break;
			}
		}
		
		
	}

}

package session31;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class selectdpdwn3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		
		WebElement drpdwn=driver.findElement(By.xpath("//select[@id='country-list']"));
		Select countrysel=new Select(drpdwn);
		
		List<WebElement> options=countrysel.getOptions();
		
		// count total number of options
		
		System.out.println("total options:" + options.size());
		
		//print all the options
		
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		Thread.sleep(5000);
		
		//select a single option
		
		countrysel.selectByVisibleText("India");
		
	}

}

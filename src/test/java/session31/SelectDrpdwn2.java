package session31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDrpdwn2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement Selcountry=driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		Select selcount=new Select(Selcountry);
		
		
		selcount.selectByVisibleText("Austria");
		
		Thread.sleep(5000);
		
		selcount.selectByVisibleText("India");
		
		List<WebElement> optionss=selcount.getOptions();

		
		System.out.println(optionss.size());
		
		for(WebElement op:optionss)
		{
			System.out.println(op.getText());
		}

	}

}

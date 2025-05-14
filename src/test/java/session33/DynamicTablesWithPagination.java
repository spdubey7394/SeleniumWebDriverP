package session33;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class DynamicTablesWithPagination {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testautomationpractice.blogspot.com");
	
 List <WebElement> pages=driver.findElements(By.xpath("//ul[@class='pagination']//li//a[@href='#']"));
 int total_pages=pages.size();
 System.out.println(total_pages);
 
 //click on each page
 
 for(int i=1;i<=total_pages;i++)
 {
	 if(i>=1)
	 {
	 WebElement pageclick=driver.findElement(By.xpath("//ul[@class='pagination']//li["+i+"]//a[@href='#']"));
	 pageclick.click();
	 Thread.sleep(6000);
	 }
	 
	 int rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
	 
	 for(int j=1;j<=rows;j++)
	 {
		 String id=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+j+"]//td[1]")).getText();
		 String name=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+j+"]//td[2]")).getText();
		 String price=driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+j+"]//td[3]")).getText();

		 List<WebElement> checkboxes = driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr["+j+"]//td[4]//input[@type='checkbox']"));
		 
		 
			for(int k=0;k<checkboxes.size();k++)
			{
			 checkboxes.get(k).click();
			}
			 
			 
		 
		 
		 System.out.println("ID " + id +"\t" +"Name " + name +"\t" + "Price" + price);

	 }
	 
	 
 }
	
	
	
	
	
		
		

	}

}

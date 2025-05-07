package session32;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
public class StaticWebTablesDemo {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com");
		
		//for rows
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //when there is multiple table
		//int rows=driver.findElements(By.tagName("tr")).size(); //where there is single table
		System.out.println("no. of rows " + rows );
		
		
		//for cols
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//tr//th")).size(); //multiple table
	//	int cols=driver.findElements(By.tagName("th")).size(); // single table
		System.out.println("no. of cols: " + cols);
		
		//read data from specific row an column using index no
		
		String spec=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[3]")).getText();
		System.out.println(spec);
		
		//read data from all rows and cols
		
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				String all=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(all+"\t");
			}
			System.out.println();
		}
		
		
		
		
	}

}

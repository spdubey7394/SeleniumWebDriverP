package session32;
import java.time.Duration;
import java.util.*;

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
		
		//print book name whose author is Amit
		
		for(int i=2;i<=rows;i++)
		{
			String authorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
		//	System.out.println(authorName);
			
			if(authorName.equals("Amit"))
			{
			String Bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
			System.out.println(Bookname + "\t" + authorName);
			}
			
			
			
		}
		
		//to add all the price
		int totall=0;
		for(int j=2;j<=rows;j++)
		{	
		String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+j+"]//td[4]")).getText();
		System.out.println(price);
		
		totall=totall + Integer.parseInt(price);
		System.out.println(totall);
		}
		
		
	}

}

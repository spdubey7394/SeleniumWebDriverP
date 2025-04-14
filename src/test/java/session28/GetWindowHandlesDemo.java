package session28;
import java.time.Duration;
import java.util.Set;
import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class GetWindowHandlesDemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		// opening a child webpage by CREATING WEBELEMENT variable
		
	WebElement npage=driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']"));
	npage.click();
	
	//getting windows ID BY USING Set<String> List - Approach 1

	Set<String> windowsIDs=driver.getWindowHandles(); // extracting windowsIDS 
	System.out.println(windowsIDs);
	
	List<String> windowslist=new ArrayList(windowsIDs); // feeding the windowsids in the windowslist ArrayList
	
	String ParentID=windowslist.get(0); //fetching parent WINDOW ID
	String ChildID=windowslist.get(1);  //FETCHING CHILD WINDOW ID
	
	// BY default the parent window is considered, to perform some actions we need to switch between different windows
	
	// using switch() methods - from parent to child window
	
	driver.switchTo().window(ChildID);
	System.out.println(driver.getTitle());
	
	// using switch() methods - from child to parent window
	
	driver.switchTo().window(ParentID);
	System.out.println(driver.getTitle()); 
	
	// if want to close window from the specific window from the above using enhanced loop
	


	
	


	}

}

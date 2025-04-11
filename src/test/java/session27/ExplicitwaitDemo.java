package session27;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitwaitDemo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		// Step -1: Declaration of explicit wait using webdriver wait class
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//step 2 - usage of conditions on the web elements
		
	WebElement txtusername=	mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
	txtusername.sendKeys("Admin");
	
	WebElement txtpassword= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
	txtpassword.sendKeys("admin123");	
	
	WebElement loginbtn=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Login']")));
	loginbtn.click();
	
	
	WebElement drpdwn= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")));
	drpdwn.click();
	
	WebElement logout=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Logout']")));
	logout.click();
	
	
	driver.quit();
		
	}

}

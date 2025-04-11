package session27;
import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException
	{
		 WebDriver driver = new ChromeDriver();

	        // Fluent wait declaration
	        Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
	            .withTimeout(Duration.ofSeconds(30))
	            .pollingEvery(Duration.ofSeconds(5))
	            .ignoring(NoSuchElementException.class);

	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	        driver.manage().window().maximize();

	        WebElement txtUsername = mywait.until(new Function<WebDriver, WebElement>() {
	            public WebElement apply(WebDriver driver) {
	                return driver.findElement(By.xpath("//input[@name='username']"));
	            }
	            
	        });

	        txtUsername.sendKeys("Admin");
	    }
	}




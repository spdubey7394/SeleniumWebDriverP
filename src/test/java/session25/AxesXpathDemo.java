package session25;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxesXpathDemo {
	
	/* Sample html code for axes:
	 * 
	 *<html>
  <body>
    <div id="main">
      <h1>Main Heading</h1>
      <ul>
        <li id="item1">Item 1</li>
        <li id="item2">Item 2</li>
        <li id="item3">Item 3</li>
      </ul>
      <p>Paragraph</p>
    </div>
  </body>
</html>
			

	 */

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///path/to/your/sample.html");

		// 1. self:: - Selects the current node
		WebElement selfExample = driver.findElement(By.xpath("//li[@id='item2']/self::li"));

		// 2. parent:: - Selects the parent of the current node
		WebElement parentExample = driver.findElement(By.xpath("//li[@id='item2']/parent::ul"));

		// 3. child:: - Selects the children of the current node
		WebElement childExample = driver.findElement(By.xpath("//ul/child::li[@id='item2']"));

		// 4. ancestor:: - Selects all ancestors (parent, grandparent, etc.)
		WebElement ancestorExample = driver.findElement(By.xpath("//li[@id='item2']/ancestor::div"));

		// 5. descendant:: - Selects all descendants (children, grandchildren, etc.)
		WebElement descendantExample = driver.findElement(By.xpath("//div[@id='main']/descendant::li[@id='item2']"));

		// 6. following:: - Selects everything in the document after the current node
		WebElement followingExample = driver.findElement(By.xpath("//li[@id='item2']/following::p"));

		// 7. preceding:: - Selects everything in the document before the current node
		WebElement precedingExample = driver.findElement(By.xpath("//li[@id='item2']/preceding::h1"));

		// 8. following-sibling:: - Selects all siblings after the current node
		WebElement followingSiblingExample = driver.findElement(By.xpath("//li[@id='item2']/following-sibling::li"));

		// 9. preceding-sibling:: - Selects all siblings before the current node
		WebElement precedingSiblingExample = driver.findElement(By.xpath("//li[@id='item2']/preceding-sibling::li"));


	}

}

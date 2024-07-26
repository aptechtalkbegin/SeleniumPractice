package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClosedShadowDomDemo {

	public static void main(String[] args) throws InterruptedException {
		
      WebDriver driver = new ChromeDriver();
      driver.get("https://letcode.in/shadow"); 
      driver.manage().window().maximize();
      
   
//      driver.findElement(By.cssSelector("div.field>my-web-component")).click();
      driver.findElement(By.cssSelector("div#close-shadow")).click();
      Actions action = new Actions(driver);
      action.sendKeys(Keys.TAB).perform();
      action.sendKeys("closed shadow").perform();
//      
//      driver.get("https://selectorshub.com/xpath-practice-page/");
//      driver.findElement(By.id("userPass")).click();
//      Thread.sleep(5000);
//      
//      Actions action = new Actions(driver);
//      action.sendKeys(Keys.TAB).perform();
//      action.sendKeys("password").perform();
      
	}

}

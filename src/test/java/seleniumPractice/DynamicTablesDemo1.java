package seleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DynamicTablesDemo1 {

	public static void main(String[] args) throws InterruptedException {
   
	String Expectedcustomer = "Rahul Das";	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.opencart.com/admin/");
	WebElement username = driver.findElement(By.id("input-username"));
	username.sendKeys("demo");
	WebElement password = driver.findElement(By.id("input-password"));
	password.sendKeys("demo");
	WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	loginButton.click();
	
	

	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Sales')]")));
	try {
	WebElement closeOption = driver.findElement(By.cssSelector("button.btn-close"));
	closeOption.click();
	}
	catch(Exception e)
	{
		
	}
	WebElement salesOption= driver.findElement(By.xpath("//a[contains(text(),'Sales')]"));
	salesOption.click();
	WebElement ordersOptions = driver.findElement(By.xpath("//a[contains(text(),'Orders')]"));
	ordersOptions.click();
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	Thread.sleep(5000);
	jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

//	jse.executeScript("arguments[0].scrollIntoView(true);", pagesElement);

       
	    WebElement pageEndLabel =driver.findElement(By.xpath("//div[@class='col-sm-6 text-end']"));
	    String pageEndText = pageEndLabel.getText().split(Pattern.quote("("))[1].split(" ")[0];
	    System.out.println(pageEndText);
	    
	    int pageEndCount = Integer.parseInt(pageEndText);
	    System.out.println(pageEndCount);
	    
	    
	/*	List<WebElement> pageItems = driver.findElements(By.cssSelector("li.page-item"));
		int pageItemsPageCount= pageItems.size();
		
		for( int i=1; i<=pageItemsPageCount; i++)
		{
			pageItems.click();
			
		} */
		driver.quit();
}
}
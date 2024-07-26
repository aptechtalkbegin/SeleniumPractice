package seleniumPractice;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Practice_Calander {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.findElement(By.xpath("//a[contains(text(),'Top Deals')]")).click();
		Set<String> mutlipleWindows = driver.getWindowHandles();
		          Iterator<String> window = mutlipleWindows.iterator();
		          String parentTab =  window.next();
		          String childTab = window.next();
		          
		driver.switchTo().window(childTab);
		driver.findElement(By.cssSelector("svg.react-date-picker__calendar-button__icon.react-date-picker__button__icon")).click();
		driver.findElement(By.cssSelector("span.react-calendar__navigation__label__labelText.react-calendar__navigation__label__labelText--from")).click();
		
		
		

	}

}

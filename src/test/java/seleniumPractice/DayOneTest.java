package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DayOneTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		System.out.println("checkbox is clicked");
		Assert.assertFalse((driver.findElement(By.xpath("//input[@value='option1']")).isSelected()));
	

	}

}

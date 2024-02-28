package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaveenOpenCartTest {

	public static void main(String[] args) {
	
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://naveenautomationlabs.com/opencart/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//span[text()='My Account']")).click();
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abcd");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("def");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd.def@gmail.com");
	driver.findElement(By.xpath("//input[@name='telephone']")).sendKeys("012345");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcd");
	driver.findElement(By.xpath("//input[@name='confirm']")).sendKeys("abcd");
	driver.findElement(By.xpath("//input[@name='newsletter']")).click();
	driver.findElement(By.xpath("//input[@name='newsletter']")).click();
	
	System.out.println("All testing is done");
    driver.close();
	}

}

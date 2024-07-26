package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HDFCAlertPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
	    driver.switchTo().frame("login_page");
	    
	    driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("12345");
	    System.out.println("Scenario Passed");
	    driver.quit();
//		driver.findElement(By.cssSelector("a.btn.btn-primary.login-btn")).click();
//		Thread.sleep(5000);
//		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alert = driver.switchTo().alert();
//		String msg = alert.getText();
//		System.out.println(msg);
//		alert.accept();
//		driver.switchTo().defaultContent();
//        driver.quit();
	}

}

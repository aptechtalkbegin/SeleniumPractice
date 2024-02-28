package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSeleniumTest {

	public static void main(String[] args) throws InterruptedException {
{
		
		//1) Launch browser
		ChromeDriver driver= new ChromeDriver();
		
		//2) Launch application URL in the browser
		driver.get("https://demo.opencart.com");
		
		//3) Maximize window
		driver.manage().window().maximize(); 
        
		Thread.sleep(5000);
		
		// Click on MyAccount link
	
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		
		// Click on Register  link
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		System.out.println("Registration Page is displayed");
		
		driver.quit();
		
	}

}
}

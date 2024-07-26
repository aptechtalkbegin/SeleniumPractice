package seleniumPractice;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_WindowHandles {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
        Thread.sleep(2000);
        Set <String> windows = driver.getWindowHandles();
        Iterator<String> window = windows.iterator();
        String parentWindow = window.next();
        String childWindow = window.next();
        driver.switchTo().window(childWindow);
        String childWindowText = driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText();
        System.out.println(childWindowText);
        Thread.sleep(2000);
        driver.switchTo().window(parentWindow);
        Thread.sleep(2000);
        String parentWindowText = driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText();
        System.out.println(parentWindowText);
        System.out.println("Test Case Passed");
        driver.quit();
	}

}

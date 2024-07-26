package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDropDemo {

	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://letcode.in/draggable");
//		   WebElement inputElement = driver.findElement(By.cssSelector("#sample-box"));
		   WebElement inputElement = driver.findElement(By.xpath("//h3[@id='header']"));
		   Actions actions = new Actions(driver);
		   Thread.sleep(3000);
		   //
		   actions.dragAndDropBy(inputElement, 100, 0).build().perform();
//		   actions.clickAndHold(inputElement).pause(5).dragAndDropBy(inputElement, 100, 0).build().perform();
//		   actions.clickAndHold(inputElement).moveToElement(inputElement).build().perform();

	}

}

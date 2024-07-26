package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
public class ContextClickAndSelectOption {

	public static void main(String[] args) {



		        // Initialize ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Open a webpage
		        driver.get("https://opensource-demo.orangehrmlive.com/");

		        // Find an input element to interact with
		        WebElement inputElement = driver.findElement(By.xpath("//p[normalize-space()='Username : Admin']"));

		        // Create Actions class instance
		        Actions actions = new Actions(driver);

		        // Perform Ctrl + C (copy) on the input element
		        actions.keyDown(Keys.CONTROL)
		                .sendKeys("c")
		                .keyUp(Keys.CONTROL)
		                .build()
		                .perform();

		        // Perform Ctrl + V (paste) on the input element
		        actions.keyDown(Keys.CONTROL)
		                .sendKeys("v")
		                .keyUp(Keys.CONTROL)
		                .build()
		                .perform();

		        // Submit the form
//		        inputElement.submit();

		        // Close the browser
//		        driver.quit();
		    }
		}

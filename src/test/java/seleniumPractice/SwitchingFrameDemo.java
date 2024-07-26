package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingFrameDemo {

	public static void main(String[] args) {
		
	//switching between frame by index

		        // Initialize ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Open the webpage with frames
		        driver.get("https://docs.oracle.com/javase/8/docs/api/");

		        // Find all frames on the page
		        List<WebElement> frames = driver.findElements(By.tagName("frame"));
		        frames.addAll(driver.findElements(By.tagName("frame")));

		        // Loop through the frames
		        for (WebElement frame : frames) {
		            try {
		                // Switch to the frame
		                driver.switchTo().frame(frame);

		                // Attempt to find the link inside the frame
		                WebElement link = driver.findElement(By.linkText("Description"));

		                // Click on the link
		                link.click();

		                // If the link is clicked successfully, break out of the loop
		                break;
		            } catch (Exception e) {
		                // If link not found in current frame, continue to the next frame
		                System.out.println("Link not found in current frame. Continuing to the next frame...");
		            } finally {
		                // Switch back to the default content for the next iteration
		                driver.switchTo().defaultContent();
		            }
		        }

		        // Close the browser
		        driver.quit();
		    }
		}


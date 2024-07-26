package seleniumPractice;

	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class SliderDemo_Issue {


	    public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://letcode.in/slider");
	        driver.manage().window().maximize();

	        // Find the slider element
	        WebElement sliderElement = driver.findElement(By.id("slider"));

	        // Get the slider's width
	        int width = sliderElement.getSize().getWidth();

	        // Get the value range of the slider
	        int minValue = 0;
	        int maxValue = 100;

	        // Move the slider to the leftmost position (min value)
	        moveSlider(driver, sliderElement, minValue);

	        // Move the slider to the rightmost position (max value)
	        moveSlider(driver, sliderElement, maxValue);

	        driver.quit();
	    }

	    // Function to move the slider to a specific value
	    private static void moveSlider(WebDriver driver, WebElement sliderElement, int value) {
	        Actions actions = new Actions(driver);

	        // Calculate the offset to move the slider based on the value
	        int width = sliderElement.getSize().getWidth();
	        int xOffset = (int) (width * ((double) value / 100));

	        // Click and hold on the slider, then move by the calculated offset
	        actions.clickAndHold(sliderElement).moveByOffset(xOffset, 0).release().perform();
	    }
	}
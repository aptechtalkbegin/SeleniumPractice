package seleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_iFrames {


	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),\"Nested Frames\")]")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		String frameText = driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]")).getText();
		System.out.println(frameText);
		
		driver.switchTo().defaultContent();
		driver.quit();

	}

}

package seleniumPractice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshPageDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://letcode.in/draggable");
		  // driver.sendKeys(Keys.F5);

	}

}

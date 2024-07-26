package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
		public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.automationtesting.in/shadow-dom");
		
		WebElement shadowHost= driver.findElement(By.cssSelector("div#shadow-root"));

		SearchContext shadowRoot = shadowHost.getShadowRoot();
		WebElement shadowElement = shadowRoot.findElement(By.cssSelector("span#shadow-element"));
		String shadowElementText = shadowElement.getText();
		System.out.println(shadowElementText); 
		driver.quit();
		
		}
}
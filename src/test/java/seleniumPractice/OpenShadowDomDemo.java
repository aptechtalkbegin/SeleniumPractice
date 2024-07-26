package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenShadowDomDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	
		
		//********* single shadow dom element *************
		
	   /*  driver.get("https://dev.automationtesting.in/shadow-dom");
		   Thread.sleep(2000);
		   WebElement shadowHost = driver.findElement(By.cssSelector("#shadow-root"));
		   SearchContext shadowRoot = shadowHost.getShadowRoot();
		   Thread.sleep(3000);
		   WebElement shadowElement = shadowRoot.findElement(By.cssSelector("span#shadow-element"));
		   System.out.println(shadowElement.getText());
	   	   driver.quit();
		*/
		
		// ********** Nested shadow dom element ************
		   
	   /*  driver.get("https://dev.automationtesting.in/shadow-dom");
		    
		   //Get Outer Shadow Host
		   WebElement outerShadowHost = driver.findElement(By.cssSelector("#shadow-root"));
		   
		   //Get Outer Shadow Root
		   SearchContext OuterShadowRoot = outerShadowHost.getShadowRoot();
		   
		   //Get Inner Shadow host
		   WebElement innerShadowHost = OuterShadowRoot.findElement(By.cssSelector("#inner-shadow-dom"));
		   
		   SearchContext innerShadowRoot = innerShadowHost.getShadowRoot();

		   WebElement innerShadowElement = innerShadowRoot.findElement(By.cssSelector("span#nested-shadow-element"));
		   System.out.println(innerShadowElement.getText());
		   driver.quit();
		   
       */
		   
		// *************** Multi-nested Shadow Element *************
	 /*	   driver.get("https://dev.automationtesting.in/shadow-dom");
		    
		   //Get Outer Shadow Host
		   WebElement outerShadowHost = driver.findElement(By.cssSelector("#shadow-root"));
		   
		   //Get Outer Shadow Root
		   SearchContext OuterShadowRoot = outerShadowHost.getShadowRoot();
		   
		   //Get Inner Shadow Host
		   WebElement innerShadowHost = OuterShadowRoot.findElement(By.cssSelector("#inner-shadow-dom"));
		   
		   //Get Inner Shadow Root
		   SearchContext innerShadowRoot = innerShadowHost.getShadowRoot();
		   
		   //Get MultiNested Shadow Host
		   WebElement multiNestedShadowHost = innerShadowRoot.findElement(By.cssSelector("#nested-shadow-dom"));
		   
		  //Get MultiNested Shadow Root
		   SearchContext multiNestedShadowRoot = multiNestedShadowHost.getShadowRoot();
		   
           //*************** Get MultiNested Shadow Element ******************8
		   WebElement multiNestedShadowElement = multiNestedShadowRoot.findElement(By.cssSelector("#multi-nested-shadow-element"));
		   System.out.println(multiNestedShadowElement.getText());
		   driver.quit();
		
    */
		
		// Handling shadow DOM in the Chrome Settings page.
		
		
		driver.get("chrome://settings/");
	
		
	    WebElement OuterShadowHost = driver.findElement(By.cssSelector("body>settings-ui"));
		SearchContext OuterShadowRoot = OuterShadowHost.getShadowRoot();
		
		WebElement innerShadowHost = OuterShadowRoot.findElement(By.cssSelector("cr-toolbar#toolbar"));
		SearchContext innerShadowRoot = innerShadowHost.getShadowRoot();
		
		WebElement innerNestedShadowHost = innerShadowRoot.findElement(By.cssSelector("#search"));
		SearchContext innerNestedShadowRoot = innerNestedShadowHost.getShadowRoot();
		
		WebElement multiNestedShadowDomElement = innerNestedShadowRoot.findElement(By.cssSelector("input#searchInput"));
		multiNestedShadowDomElement.sendKeys("Entered in Multi Nested Shadow DOM");
		
		driver.quit();

		System.out.println("Passed");
		
	
		
		
	}
		

	}
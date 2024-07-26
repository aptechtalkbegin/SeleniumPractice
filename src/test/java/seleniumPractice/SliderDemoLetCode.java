package seleniumPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//public class SliderDemoLetCode {
//
//	public static void main(String[] args) throws InterruptedException {
//		
//		
//		        
//		        // Create ChromeDriver instance
//		        WebDriver driver = new ChromeDriver();
//		        
//		        // Navigate to the webpage containing the slider
//		        driver.get("https://letcode.in/slider");
//		        
//		        //Maximize the window
//		        driver.manage().window().maximize();
//		        
//		        // Locate the slider element
//	        	WebElement sliderElement = driver.findElement(By.id("generate"));
//	        	Actions actions = new Actions(driver);
//	        	actions.moveToElement(sliderElement).clickAndHold().build().perform();
//		        String sliderStartingPoint = driver.findElement(By.xpath("//h1[contains(text(),'Word limit : 1')]")).getText();
//		        String startingPointText = sliderStartingPoint.split(":")[1].trim();
//		        int startingPointValue = Integer.parseInt(startingPointText);
//		        do {
//
//		        	actions.sendKeys(Keys.ARROW_LEFT).perform();
//		        
//		        	Thread.sleep(100);
//		        }
//                while
//                	(startingPointValue!=1);
//		        
//                    
//                
//		       //To move slider forward to a particular position ##################
//		        String sliderEndPoint = driver.findElement(By.xpath("//h1[contains(text(),' Word limit : 40 ')]")).getText();
//		        String sliderEndPointText = sliderEndPoint.split(":")[1].trim();
//		        int sliderEndPointValue = Integer.parseInt(sliderEndPointText);
//
//		        do {
//		        	actions.moveToElement(sliderElement).clickAndHold().build().perform();
//		        	actions.sendKeys(Keys.ARROW_RIGHT).perform();
//		        	Thread.sleep(100);
//		      
//		        }
//                while
//                	(sliderEndPointValue!=40);
//		        		
//		        



public class SliderDemoLetCode {

	public static void main(String[] args) throws InterruptedException {

		        WebDriver driver = new ChromeDriver();	     
		        driver.get("https://letcode.in/slider");
		        driver.manage().window().maximize();
	
	        	WebElement sliderElement = driver.findElement(By.id("generate"));
	        	Actions actions = new Actions(driver);
	        	actions.moveToElement(sliderElement).clickAndHold().build().perform();
		        String sliderStartingPoint = driver.findElement(By.xpath("//h1[contains(text(),'Word limit : 1')]")).getText();
		        String startingPointText = sliderStartingPoint.split(":")[1].trim();
		        int startingPointValue = Integer.parseInt(startingPointText);
		        
	
		       
		        do {

		        	actions.sendKeys(Keys.ARROW_LEFT).perform();
		        	Thread.sleep(100);
		        }
                while
                	(startingPointValue!=1);
		        
		        
		        String sliderEndPoint = driver.findElement(By.xpath("//h1[contains(text(),' Word limit : 40 ')]")).getText();
		        String sliderEndPointText = sliderEndPoint.split(":")[1].trim();
		        int sliderEndPointValue = Integer.parseInt(sliderEndPointText);
		        


		        do {
		        	actions.moveToElement(sliderElement).clickAndHold().build().perform();
		        	actions.sendKeys(Keys.ARROW_RIGHT).perform();
		        	Thread.sleep(100);
		      
		        }
                while
                	(sliderEndPointValue!=40);
		        
		   
					
		        driver.quit();
		        }
	}


	



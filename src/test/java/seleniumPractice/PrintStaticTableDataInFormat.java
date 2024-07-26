package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintStaticTableDataInFormat {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
         List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
         int rowsCount = rows.size();
         
        List<WebElement> cols = driver.findElements(By.xpath("//table[@id='table1']//th"));
        int colsCount = cols.size();
        
        
        for (int r=1; r<=rowsCount; r++)
        {
        	if (r==1)
        	{
        		for(int c=1; c<=colsCount;c++)
        		{
        		 String headerXpathText = "//table[@id='table1']//th["+c+"]";	
        		 WebElement headerText = driver.findElement(By.xpath(headerXpathText));
        		 String allHeaderData = headerText.getText();
        		 System.out.print(allHeaderData+ " ");
        		 
        		}
        		
        		System.out.println();
        	}
        	else {
        		
        		for(int c=1; c<=colsCount; c++)
        		{
        			String colsDataXapth = "//table[@id='table1']//tr["+(r-1)+"]//td["+c+"]";
        			WebElement colsData = driver.findElement(By.xpath(colsDataXapth));
        			String colsDataText = colsData.getText();
        			System.out.print(colsDataText+" ");
     
        		}
        	       System.out.println();
        		
        	}
        	}
        driver.quit();
        }
	
}

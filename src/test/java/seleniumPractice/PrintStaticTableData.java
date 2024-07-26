package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintStaticTableData {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> allTableData = driver.findElements(By.xpath("//table[@id='table1']//tr/*"));
       //printing all the data as it is without table format:
		/*for(WebElement data: allTableData)
		{
		System.out.println(data.getText());
		}
		
		*/
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tr"));
		int rowsCount = rows.size();
		System.out.println(rowsCount);
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='table1']//th"));
		int colsCount = cols.size();
		System.out.println(colsCount);
		
		for(int r=1; r<=rowsCount; r++)
		{
			if (r==1) {
			       for(int c=1; c<=colsCount; c++)
			       {
				String xpathText =  "//table[@id='table1']//th["+c+"]";
				WebElement tableHeading = driver.findElement(By.xpath(xpathText));
				String tableHeadingText = tableHeading.getText();
				System.out.print(tableHeadingText+" ");
			   }
			       System.out.println();
			}
			else 
			{
				for (int c=1;c<=colsCount; c++)
				{
				
					String tableDataxpath = "//table[@id='table1']//tr["+(r-1)+"]//td["+c+"]";
					WebElement tableData = driver.findElement(By.xpath(tableDataxpath));
					String tableDataText = tableData.getText();
					System.out.print(tableDataText);
				}
			
					
				System.out.println();
		}
		
			}
		
		driver.quit();
	}

}

package seleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		//Excel > Workbook > Sheet > Row > Cell
		
		
		//(Java class to Open the excel sheet for reading the data)
		//FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Desktop\\data.xlsx");
		
		FileInputStream file = new FileInputStream("C:\\Users\\Priji\\Desktop\\Read_data.xlsx");
		
		//(Java class to handle a workbook of an excel sheet)
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		//(Java class to handle a sheet of an excel sheet)
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int totalRowCount = sheet.getLastRowNum();
		int totalCellCount = sheet.getRow(1).getLastCellNum();
		System.out.println(totalRowCount);
		System.out.println(totalCellCount);
		
		for(int r=0; r<=totalRowCount; r++)
		{
			/*Before reaching to all cells of a specific row, we need to first select one row
			 And then its all cells,specific row can be achieved via a sheet*/
			XSSFRow currentRow = sheet.getRow(r);
		
			
			for(int c=0; c<totalCellCount; c++)
			{
				
				/* Now using currentRow reference, we can get all cells of that row*/
				
				//String currentCellValue = currentRow.getCell(c).toString();  OR
				
				XSSFCell currentCell = currentRow.getCell(c);
				String currentCellValue = currentCell.toString();
				System.out.print(currentCellValue+ "   "); //Below 2 print statements are used to display item in proper format.
			}
				System.out.println();
		}
		workbook.close(); // At the end we need to close opened workbook first to avoid any memory leakage.
		file.close(); // After workbook, we need to close opened file before closing the program.
		
		
				
	}

}

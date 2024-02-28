package seleniumPractice;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {

   //Excel > Workbook > Sheet > Row > Cell
   
		FileOutputStream file = new FileOutputStream("C:\\Users\\Priji\\Desktop\\Write_data.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet();
		
		XSSFCell cell = sheet.createRow(0).createCell(0);
		cell.setCellValue("Ashish");
//		sheet.createRow(0).createCell(1).setCellValue("Ashish");
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("File Writing is completed");
      
	}

}

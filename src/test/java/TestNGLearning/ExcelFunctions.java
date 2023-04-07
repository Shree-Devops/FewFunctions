package TestNGLearning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFunctions {

	public static void main(String[] args) throws IOException {
		
		File myFile = new File("D://Ranu documents//Selenium/InputOutputExcel.xlsx");
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook myWorkBook = new XSSFWorkbook (fis);
		XSSFSheet mySheet = myWorkBook.getSheetAt(0);
		
		int totalRows = mySheet.getLastRowNum() +1 ;
		System.out.println("Row Count - " + totalRows);
		
		XSSFRow row = mySheet.getRow(1);
		
		int columnCount = row.getLastCellNum();
		System.out.println("Column Count - " + columnCount);

		XSSFCell cell = row.getCell(1);
		String stringCellValue = cell.getStringCellValue();
		System.out.println("stringCellValue - " + stringCellValue);
		cell.setCellValue("dont know");
		
		System.out.println(row.getCell(2).getNumericCellValue());
		System.out.println(row.getCell(3).getBooleanCellValue());
		
		FileOutputStream os = new FileOutputStream(myFile);
        myWorkBook.write(os);
	}

}

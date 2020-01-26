package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HandleExcelData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file= new FileInputStream("F:\\ashiselenium\\BasicCoreJava3\\src\\filehandling\\Testdata.xlsx");
		// filepath for fileinputstrem
		
		XSSFWorkbook wb= new XSSFWorkbook(file);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		XSSFRow row=sheet.getRow(0);
	
		
		XSSFCell cell=row.getCell(0);
		
		System.out.println(cell.getStringCellValue());
		
		
		System.out.println(sheet.getLastRowNum());
		
		System.out.println(row.getLastCellNum());
	}

	

	{
		
	}
}

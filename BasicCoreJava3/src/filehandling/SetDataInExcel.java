package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SetDataInExcel {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream file= new FileInputStream("F:\\ashiselenium\\BasicCoreJava3\\src\\filehandling\\Testdata.xlsx");
		// filepath for fileinputstream
		
		XSSFWorkbook wb= new XSSFWorkbook(file);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		XSSFRow row=sheet.getRow(13);
		if(row==null)
		row=sheet.createRow(15);
		
		XSSFCell cell=row.getCell(0);
		if(cell==null)
			cell=row.createCell(0);

		cell.setCellValue("ashrita");
		
		FileOutputStream file2= new FileOutputStream("F:\\ashiselenium\\BasicCoreJava3\\src\\filehandling\\Testdata.xlsx");
		wb.write(file2);
		
		
		
		
	}
	

}

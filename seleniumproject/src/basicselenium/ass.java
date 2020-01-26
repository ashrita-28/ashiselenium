package basicselenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ass {

	public static void main(String[] args) throws IOException {
		FileInputStream file= new FileInputStream("F:\\ashiselenium\\BasicCoreJava3\\src\\filehandling\\Testdata.xlsx");
		
		
		XSSFWorkbook wb= new XSSFWorkbook(file);
		
		XSSFSheet sheet=wb.getSheet("Sheet2");
		
		
	}

	

	{
		
	}


	}

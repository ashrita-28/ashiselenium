package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider2 {

	@Test(dataProvider="getData1")
	public void test1(String username, String password)
	{
System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
	
		dr.manage().window().maximize();
		
		dr.get("http://www.newtours.demoaut.com/");
		
		dr.findElement(By.name("userName")).sendKeys(username);
		
		dr.findElement(By.name("password")).sendKeys(password);
		
		dr.findElement(By.name("login")).click();
	}
	
	@DataProvider
	public String[][] getData()
	{
		String[][] data= new String[3][2];
		
		//row 1
		
		data[0][1]="mercury";
		data[0][1]="mercury";
		
		//row 2
		
		data[1][0]="mercury1";
		data[1][1]="mercury1";
		
		//row 3
		
		data[2][0]="mercury";
		data[2][1]="mercury";
		
		
		
		return data;


	}
	
	
	@DataProvider
	public String[][] getData1() throws IOException
	{
		
		Xls_Reader xl= new Xls_Reader("F:\\ashiselenium\\TestNGProjct2\\src\\test\\Testdata.xlsx");
		int rows=xl.getRowCount("Sheet2");
		int cols=xl.getColumnCount("Sheet2");
		
		String[][] data= new String[rows-1][cols];
		
		for(int r=2; r<=rows; r++)
		{
			for(int c=1; c<=cols; c++)
			{
				data[r-2][c-1]=xl.getCellData("Sheet2", r, c);
			}
		}
		return data;
}
}
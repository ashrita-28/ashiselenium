package module1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1Module1 {
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class TestModule1");
	}
	@Test
	public void test1()
	{
		System.out.println("TestModule1 test case 1");
	}

	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class Test Module1");
	}
	
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("Launch Browser");
	}

	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Close Browser");
	}
	
	@Test
	public void test2()
	{
		System.out.println("TestModule1 test case 2");
	}
}


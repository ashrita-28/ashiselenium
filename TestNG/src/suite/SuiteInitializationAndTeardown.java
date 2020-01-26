package suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteInitializationAndTeardown {
	
	@BeforeSuite
	public void initization()
	{
		
		System.out.println("Enviroment set up");
	}

	@AfterSuite
	public void teardown()
	{
		System.out.println("Final report generation");
	}
}

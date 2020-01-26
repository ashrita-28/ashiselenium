package module1;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Module1InitializationAndTeardown {
	
	@BeforeTest
	public void module1initilazion()
	{
		System.out.println("Module 1 specif configuration");
	}

	@AfterTest
	public void module1teardown()
	{
		System.out.println("Revertback module 1 specific configuration");
	}
}

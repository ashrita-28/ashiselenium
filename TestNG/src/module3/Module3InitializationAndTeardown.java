package module3;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Module3InitializationAndTeardown {
	
	
		
		@BeforeTest
		public void module1initilazion()
		{
			System.out.println("Module 3 specif configuration");
		}

		@AfterTest
		public void module3teardown()
		{
			System.out.println("Revertback module 3 specific configuration");
		}
	}



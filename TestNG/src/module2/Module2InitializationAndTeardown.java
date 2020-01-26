package module2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Module2InitializationAndTeardown {
	
	
		
		@BeforeTest
		public void module1initilazion()
		{
			System.out.println("Module 2 specif configuration");
		}

		@AfterTest
		public void module2teardown()
		{
			System.out.println("Revertback module 2 specific configuration");
		}
	}


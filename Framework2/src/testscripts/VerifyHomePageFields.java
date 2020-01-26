package testscripts;

 import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import configuration.Configuration;

import library.ApplicationLibrary;
import pages.HomePage;

public class VerifyHomePageFields {
	
	WebDriver dr;
	HomePage homePage;
	
	
	@BeforeClass
	public void initilize()
	{
		ApplicationLibrary lib= new ApplicationLibrary();
		
		dr=lib.launchBrowser("Chrome");
		dr.get(Configuration.url);
		
		homePage=new HomePage(dr);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		dr.close();
	}
	
	@Test(priority=0)
	public void verifySignON()
	{
		Assert.assertTrue(homePage.issSignONDisplayed());
		
		//using assert for validation
		
	}
	
	@Test(priority=1)
	public void verifyRegisterLink()
	{
		Assert.assertTrue(homePage.isRegisterDisplayad());
	}
	
	@Test(priority=2)
	public void verifyusername()
	{
		Assert.assertTrue(homePage.isUserNameDisplayed());
	}
	
	@Test(priority=3)
	public void verifyPassword()
	{
		Assert.assertTrue(homePage.isPasswordDisplayed());
	}
	
	@Test(priority=4)
	public void verifylogin()
	{
		Assert.assertTrue(homePage.isLoginDisplayed());
	}

	@Test(dependsOnMethods= {"verifyusername", "verifyPassword", "verifylogin"})
	public void verifyloginfunctionalty()
	{
		String var=homePage.login(Configuration.globalUserName, Configuration.globalPassword);
		
		Assert.assertEquals(var, "Find a Flight: Mercury Tours:");
	}
	
	@Test(DependsOnMethods= {"verifyLoginFunctionality"})
	public void selectFlightDetails()
	{
		
		
	}
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver dr; // using constructor this instance var
	
	public HomePage(WebDriver dr)
	{
		this.dr=dr;
	}

	By username=By.name("userName");
	By Password=By.name("password");
	By login=By.name("login");
	By signon=By.linkText("SIGN-ON");
	By registration=By.linkText("REGISTER");
	
	public boolean issSignONDisplayed()
	{
		return dr.findElement(signon).isDisplayed();
	}
	
	public boolean isRegisterDisplayad()
	{
		return dr.findElement(registration).isDisplayed();
	}
	
	public boolean isUserNameDisplayed()
	{
		return dr.findElement(username).isDisplayed();
	}
	
	public boolean isPasswordDisplayed()
	{
		return dr.findElement(Password).isDisplayed();
	}
	
	public boolean isLoginDisplayed()
	{
		return dr.findElement(login).isDisplayed();
	}
	
	public String login(String username, String password)
	{
		dr.findElement(this.username).sendKeys(username);
		dr.findElement(this.Password).sendKeys(password);
		dr.findElement(this.login).click();
		
		return dr.getTitle();
	}	
}


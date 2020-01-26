package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		//dr.close();
		dr.manage().window().maximize();
		
		dr.get("https://accounts.google.com/");
		//dr.get("http://www.newtours.demoaut.com/");
		
		//dr.findElement(By.name("userName")).sendKeys("mercury");
		
		//dr.findElement(By.name("password")).sendKeys("mercury");
		
		dr.findElement(By.name("login")).click();
		
		dr.findElementByXPath("//*[@id="identifierId"]");
	}

}
 
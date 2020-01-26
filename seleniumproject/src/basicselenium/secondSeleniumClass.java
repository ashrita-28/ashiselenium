package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class secondSeleniumClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		//dr.close();
		dr.manage().window().maximize();
		
		dr.get("http://newtours.demoaut.com/mercuryreservation.php?osCsid=bfcb88679ffc6126bd6e80959c9c52bf");
		
		WebElement tripType=dr.findElement(By.xpath("//input[@value='oneway']"));
		
		System.out.println(tripType.isSelected());
		
		tripType.click();
		System.out.println(tripType.isSelected());
		
		WebElement pass=dr.findElement(By.name("passCount"));
		
		Select sel= new Select(pass);
		sel.selectByIndex(3);
		
		Thread.sleep(2000);
		sel.selectByValue("2");
		
		
		Thread.sleep(2000);
		sel.selectByVisibleText("3");
		
		 
		
		
	}

}

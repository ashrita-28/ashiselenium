package basicselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ThirdSeleniumClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
	
		dr.manage().window().maximize();
		
		dr.get("http://newtours.demoaut.com/mercuryreservation.php?osCsid=bfcb88679ffc6126bd6e80959c9c52bf");
		
		dr.findElementByName("findFlights").click();

		WebElement text=dr.findElementByXPath("//font[@face='Arial, Helvetica, sans-serif'][@size='2']");
		
		System.out.println(text.getText());
		
		dr.findElementByName("reserveFlights").click();
		
		dr.findElementByName("ticketless").click();
		
		dr.findElementByXPath("(//input[@name='ticketLess'])[2]").click();
		
		
		WebElement country=dr.findElement(By.name("delCountry"));
		
		Select sel=new Select(country);
		
		sel.selectByVisibleText("INDIA");
		
		Alert alt=dr.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.dismiss();
		
		
	}
	
	

}

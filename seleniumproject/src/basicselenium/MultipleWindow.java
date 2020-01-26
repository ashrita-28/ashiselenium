package basicselenium;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "F:\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr= new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.get("https://www.naukri.com/");
		
		String parent=dr.getWindowHandle();
		Set<String> wins=dr.getWindowHandles();
		
		
		for(String s:wins)
		{
			dr.switchTo().window(s);
			if(dr.getTitle().equals("AGS Health"));{
				dr.close();
			}
	
		}
		
	
	}

}

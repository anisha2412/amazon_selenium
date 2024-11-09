package AutomationCore;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass 
{
	public WebDriver driver;     // selenium class's - WebDriver's - object declaration
		
	// Method to invoke browser
	public WebDriver browserinitailzation(String browserName) throws Exception 
	{
		if(browserName.equalsIgnoreCase("Chrome"))  // different browsername invoking-compare with method parameter
		{
			driver = new ChromeDriver();			// object initailzation
		}
		else if(browserName.equalsIgnoreCase("Firefox")) 
		{
			driver = new FirefoxDriver();			
		}
		else if(browserName.equalsIgnoreCase("Edge")) 
		{
			driver = new EdgeDriver();			
		}
		else 
		{
			throw new Exception("Invalid Browser Name Exception!!");
		}
		
		//oct 28 - implicit wait
	
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS); //old version		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));  //new version
					
		return driver;   	// WebDriver - driver return type
	}
}

package base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Base {
	
	public WebDriver initializeBrowser(String browserName) throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			dc.setBrowserName("chrome");
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			
			dc.setBrowserName("firefox");
			
		}else if(browserName.equalsIgnoreCase("edge")) {
			
			dc.setBrowserName("MicrosoftEdge");
			
		}
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.10.106:4444"),dc);
		
		driver.manage().window().maximize();
		
		return driver;
	}

}

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest {

	@Test
	public void HomePageCheck() throws MalformedURLException
	{
/*		
		When request reaches distributor for the first time
		it doest't know which browser we have to execute ,
		under which operating system */
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);	
/*
		  
		 System.setProperty("webdriver.chrome.driver"
				 ,"/Users/chromedriver.exe");
				 
		 * we sending request to Chrome browser to run 
		 * but not sending request to hub */
		
		
		WebDriver driver = new RemoteWebDriver
				(new URL("http://localhost:4444/wd/hub"),dc);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Yathirv");
		System.out.println(driver.getTitle());
		driver.close();

	}

}

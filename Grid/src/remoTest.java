import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class remoTest {

	@Test
	public void Check() throws MalformedURLException
	{
		//new RemoteWebDriver(new URL("http://localhost:4444/"), new ChromeOptions());
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);

		//System.setProperty("webdriver.chrome.driver", "/Users/ASUS/Downloads/chromedriver.exe");
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
		//driver.manage().window().maximize();

		driver.get("https://www.rahulshettyacademy.com/angularpractice/");

		WebElement nameEditBox = driver.findElement(By.xpath("//input[@name='name']"));
		WebElement dob = driver.findElement(By.cssSelector("[for='dateofBirth']"));
		WebElement checkbox = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		WebElement inlineRadioOptions = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));

		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		driver.findElement(with(By.tagName("input")).below(dob)).click();
		driver.findElement(with(By.tagName("input")).toLeftOf(checkbox)).click();
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(inlineRadioOptions)).getText());




	}
}
package WebDriver;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Demo16_Grid {
	
	WebDriver driver;
	
	@Test
	public void testcase() throws MalformedURLException{
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver(new URL("http://9.193.20.71:4444/wd/hub"), capabilities);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("txtPassword");
		driver.findElement(By.id("btnLogin")).click();
	}
}

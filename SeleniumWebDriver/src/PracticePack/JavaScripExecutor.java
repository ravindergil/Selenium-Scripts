package PracticePack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScripExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
		js.executeScript("document.getElementById('txtUsername').value='Admin'");
		js.executeScript("document.getElementById('txtPassword').value=('admin123')");
		js.executeScript("document.getElementById('btnLogin').click()");
		js.executeScript("document.getElementById('menu_pim_viewPimModule').click()");

	}

}

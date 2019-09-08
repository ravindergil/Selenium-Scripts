package WebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12_WaitCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJarFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://google.com");
		Driver.manage().window().maximize();
		String title = Driver.getTitle();
		
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

}

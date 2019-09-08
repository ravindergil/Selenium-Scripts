package WebDriver;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo18_Log4j {

	public static void main(String[] args) {


		Logger logger = Logger.getLogger("Demo18_Log4j");
		PropertyConfigurator.configure("log4j.properties");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		logger.info("Open web page");
		String title = driver.getTitle();
		logger.info(title);
		

	}

}

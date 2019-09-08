package WebDriver;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Demo19_ExtentReports {

	public static void main(String[] args) {
		
		ExtentReports extent;
		ExtentTest logger;
		// Path where the file must be saved
		extent = new ExtentReports(System.getProperty("user.dir")+"/test-output-ExtentReport/Ravinder.html", true);
		// Define format of the file 
		extent.loadConfig(new File(System.getProperty("user.dir")+"extent-config.xml"));
		logger = extent.startTest("Demo19_ExtentReports");
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		logger.log(LogStatus.PASS, "maximized my browser");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		logger.log(LogStatus.PASS, "open the browser with URL");
			
		String title = driver.getTitle();
		logger.log(LogStatus.PASS, title);
		
		driver.close();
		logger.log(LogStatus.PASS, "closed the browser");
		extent.endTest(logger);
		extent.flush();
		extent.close();
		

	}

}

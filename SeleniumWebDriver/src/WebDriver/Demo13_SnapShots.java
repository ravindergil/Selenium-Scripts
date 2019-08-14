package WebDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo13_SnapShots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJarFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://google.com");
		Driver.manage().window().maximize();
		String title = Driver.getTitle();
		System.out.println(title);
		File screenshot = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("D://Sunil.png"));
		

	}

}

package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJarFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		WebElement UN = driver.findElement(By.cssSelector("input[name='userName']"));
		if(UN.isEnabled()){
			UN.sendKeys("Sunil");
				Thread.sleep(3000);
					UN.clear();
					UN.sendKeys("Sunil");
		}
		
		if(UN.isDisplayed()){
			System.out.println(UN.getAttribute("value"));
		} else {
			System.out.println("Not Displayed");
		}
		
		driver.close();
	}

}

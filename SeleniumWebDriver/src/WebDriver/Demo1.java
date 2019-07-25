package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJarFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver ChromeDriver = new ChromeDriver();
		
		ChromeDriver.get("https://opensource-demo.orangehrmlive.com");
		ChromeDriver.manage().window().maximize();
		
		String ExpectedTitle = "OrangeHRM";
		
		ChromeDriver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		ChromeDriver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		ChromeDriver.findElement(By.cssSelector("input.button")).click();
		
		String ActualTitle = ChromeDriver.getTitle();
		
		if (ExpectedTitle.equals(ActualTitle)){
			System.out.println("TestPass");
			ChromeDriver.findElement(By.linkText("Welcome Admin")).click();	
			Thread.sleep(2000);
			WebElement LogOut = ChromeDriver.findElement(By.linkText("Logout"));
			LogOut.click();
			
			/*WebDriverWait wait = new WebDriverWait(ChromeDriver, 2000);
			wait.until(ExpectedConditions.elementToBeClickable(LogOut));*/
			
		} else {
			System.out.println("TestFails");
		}
		ChromeDriver.close();
	}
}

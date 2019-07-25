package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJarFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		
		WebElement Login = driver.findElement(By.cssSelector("input.button"));
		Actions act = new Actions(driver);
		act.sendKeys(Login, Keys.ENTER).build().perform();
		Thread.sleep(3000);
		
		//act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER);
		//act.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER).build().perform();
		
		WebElement PIM = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']/b"));
		act.moveToElement(PIM).build().perform();
		
		WebElement EmployeeList = driver.findElement(By.cssSelector("a#menu_pim_viewEmployeeList"));
		act.moveToElement(EmployeeList).build().perform();
		act.sendKeys(EmployeeList, Keys.ENTER).build().perform();
		Thread.sleep(2000);
		//act.click(EmployeeList).build().perform();
		act.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();
	
	}
}


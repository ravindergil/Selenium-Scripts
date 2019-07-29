package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo10 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		
		driver.navigate().refresh();
		js.executeScript("history.go(0)");
		
		js.executeScript("document.getElementById('txtUsername').value='Admin'");
		js.executeScript("document.getElementById('txtPassword').value='admin123'");
		

		WebElement ele = (WebElement)js.executeScript("return document.getElementById('txtUsername')");
		String name = ele.getAttribute("value");
		System.out.println(name);
		Thread.sleep(2000);
		js.executeScript("document.getElementById('btnLogin').click()");
		
		Thread.sleep(2000);
		js.executeScript("document.getElementById('menu_pim_viewPimModule').click()");
		
		/*Thread.sleep(2000);
		js.executeScript("document.getElementById('menu_recruitment_viewRecruitmentModule').click()");*/
		
		WebElement WE1 = driver.findElement(By.id("menu_pim_viewEmployeeList"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(WE1).sendKeys(Keys.ARROW_DOWN, Keys.RETURN).perform();
		
	}

}

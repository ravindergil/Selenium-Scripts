package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("Sunil");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("sunil");
		driver.findElement(By.cssSelector("input[name='login']")).click();
		Thread.sleep(2000);
		WebElement WE = driver.findElement(By.cssSelector("select[name='passCount']"));
		Select select = new Select(WE);
		select.selectByVisibleText("2");
		
		WebElement WE2 = driver.findElement(By.cssSelector("select[name='fromPort']"));
		Select select2 = new Select(WE2);
		select2.selectByVisibleText("London");
		driver.findElement(By.xpath("//input[@name='servClass' and @value='Business']")).click();
		driver.findElement(By.xpath("//input[@name='findFlights' and @type='image']")).click();
		driver.findElement(By.xpath("//input[@name='reserveFlights' and @type='image']")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("ABC");	
		Thread.sleep(2000);
		driver.findElement(By.name("passLast0")).sendKeys("DEF");
		Thread.sleep(2000);
		driver.findElement(By.name("creditnumber")).sendKeys("9876543210");
		Thread.sleep(2000);
		driver.findElement(By.name("cc_frst_name")).sendKeys("ABC");
		Thread.sleep(2000);
		driver.findElement(By.name("cc_last_name")).sendKeys("DEF");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[contains(text(),'Ticketless Travel')]")).click();
		//driver.findElement(By.xpath("//*[contains(text(),'Same as Billing Address')]")).click();
		//driver.findElements(By.name("ticketLess"));
		
		List<WebElement> checkBoxes = driver.findElements(By.name("ticketLess"));
		for(WebElement E:checkBoxes){
			E.click();
			Thread.sleep(2000);
		}
		
		driver.findElement(By.name("buyFlights")).click();
		driver.close();
	}
}

package WebDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJarFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		  
		driver.get("http://realestate.upskills.in/admin");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input.input-text#user_login")).sendKeys("admin");
		driver.findElement(By.cssSelector("input#user_pass.input-text")).sendKeys("adminuser@12345");
		driver.findElement(By.cssSelector("input[class='button border margin-top-10']")).click();
		String title1 = driver.getTitle();

		WebElement link = driver.findElement(By.xpath("//*[contains(text(),'Howdy')]"));
		Actions act= new Actions(driver);
		act.contextClick(link).build().perform();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_TAB);
		String title2 = driver.getTitle();
		if(title1.equals(title2)){
			System.out.println("Title are same");
		} else {
			System.out.println("Title are not same");
		}

	}

}


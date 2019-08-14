package WebDriver;

import java.awt.AWTException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo8 {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement Gmail = driver.findElement(By.className("gb_e"));
		Actions act = new Actions(driver);
		
		act.moveToElement(Gmail).keyDown(Keys.CONTROL).click().build().perform();
		String title1 = driver.getTitle();
		System.out.println(title1);
		
		/*Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_TAB);
		
		String title2 = driver.getTitle();
		System.out.println(title2);*/
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(1));
		
		
	}
}

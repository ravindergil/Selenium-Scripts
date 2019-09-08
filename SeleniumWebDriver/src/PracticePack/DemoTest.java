package PracticePack;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoTest {

	public static void main(String[] args) throws Exception {
		

System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String pw = driver.getWindowHandle();
		System.out.println("Parent window: "+pw);

	
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		WebElement images = driver.findElement(By.linkText("Images"));
		
		Actions act = new Actions(driver);
		act.contextClick(gmail).build().perform();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		String url1 = driver.getCurrentUrl();
		String title1 = driver.getTitle();
		System.out.println("URL and Title 1 is: "+title1+"-------"+url1+"\n");
		Thread.sleep(3000);
		driver.switchTo().window(pw);
		Thread.sleep(3000);
		act.moveToElement(images);
		act.contextClick(images).build().perform();
		
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		String url2 = driver.getCurrentUrl();
		String title2 = driver.getTitle();
		System.out.println("URL and Title of gmail link is: "+title2+"-------"+url2+"\n");
		Thread.sleep(3000);
		driver.switchTo().window(pw);
		
		
		ArrayList<String> win = new ArrayList<>(driver.getWindowHandles());
		System.out.println("Total windows: "+win.size());
		driver.switchTo().window(win.get(1));
		Thread.sleep(3000);
		String TitleWin1 = driver.getTitle();
		System.out.println(TitleWin1);
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(win.get(0));
		String TitleWin0 = driver.getTitle();
		System.out.println(TitleWin0);
		driver.close();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(win.get(2));
		String TitleWin2 = driver.getTitle();
		System.out.println(TitleWin2);
		driver.close();
		
		//driver.quit();


	}

}

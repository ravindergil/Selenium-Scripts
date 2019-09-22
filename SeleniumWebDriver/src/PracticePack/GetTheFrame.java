package PracticePack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetTheFrame {
	
	static WebDriver driver;
	
	public static int GetFrame(By Locator){
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(Locator);
		System.out.println(frames.size());
		int i;
		for (i=0; i<frames.size(); i++){
			
			System.out.println(frames.get(i).getAttribute("name"));
			driver.switchTo().frame(i);
			
			
			List <WebElement> coupon = driver.findElements(Locator);
			
			if(coupon.size()>0){
				driver.findElement(By.id("show-redeem-certificate-code"));
				System.out.println("Frame Located");
				System.out.println(i);
				driver.switchTo().defaultContent();
				break;
			}else {
				System.out.println("Continue Looping");
				driver.switchTo().defaultContent();
			}	
		}
		return i;
	}
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://themassagelab.com/");
		driver.manage().window().maximize();
		int frameNume = GetFrame(By.id("show-redeem-certificate-code"));
		
		driver.switchTo().frame(frameNume);
		driver.findElement(By.id("show-redeem-certificate-code")).click();
		Actions act = new Actions(driver);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		act.keyDown(Keys.SHIFT).sendKeys("asdf").build().perform();;
	}
}

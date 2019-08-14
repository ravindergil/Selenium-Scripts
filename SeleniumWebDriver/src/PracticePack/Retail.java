package PracticePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Retail {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://retail.upskills.in/home12");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("button-cart")).click();
		
		WebElement chart = driver.findElement(By.xpath("//i[@class='tb_icon ico-linea-ecommerce-bag']"));		
		Actions act = new Actions(driver);
		act.moveToElement(chart).build().perform();
		
	}

}

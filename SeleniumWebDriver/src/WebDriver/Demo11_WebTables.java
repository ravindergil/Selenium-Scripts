package WebDriver;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11_WebTables {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		
		System.out.println("Number of Frames : " + frames.size());
		
		Iterator<WebElement> itr = frames.iterator();
		
		int i = 1;
		
		while(itr.hasNext()){
			System.out.println(i +". "+ itr.next().getAttribute("name"));
			i++;
		}
		
		driver.switchTo().frame("iframe2");
		driver.findElement(By.linkText("Sortable")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("iframe1");
		

	}
}

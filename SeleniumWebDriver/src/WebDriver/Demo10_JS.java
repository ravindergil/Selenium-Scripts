package WebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10_JS {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		js.executeScript("window.location = 'https://opensource-demo.orangehrmlive.com/';");
		driver.manage().window().maximize();
		
		// Get Page Title using Java Script Executor
		String title = js.executeScript("return document.title").toString();
		System.out.println(title);
		
		// Get Size of window
		long Height = (Long)js.executeScript("return window.innerHeight");
		long Width = (Long)js.executeAsyncScript("return window.innetWidth");
		
		System.out.println(Height + " " + Width);
		
		// Refresh page using Java Script Executor
		driver.navigate().refresh();
		js.executeScript("history.go(0)");
		// Perform some actions using Java Script Executor
		js.executeScript("document.getElementById('txtUsername').value='Admin'");
		js.executeScript("document.getElementById('txtPassword').value='admin123'");
		
		//getElementById is only command in javascript and getElementsByclass is another command
		WebElement ele = (WebElement)js.executeScript("return document.getElementById('txtUsername')");
		
		String name = ele.getAttribute("value");
		
		System.out.println(name);
		Thread.sleep(2000);
		js.executeScript("document.getElementById('btnLogin').click()");
		
		Thread.sleep(2000);
		js.executeScript("document.getElementById('menu_pim_viewPimModule').click()"); 
		
		//Thread.sleep(2000);
		//js.executeScript("document.getElementById('menu_recruitment_viewRecruitmentModule').click()");
		
		// Scroll down using Coordinates
		// js.executeScript("window.scrollBy(0,600)");
		// Scroll Up using Coordinates
		// js.executeScript("window.scrollBy(0,-600)");
		// Scroll Back to default using Coordinates
		// js.executeScript("window.scrollTo(0,0)");
		
		// Scroll till the end of the page
		// js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		// Thread.sleep(2000);
		// Scroll up to the top of the page
		// js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		
		// js.executeScript("window.screenTop");
		
		// -------------------> Scroll in to View
		// js.executeScript("document.getElementById('ohrmList_chkSelectRecord_5').scrollIntoView()");
		
		// JavascriptExecutor js = (JavascriptExecutor)driver;
		// js.executeScript("document.getElementById('mce-EMAIL').scrollIntoView()");
		
		// WebElement redeem = driver.findElement(By.id("mce-EMAIL"));
		// js.executeScript("arguments[0].scrollIntoView(true);", redeem);
		
		System.out.println("---------- Using WebDriver ----------");
		System.out.println(driver.findElement(By.xpath("//table[@id='resultTable']")).getText());
		
		// Using Java Script
		System.out.println("================== Using Java Script =====================");
		String TableData = js.executeScript("return document.getElementById('resultTable').innerText").toString();
		System.out.println(TableData);
		
		String HTMLData = js.executeScript("return document.getElementById('resultTable').innerHTML").toString();
		System.out.println(HTMLData);
		
		// navigating using java script
		js.executeScript("window.history.back()");
		driver.navigate().forward();
		js.executeScript("window.history.forward()");
		
		// Generating alert with javascript and Handling it with selenium
		
		js.executeScript("alert('Welcome to the session on selenium')");
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
	}
}

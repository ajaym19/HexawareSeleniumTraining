package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsDemo {
	
	/*
	 * Waits:
	 * we need to make sure that the executio speed of selenium matches with the application
	 * 
	 * 2 types:
	 * 1. Implicit Wait: define once, applicable for all the elements on the page
	 * 2. Explicit Wait: is specifically for a specific element, 
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.amazon.in/");
//		System.out.println(driver.findElement(By.xpath("//li[@class='nav_first'][1]/aqwqw")).getAttribute("href"));
//		
		
		driver.get("http://www.seleniumframework.com/practiceform/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		Thread.sleep(4000);
		
		driver.findElement(By.id("timingAlert")).click();
		//over here I need to wait, till the alert is present
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//Thread.sleep(6000);
		wait.until(ExpectedConditions.alertIsPresent()).accept();
		//driver.switchTo().alert().accept();
		
		driver.quit();
		
		
	}
}

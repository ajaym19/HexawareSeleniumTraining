package ActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in/");
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// lines of code

		// scroll by few pixels
		// js.executeScript("window.scrollBy(0,1000)");

		/*
		 * First Parameter: X-Axis it moves to the left if number is positive it moves
		 * to the right if number is negative
		 * 
		 * Second Parameter: Y-Axis it moves down if number is positive it moves up if
		 * number is negative
		 */

		Thread.sleep(5000);

		// Scrolling to the bottom of the page
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		WebElement link = driver.findElement(By.xpath("//div[text()='New customer? ']/a"));

		//scrolling to a specific element
		js.executeScript("arguments[0].scrollIntoView()", link);
		
		driver.quit();
	}
}

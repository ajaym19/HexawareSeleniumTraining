package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsDemo {

	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.findElement(By.xpath("//li[@class='nav_first'][1]/a")).getAttribute("href"));
		List<WebElement> urls = driver.findElements(By.xpath("//li[@class='nav_first'][1]/awrong"));
		System.out.println(urls.size());
		System.out.println("Using Find Elements");
		for (WebElement webElement : urls) {
			System.out.println(webElement.getAttribute("href"));
		}
		driver.quit();
	}
}

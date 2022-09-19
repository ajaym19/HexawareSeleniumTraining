package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class SeleniumFunctions {

	/*
	 * Selenium Functions:
	 * get(); --> to launch the given URL
	 * Locators: 
	 * Select
	 * handlingiframes
	 * close and quit
	 * 
	 * getCurrentURL()
	 * findElement and findElements
	 * 
	 */
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		
		
		//Driver get Methods
		String curl = driver.getCurrentUrl();
		System.out.println(curl);
		System.out.println(driver.getPageSource());
		System.out.println(driver.getClass());
		
		String expTitle = "Test Page For JavaScript Alerts";
		String actTitle = driver.getTitle();
		if (expTitle.equals(actTitle)) {
			System.out.println("TC passed");
		}else {
			System.out.println("TC Failed");
		}
		
		
		//get methods on the elements
		System.out.println(driver.findElement(By.id("alertexamples")).getText());
		
		driver.navigate().to("https://www.amazon.in/");
		WebElement temp = driver.findElement(By.xpath("//li[@class='nav_first'][1]"));
		System.out.println(temp.getText());
		System.out.println(temp.getTagName());
		WebElement temp1 = driver.findElement(By.xpath("//li[@class='nav_first'][1]/a"));
		
		
		System.out.println(temp1.getAttribute("href"));
		
		
		//GetWindowHandle and get window handles
		
		//isDisplayed()
		//isEnabled()
		//isselected()
		
		System.out.println(temp1.isDisplayed());
		
		
		
		driver.quit();
		
		
		//Waits Concept - Synchronization
		
		
	}
}

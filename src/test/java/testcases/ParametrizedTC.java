package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametrizedTC {

	
	@Test(groups = "parameters")
	@Parameters({ "username", "password", "browser" })
	public void loginTest(String username, String password, String browser) {
		/*
		 * read the browser value from xml file and based on that open the browser
		 * value = chrome, open Chrome Browser
		 * value = ie, open Internet Explorer
		 * value = firefox, Open Firefox
		 */
		WebDriver driver = null;
		
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if (browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		driver.quit();
		
		//Data Driver using APache POI and its implementation
		//9022870254

	}
}

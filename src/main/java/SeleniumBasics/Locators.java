package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	/*
	 * Locators are the mechanism by which we locate or find the element on the web page
	 * Locators available in Selenium
	 * 
	 * For Elements ID - 1 Name - 2 CSS : #HTMLFormElements > table > tbody >
	 * tr:nth-child(1) > td > input[type=text] - 3 XPATH (Absolute and Relative) - 3
	 * //*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/
	 * input
	 * /html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/
	 * input
	 * 
	 * TAG: can be used if we want to get all the elements of a specific type or tag
	 * class: we can not reply on class
	 * 
	 * For Links linkText - exact match partialLinkText - works on partial match
	 * 
	 * by.Linktext(Abo) by.partiallinktext(Abo)
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		//driver.findElement(By.cssSelector("#email")).sendKeys("TestEmail@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		Thread.sleep(3000);
		driver.close();
		
		
		
	}
}

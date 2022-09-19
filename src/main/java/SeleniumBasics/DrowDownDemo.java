package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrowDownDemo {

	/*
	 * Select class is used to handle dropdown
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement dropdown = driver.findElement(By.xpath("//select"));

		Select obj = new Select(dropdown);
		/*
		 * Selection can be done using 3 ways 1. Index 2. By Value 3. By Visible Text
		 * 
		 */
		// obj.selectByIndex(5);
		// obj.selectByValue("AGO");
		obj.selectByVisibleText("Australia");
		Thread.sleep(2000);

		// get all the options of the drop down and print the size and the name

		// findElement >> will find one single matching element, return type is
		// WebElement
		// findElements >> will return all the matching elements, return type is
		// List<WebElement>

		// List<WebElement> options = driver.findElements(By.tagName("option"));
		List<WebElement> options = dropdown.findElements(By.tagName("option"));

		System.out.println("Total Country Options are " + options.size());
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		Thread.sleep(3000);
		
		//driver.navigate().to("https://output.jsbin.com/osebed/2");
		driver.get("https://output.jsbin.com/osebed/2");
		
		WebElement multiDropDown =  driver.findElement(By.id("fruits"));
		Select obj1 = new Select(multiDropDown);
		obj1.selectByValue("banana");
		obj1.selectByValue("orange");
		
		Thread.sleep(3000);
		driver.close();
		
		/*
		 * Print the Size
		 * Print the name of all the countries
		 * 
		 * print the name of only 10 countries
		 */
	}
}

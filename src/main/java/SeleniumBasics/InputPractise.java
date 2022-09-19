package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputPractise {

	// user CTRL+SPACE for help

	public static void main(String[] args) {
		// Configuring Browser
		WebDriverManager.chromedriver().setup();

		// Open browser
		WebDriver driver = new ChromeDriver();

		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
		driver.findElement(By.name("username")).sendKeys("elizabeth");
		driver.findElement(By.name("password")).sendKeys("pass");
		driver.findElement(By.name("comments")).sendKeys("Selenium input practice.");
		driver.findElement(By.xpath("//input[@value = 'cb2']")).click();
		driver.findElement(By.xpath("//input[@value = 'rd3']")).click();
		driver.findElement(By.name("submitbutton")).click();
		/*
		 * Open the application
		 * https://testpages.herokuapp.com/styled/basic-html-form-test.html
		 * 
		 * Enter the details Enter username Enter password Enter comments Skip Choose
		 * File Menu Select 2 Checkbox Select 1 radio items Skip Multiple Select Values
		 * Skip the drop down click on Submit
		 * 
		 */
	}
}

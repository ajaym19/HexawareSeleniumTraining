package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingApplication {

	public static void main(String[] args) {
		/*
		 * FB Login Manually 1. Open the browser 2. Launch the Application 3. Enter the
		 * username 4. Enter the password 5. Click on the Login Button 6. Close the
		 * browser
		 */

		// Step0: Configuring the browser
		WebDriverManager.chromedriver().setup();

		// Step1: Open the browser
		WebDriver driver = new ChromeDriver();

		// Step2: Launch the Application
		driver.get("https://www.facebook.com/");

		// 3. Enter the username
		WebElement username = driver.findElement(By.id("email")); //will identify the element on the page
		username.sendKeys("testadmin@gmail.com"); //will send the text on that element
		
		// 4. Enter the password
		driver.findElement(By.id("pass")).sendKeys("passwordtest");
		
		//5 Click on Login Button
		driver.findElement(By.name("login")).click();
		
		//6 Close the browser
		driver.close();
		

	}
}

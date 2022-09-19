package SeleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	/*
	 * getWindowHandle() --> this will return the handle of the current window
	 * getWindowHandles() --> this will return the handles of all the windows opened
	 * by selenium
	 */

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		// At this point there is only window present
//		String mainWindow = driver.getWindowHandle();
//		System.out.println("Parent Window " + mainWindow);

		System.out.println("Main Window " + driver.getTitle());
		driver.findElement(By.id("button1")).click();
		// At this point there are 2 windows present
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();

		System.out.println("Parent Window " + parentWindow);
		System.out.println("Child Window " + childWindow);

		driver.switchTo().window(childWindow);
		System.out.println("Child Window " + driver.getTitle());

		// Print the title of the parent window
		driver.switchTo().window(parentWindow);
		System.out.println("Parent Window " + driver.getTitle());

		driver.close(); // this will close only the current window pointed by driver
		driver.quit();
	}
}

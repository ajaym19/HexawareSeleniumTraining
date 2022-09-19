package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://output.jsbin.com/osebed/2");
		
		WebElement multiDropDown =  driver.findElement(By.id("fruits"));
		Select obj1 = new Select(multiDropDown);
		obj1.selectByValue("banana");
		obj1.selectByValue("orange");
		
		Thread.sleep(3000);
		driver.close();
	}
}

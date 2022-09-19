package ActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsLearning {

	public static void main(String[] args) throws InterruptedException {
		//hover();
		//keyboardEvents();
		dragAndDrop();
	}
	
	public static void hover() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement loginButton = driver.findElement(By.xpath("//a[text()='Kids'][1]"));
		Actions act = new Actions(driver);
		act.moveToElement(loginButton).build().perform();		
		Thread.sleep(8000);
		driver.quit();
	}
	
	
	public static void keyboardEvents() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		Actions act = new Actions(driver);
		act.click(username).keyDown(Keys.SHIFT).sendKeys("admin").keyUp(Keys.SHIFT).build().perform();
		
		Thread.sleep(6000);
		driver.quit();
	}
	
	public static void dragAndDrop() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
		
		Thread.sleep(6000);
		driver.quit();
	}
}

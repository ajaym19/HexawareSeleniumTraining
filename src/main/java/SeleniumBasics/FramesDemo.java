package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tinymce");
		//First switching to the frame
		WebElement frame = driver.findElement(By.id("mce_0_ifr"));
		driver.switchTo().frame(frame);
		
		
		//Below element is present inside the frame
		driver.findElement(By.id("tinymce")).clear();
		driver.findElement(By.id("tinymce")).sendKeys("Ajay Mishra");
		Thread.sleep(4000);
		
		//Once the job inside the frame is completed, I will switch back to the parent or main frame
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		driver.close();
	}
}

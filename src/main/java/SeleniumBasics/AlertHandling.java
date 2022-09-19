package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.findElement(By.id("alertexamples")).click();
		Thread.sleep(3000);
		
		//how to validate the text displayed
		String actualAlertMessage = driver.switchTo().alert().getText();
		String expAlertMessage = "I am an alert box! Please click Me";
		if (actualAlertMessage.equals(expAlertMessage)) {
			System.out.println("Alert Message is correct, TC passed!!!");
		}else {
			System.out.println("Alert Message is incorrect, TC failed!!!");
		}
		
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		
		
		
		driver.findElement(By.id("confirmexample")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.id("promptexample")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Ajay");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
	
		
		
		driver.close();
	}
}

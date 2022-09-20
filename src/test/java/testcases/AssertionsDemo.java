package testcases;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionsDemo {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void validateTitle() {
		String expTitle = "Facebook – log in or sign up India";
		String actTitle = driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Test
	public void validateCreateNewAccountButtonPresent() {
		boolean isPresent = false;
		try {
			isPresent = driver.findElement(By.linkText("Create New Account1")).isDisplayed();
			Assert.assertTrue(isPresent);
		} catch (NoSuchElementException e) {
			Assert.assertTrue(isPresent);
		}
		
		Assert.assertTrue(isPresent);
	}
	
	@AfterMethod
	public void closeSetup() {
		driver.quit();
	}
}

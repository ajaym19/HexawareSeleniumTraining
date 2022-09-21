package testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util.ExcelReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGDataProvider {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test(dataProvider = "LoginDataFromExcel")
	public void validateLoginTest(String username, String password) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
	}

	@DataProvider(name = "LoginData")
	public Object[][] getLoginData() {
		// first parameter indicates, how many times we want to execute the test cases
		// or the number of iterations
		// second parameter indicates, how many values we want to send for each
		// execution/iteration
		// first parameter = row, second parameter = column
		Object[][] data = new Object[3][2];

		// values for the Zeroth row
		data[0][0] = "admin";
		data[0][1] = "admin123";

		// values for 1st row
		data[1][0] = "user";
		data[1][1] = "user123";

		// values for 2nd row
		data[2][0] = "hr";
		data[2][1] = "hr123";

		return data;
	}
	
	@DataProvider(name = "LoginDataFromExcel")
	public Object[][] getDataFromExcel() throws IOException {
		String filePath = "./src/main/java/Util/TestData.xlsx";
		ExcelReader reader = new ExcelReader(filePath,"logindata");
		Object[][] data = reader.getData();
		return data;
	}

}

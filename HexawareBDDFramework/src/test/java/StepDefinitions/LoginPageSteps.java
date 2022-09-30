package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageSteps {
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}

	@When("user enters username as {string}")
	public void user_enters_username_as(String username) {
		System.out.println("Username is " + username);
	}

	@When("user enters password as {string}")

	public void user_enters_password_as(String password) {
		System.out.println("Password is " + password);
	}

	@When("user enters username")
	public void user_enters_username() {
		// driver.fe.su
	}

	@When("user enters password")
	public void user_enters_password() {
		// d.fe.sp
	}
	
	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(3000);
		
		
	}

	@When("user clicks on Login Button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		driver.quit();
	}

}

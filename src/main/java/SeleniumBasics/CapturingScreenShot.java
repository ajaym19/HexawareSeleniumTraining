package SeleniumBasics;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CapturingScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String formattedDate = formatter.format(new Date());
		formattedDate = formattedDate.replaceAll("/", "_").replaceAll(":", "_") + ".png";
		TakesScreenshot scr = (TakesScreenshot) driver;
		File srcFile = scr.getScreenshotAs(OutputType.FILE);
		// testdatetime.png
		FileUtils.copyFile(srcFile, new File("./Screenshots/test" + formattedDate));
		driver.quit();
	}
}

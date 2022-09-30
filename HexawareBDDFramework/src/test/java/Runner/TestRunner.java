package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "./src/test/java/Features/",
		glue = "StepDefinitions",
		dryRun = false,
		plugin = {"pretty","html:Reports/cucumber-index.html"},
		monochrome = true)


public class TestRunner extends AbstractTestNGCucumberTests {

}

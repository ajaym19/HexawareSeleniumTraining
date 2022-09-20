package testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasicAnnotations {
	
	/*
	 * suite - after and before >> xml file
	 * test - after and before >> xml file
	 * class - after and before (will be executed before and after the class)
	 * methods - after and before (will be executed before and after every TC
	 * 
	 */
	
	@BeforeClass
	public void createDBConnection() {
		System.out.println("Creating DB Connection");
	}
	
	@BeforeMethod
	public void setUp() {
		System.out.println("Launching the browser");
		System.out.println("Launching Application");
	}

	@Test(priority = 1, groups = "smoke")
	public void loginTest() {
		System.out.println("Login Test P1");
		
	}
	
	@Test(priority = 2, groups = "regression")
	public void zebraTC() {		
		System.out.println("Zebra TC P2");
	}
	
	@Test(priority = 4, groups = "regression")
	public void abcTC() {
		System.out.println("ABC TC P4");		
	}

	@Test(priority = 3, groups = "smoke")
	public void validateTitleTC() {	
		System.out.println("Validating Title TC P3");	
	}
	
	@AfterMethod
	public void closeSetUp() {
		System.out.println("Close the application");
	}
	
	@Test(groups = "regression")
	public void ValidateLogo() {
		System.out.println("Validating Logo NP ");
	}
	
	@Test
	public void AppleTest() {
		System.out.println("Apple Test");
	}
	
	@AfterClass
	public void closeDBConnection() {
		System.out.println("Closing DB Connection");
	}
	
}

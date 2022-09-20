package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnDemo {

	@Test
	public void loginTC() {
		System.out.println("Validaing Login TC");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = "loginTC")
	public void validateCreateUserTC() {
		System.out.println("Creating User TC");
	}
	
	@Test(dependsOnMethods = "loginTC")
	public void validateEditUserTC() {
		System.out.println("Updating User TC");
	}
	
	@Test(dependsOnMethods = "loginTC")
	public void validateDeleteUserTC() {
		System.out.println("Deleting User TC");
	}
	
	@Test
	public void validateLogo() {
		System.out.println("Validating Logo");
	}
	
}

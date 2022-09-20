package testcases;

import org.testng.annotations.Test;

public class InvocationDemo {

	@Test(invocationCount = 3)
	public void loginTC() {
		System.out.println("Login TC");
	}
}

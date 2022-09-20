package webTC;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebLogin {

	@BeforeTest
	public void webLoginBeforeSuite() {
		System.out.println("WebLoginBefore Suite Method");
	}
	
	@Test(groups = "smoke")
	public void webm1() {
		System.out.println("Web M1 Method");
	}
	

	@Test
	public void webm2() {
		System.out.println("Web M2 Method");
	}


	@Test
	public void webm3() {
		System.out.println("Web M3 Method");
	}

	
}

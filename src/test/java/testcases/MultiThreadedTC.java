package testcases;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

import org.testng.annotations.Test;

public class MultiThreadedTC {

	@Test(groups = "thread")
	public void TC1() throws InterruptedException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:sss");
		String formattedDate = formatter.format(new Date());
		System.out.println("TC1 " + formattedDate);
		System.out.println(Thread.currentThread().getId());
	}

	@Test(groups = "thread")
	public void TC2() throws InterruptedException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:sss");
		String formattedDate = formatter.format(new Date());
		System.out.println("TC2 " + formattedDate);
		System.out.println(Thread.currentThread().getId());
		
	}

	@Test(groups = "thread")
	public void TC3() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:sss");
		String formattedDate = formatter.format(new Date());
		System.out.println("TC3 " + formattedDate);
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test(groups = "thread")
	public void TC4() throws InterruptedException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss:sss");
		String formattedDate = formatter.format(new Date());
		System.out.println("TC4 " + formattedDate);
		System.out.println(Thread.currentThread().getId());

	}
}

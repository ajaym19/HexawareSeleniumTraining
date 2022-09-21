package testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util.ExcelReader;

public class AddUsers {

	@Test(dataProvider = "getUsersData")
	public void addUsers() {
		//print the data read
	}
	
	@DataProvider
	public void getUsersData() throws IOException {
		String filePath = "./src/main/java/Util/TestData.xlsx";
		ExcelReader reader = new ExcelReader(filePath, "userdata");
		reader.getData();
				
	}
}

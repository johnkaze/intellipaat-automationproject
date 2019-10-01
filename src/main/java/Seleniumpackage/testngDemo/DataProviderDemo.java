package Seleniumpackage.testngDemo;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@DataProvider(name = "LoginData")
	public Object[][] testData() {
		return new Object[][] {

				{"demo1","demo1"},
				{"demo2","demo2"},
				{"demo3","demo3"},
				{"demo4","demo4"}

		};
	}

	//This method is bound to the above data provider
	//The test case will run 4 times with different set of values
	@Test(dataProvider = "LoginData")
	public void LoginTest(String str1, String str2) {

		Reporter.log(str1 + " " + str2, true);

	}


}



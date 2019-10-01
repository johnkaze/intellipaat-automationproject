package Seleniumpackage.testngDemo;

import org.testng.Reporter;
import org.testng.annotations.*;


public class TestNGDemoOne {

    /*@Test
	public void m1() {
		Reporter.log("I am @Test annotated method m1", true);
	}

	@Test
	public void m2() {
		Reporter.log("I am @Test annotated method m2", true);
	}*/

	@BeforeMethod
	public void m3() {
		Reporter.log("I am @BeforeMethod annotated method", true);
	}

	@AfterMethod
	public void m4() {
		Reporter.log("I am @AfterMethod annotated method", true);
	}

	@BeforeClass
	void m5() {
		Reporter.log("I am @BeforeClass annotated method", true);
	}

	@AfterClass
	void m6() {
		Reporter.log("I am @AfterClass annotated method", true);
	}
	
	@BeforeTest
	void beforeTest() {
		Reporter.log("I am @BeforeTest annotated method", true);
	}
	
	@AfterTest
	void afterTest() {
		Reporter.log("I am @AfterTest annotated method", true);
	}

	@BeforeSuite
	void beforeSuite() {
		Reporter.log("I am @BeforeSuite annotated method", true);
	}

	@AfterSuite
	void afterSuite() {
		Reporter.log("I am @AfterSuite annotated method", true);
	}

	public void m7(){
    	Reporter.log("I am method 7", true);
	}


}

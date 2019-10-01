package Seleniumpackage.testngDemo;

import org.testng.annotations.*;

public class TestNGDemoTwo extends TestNGDemoOne {
	
	@Test(description = "This is test method one")
	public void testMethodOne(){
		System.out.println("I am @Test annotated testMethodOne in TestNGDemoTwo");
	}


	@Test(description = "This is test method two")
	public void testMethodTwo(){
		System.out.println("I am @Test annotated testMethodTwo in TestNGDemoTwo");
	}
	
	public void testMethodThree(){
		System.out.println("I am @Test annotated testMethodTwo in TestNGDemoTwo");
	}

}

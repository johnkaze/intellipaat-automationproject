package Seleniumpackage.testngDemo;

import Javapackage.divyapackage.AcessModifiers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewToursDemoPage {
	
	public WebDriver driver;
	

	//@Test //(dataProvider = "LoginData", dataProviderClass= DataProviderDemo.class)
	@Test(description="Login to newtourse demo site")
	@Parameters({"uName", "psswd"})
	public  void loginToNewTours1(String uName, String psswd) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("http://newtours.demoaut.com/");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name=\"userName\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(psswd);
		driver.findElement(By.xpath("//input[@name=\"login\"]")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[text()='SIGN-OFF']")).click();
		
		Thread.sleep(5000);
		
		driver.close();
	}

	//@Test //(dataProvider = "LoginData", dataProviderClass= DataProviderDemo.class)
	@Test(description="Login to newtourse demo site")
	@Parameters({"uName", "psswd"})
	public  void loginToNewTours2(String uName, String psswd) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@name=\"userName\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(psswd);
		driver.findElement(By.xpath("//input[@name=\"login\"]")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[text()='SIGN-OFF']")).click();

		Thread.sleep(5000);

		driver.close();

		//Assert.fail("Intentionally failing");

		AcessModifiers obj = new AcessModifiers();

		System.out.println(obj.rno);
		System.out.println(AcessModifiers.country);
	}

}

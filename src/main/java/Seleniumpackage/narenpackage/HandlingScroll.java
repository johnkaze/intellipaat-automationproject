package Seleniumpackage.narenpackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingScroll {

	WebDriver driver;

	void launchChromeBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;

		jse.executeScript("scrollBy(0, 100)"); // scroll down (x, y)

		Thread.sleep(10000);

		jse.executeScript("scrollBy(0, -100)"); // scroll Up

		Thread.sleep(10000);

		driver.close();
	}

	public static void main(String[] args)  throws InterruptedException {
		HandlingScroll obj = new HandlingScroll();
		obj.launchChromeBrowser();
	}

}

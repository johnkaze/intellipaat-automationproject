package Seleniumpackage.narenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.List;

public class LoactingWebElements {

	WebDriver driver;


	void getBrowser(String browser) throws InterruptedException {

		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver(); // to launch browser	
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\IEDriverServer_32bit.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/"); 

		WebElement userName = driver.findElement(By.tagName("a"));

		List<WebElement> elements = driver.findElements(By.tagName("a"));
		
		System.out.println(elements.size());

		driver.close();

	}

	public static void main(String[] args)  throws InterruptedException {
		LoactingWebElements obj = new LoactingWebElements();
		obj.getBrowser("chrome");
	}














}

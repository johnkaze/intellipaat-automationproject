package Seleniumpackage.divyapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHover {

	WebDriver driver;

	String url = "http://demo.guru99.com/test/drag_drop.html";

	void getBrowser(String browser) throws InterruptedException {

		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver(); // to launch browser	
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\IEDriverServer_64.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}

		driver.manage().window().maximize(); 
		driver.get(url);
		Thread.sleep(3000);
		
		WebElement amt5000 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement sales = driver.findElement(By.xpath("//a[text()=' SALES ']"));

		Actions actions = new Actions(driver);

		// Move to element ()
		actions.moveToElement(amt5000).build().perform();
		Thread.sleep(5000);
		actions.moveToElement(sales).build().perform();

		Thread.sleep(10000);
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		HandlingMouseHover obj = new HandlingMouseHover();
		obj.getBrowser("chrome");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package Seleniumpackage.narenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragAndDrop {

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
		Thread.sleep(5000);

		WebElement amt5000 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement amountDeposit = driver.findElement(By.xpath("//ol[@id='amt7']/li"));

		WebElement sales = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement creditSideAccount = driver.findElement(By.xpath("//ol[@id='loan']"));

		Actions actions = new Actions(driver);

		actions.clickAndHold(amt5000).moveToElement(amountDeposit).release(amountDeposit).build().perform();

		Thread.sleep(5000);

		actions.dragAndDrop(sales, creditSideAccount).build().perform();


		Thread.sleep(10000);
		driver.close();
		
	}

	public static void main(String[] args) throws InterruptedException {
		HandlingDragAndDrop obj = new HandlingDragAndDrop();
		obj.getBrowser("chrome");
	}

}

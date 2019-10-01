package Seleniumpackage.narenpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDoubleClick {

	WebDriver driver;

	String url = "https://artoftesting.com/sampleSiteForSelenium.html";

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
		
		WebElement dblClkBtn = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));

		Actions actions = new Actions(driver);
		
		actions.doubleClick(dblClkBtn).build().perform(); // To do double click

		Thread.sleep(5000);

		Alert alert = driver.switchTo().alert();

		alert.accept();

		Thread.sleep(10000);

		driver.close();

		
	}

	public static void main(String[] args) throws InterruptedException {
		HandlingDoubleClick obj = new HandlingDoubleClick();
		obj.getBrowser("chrome");
	}

}

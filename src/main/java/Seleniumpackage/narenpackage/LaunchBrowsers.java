package Seleniumpackage.narenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowsers {
	
	WebDriver driver;
	
	void launchChromeBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver(); // To launch chrome browser
		driver.manage().window().maximize(); // To maximize browse
		Thread.sleep(5000);
		driver.close();
	}
	
	void launchFirefoxBrowser() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver(); // To launch firefox browser
		driver.manage().window().maximize(); // To maximize browse
		Thread.sleep(5000);
		driver.close();
	}
	
	void launchIEBrowser() throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver(); // To launch ie browser
		driver.manage().window().maximize(); // To maximize browse
		Thread.sleep(5000);
		driver.close();
	}
	
	void launchBrowser(String browser) throws InterruptedException {

		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver(); // to launch browser	
		} else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}

		driver.manage().window().maximize();

		// To launch application
		
		driver.get("https://www.facebook.com/");
		//driver.navigate().to("http://newtours.demoaut.com/");

		Thread.sleep(5000);

		// WebDriver browser commands

		System.out.println("Title is :: "+driver.getTitle());

		System.out.println("Current url is :: "+driver.getCurrentUrl());

		System.out.println("Page source is :: "+driver.getPageSource());

		driver.findElement(By.xpath("//a[text()='REGISTER']")).click();


		// WebDriver browser navigation commands

		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();

	}
	
	public static void main(String[] args)  throws InterruptedException {
		LaunchBrowsers obj = new LaunchBrowsers();
		
		//obj.launchChromeBrowser();
		/*Thread.sleep(5000);
		obj.launchFirefoxBrowser();
		Thread.sleep(5000);
		obj.launchIEBrowser();*/
		
		obj.launchBrowser("chrome");
	}
	
}

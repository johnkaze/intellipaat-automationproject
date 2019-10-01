package Seleniumpackage.divyapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.List;

public class LocatingElements {
	
	WebDriver driver;
	
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

		Thread.sleep(5000);

		/*WebElement userId = driver.findElement(By.id("eil"));
		System.out.println(userId.getAttribute("type"));*/


		List<WebElement> list = driver.findElements(By.name("email"));
		System.out.println(list.size());
		System.out.println(list.isEmpty());

		for(WebElement ele : list) {
			System.out.println(ele.getAttribute("type"));
		}



		/*driver.findElement(By.name("email"));
		driver.findElement(By.className("email"));
		driver.findElement(By.xpath("email"));
		driver.findElement(By.tagName("email"));
		driver.findElement(By.linkText("email"));
		driver.findElement(By.partialLinkText("email"));
		driver.findElement(By.cssSelector("email"));*/

		driver.close();

	}
	
	public static void main(String[] args)  throws InterruptedException {
		LocatingElements obj = new LocatingElements();
		
		//obj.launchChromeBrowser();
		/*Thread.sleep(5000);
		obj.launchFirefoxBrowser();
		Thread.sleep(5000);
		obj.launchIEBrowser();*/
		
		obj.launchBrowser("chrome");
	}
	
}

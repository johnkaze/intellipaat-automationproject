package Seleniumpackage.narenpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumWaits {

	WebDriver driver;

	/*void visibilityOfElementLocated(long time, String xpath) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(xpath))));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void elementToBeClickable(long time, String xpath) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, time); // 500 ms
			wait.until(ExpectedConditions.elementToBeClickable((By.xpath(xpath))));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/*void fluentWait(String xpath) {
		try {
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(30, TimeUnit.SECONDS)
					.pollingEvery(5,  TimeUnit.SECONDS)
					.ignoring(NoSuchElementException.class)
					.ignoring(TimeoutException.class);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}*/


	void getBrowser(String browser) {

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

		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/"); 

		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		//visibilityOfElementLocated(30, "//input[@name='email']");
		//fluentWait("//input[@name='em']");
		//WebElement userName = driver.findElement(By.xpath("//input[@name='ema']"));

		//WebElement userName1 = driver.findElement(By.xpath("//input[@name='ema']"));

		driver.close();


	}

	public static void main(String[] args) {
		SeleniumWaits obj = new SeleniumWaits();
		obj.getBrowser("chrome");
	}

}

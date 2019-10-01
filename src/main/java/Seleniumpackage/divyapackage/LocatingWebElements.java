package Seleniumpackage.divyapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.List;

public class LocatingWebElements {
	
	WebDriver driver;
	
	void sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

	void getBrowserInstance(String browser) {

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

        sleep(5000);

		WebElement userId = driver.findElement(By.id("email"));

		/*driver.findElement(By.name("email"));

		driver.findElement(By.className("inputtext"));

		driver.findElement(By.xpath("//input[@id='email']"));

		driver.findElement(By.cssSelector("#email"));

		//driver.findElement(By.linkText("email"));

		//driver.findElement(By.partialLinkText("email"));*/


		userId.sendKeys("userId");

		WebElement password = driver.findElement(By.id("pass"));

		password.sendKeys("password");


		List<WebElement> list = driver.findElements(By.className("inputtext"));

		System.out.println("Number of elements :: "+list.size());

		sleep(5000);


        driver.close();


	}
	
	public static void main(String[] args) {

		LocatingWebElements obj = new LocatingWebElements();
		obj.getBrowserInstance("chrome");


	}


}

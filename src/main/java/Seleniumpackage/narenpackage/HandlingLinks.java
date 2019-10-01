package Seleniumpackage.narenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class HandlingLinks {

	WebDriver driver;
	void launchChromeBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);

		WebElement link1 = driver.findElement(By.xpath("//a[text()='Forgotten account?']"));

		System.out.println(link1.getText());

		System.out.println(link1.getTagName());  // a

		List<WebElement> list = driver.findElements(By.tagName("a"));

		System.out.println("Num of links :: "+list.size());

		for (WebElement ele : list) {
			System.out.println("Link text is ::"+ele.getText()+" and href is :: "+ele.getAttribute("href"));

		}

		link1.click();

		Thread.sleep(10000);

		driver.close();
	}

	public static void main(String[] args)  throws InterruptedException {
		HandlingLinks obj = new HandlingLinks();
		obj.launchChromeBrowser();
	}

	

}

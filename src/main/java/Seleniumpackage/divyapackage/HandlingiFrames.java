package Seleniumpackage.divyapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingiFrames {

	WebDriver driver;

	void launchChromeBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/guru99home/");

		Thread.sleep(5000);

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scrollBy(0, 3000)");

		WebElement frame = driver.findElement(By.name("a077aa5e1"));

		driver.switchTo().frame(frame);

		String srcText = driver.findElement(By.xpath("/html/body/a/img")).getAttribute("src");

		System.out.println(srcText);

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//button[@class=\"btn\"]")).click();

		driver.switchTo().alert().accept();

		Thread.sleep(3000);

		driver.close();

	}

	public static void main(String[] args)  throws InterruptedException {
		HandlingiFrames obj = new HandlingiFrames();
		obj.launchChromeBrowser();
	}



}

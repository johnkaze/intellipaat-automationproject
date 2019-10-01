package Seleniumpackage.narenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingCheckBoxesAndRadioButtons {

    WebDriver driver;

    void launchChromeBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://artoftesting.com/sampleSiteForSelenium.html");

        Thread.sleep(3000);

        // Closing subscription alert
        driver.findElement(By.xpath("//div[@class='addthis_bar_x icon-arrow-up']")).click();

        // Scroll down
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scrollBy(0, 200)");

        // Radio button handling

        WebElement male = driver.findElement(By.xpath("//input[@id='male']"));
        WebElement female = driver.findElement(By.xpath("//input[@id='female']"));

        //male.click();

        Thread.sleep(5000);

        if (male.isSelected()) {
            female.click();
        } else {
            male.click();
        }

        Thread.sleep(5000);

        // Checkboxes handling

		WebElement auto = driver.findElement(By.xpath("//input[@class='Automation']"));
        WebElement per = driver.findElement(By.xpath("//input[@class='Performance']"));

        //auto.click();
		Thread.sleep(5000);

		if(auto.isSelected()) {
            per.click();
		} else {
			auto.click();
            per.click();
		}

        Thread.sleep(10000);
        driver.close();
    }


    public static void main(String[] args) throws InterruptedException {
        HandlingCheckBoxesAndRadioButtons obj = new HandlingCheckBoxesAndRadioButtons();
        obj.launchChromeBrowser();
    }


}

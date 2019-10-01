package Seleniumpackage.divyapackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingAlert {

    WebDriver driver;

    public void launchChromeBrowser() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://artoftesting.com/sampleSiteForSelenium.html");

        Thread.sleep(5000);

        // Closing subscription alert
        driver.findElement(By.xpath("//div[@class='addthis_bar_x icon-arrow-up']")).click();

        // Scroll down
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scrollBy(0, 500)");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();

        Thread.sleep(5000);

        Alert alert = driver.switchTo().alert();

        Thread.sleep(5000);

        System.out.println(alert.getText()); // To capture text of alert and print on console

        Thread.sleep(5000);

        //alert.accept(); // To click OK Button

        alert.dismiss(); // To click on Cancel button

        //alert.sendKeys("Alert message");

        String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();

        if (text.equals("You pressed OK!")) {
            System.out.println("You pressed OK!");
        } else {
            System.out.println("You pressed Cancel!");
        }

        Thread.sleep(5000);

        driver.close();
    }


    public static void main(String[] args) throws InterruptedException {
        HandlingAlert obj = new HandlingAlert();
        obj.launchChromeBrowser();
    }


}

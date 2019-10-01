package Seleniumpackage.narenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class HandlingKeyBoard {

    WebDriver driver;

    String url = "https://www.facebook.com/";

    void getBrowser(String browser) throws InterruptedException, AWTException {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver",
                    "E:\\Softwares\\SeleniumSoftwares\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver(); // to launch browser
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver",
                    "E:\\Softwares\\SeleniumSoftwares\\Drivers\\IEDriverServer_64.exe");
            driver = new InternetExplorerDriver();
        } else {
            System.setProperty("webdriver.chrome.driver",
                    "E:\\Softwares\\SeleniumSoftwares\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        Thread.sleep(5000);

        WebElement userId = driver.findElement(By.xpath("//input[@id='email']"));
        userId.click();

        //userId.sendKeys("USERID");

        /*Actions actions = new Actions(driver);

        actions.sendKeys(userId, "chandra").build().perform(); // To enter text in lower

        actions.keyDown(Keys.SHIFT).sendKeys(userId,"chandra").keyUp(Keys.SHIFT).build().perform(); // To enter text in upper case
*/
        Robot robot = new Robot(); // import java.awt package, java.awt.AWTException

        robot.keyPress(KeyEvent.VK_SHIFT);

        robot.keyPress(KeyEvent.VK_U);
        robot.keyRelease(KeyEvent.VK_U);

        robot.keyPress(KeyEvent.VK_S);
        robot.keyRelease(KeyEvent.VK_S);

        robot.keyPress(KeyEvent.VK_E);
        robot.keyRelease(KeyEvent.VK_E);

        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);

        robot.keyPress(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_I);

        robot.keyPress(KeyEvent.VK_D);
        robot.keyRelease(KeyEvent.VK_D);

        robot.keyRelease(KeyEvent.VK_SHIFT);


    }

    public static void main(String[] args) throws InterruptedException, AWTException {
        HandlingKeyBoard obj = new HandlingKeyBoard();
        obj.getBrowser("chrome");
    }

}

package Seleniumpackage.divyapackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WaitsInSelenium {

    WebDriver driver;

    void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void implicitWait(long time, TimeUnit timeUnit) {
        driver.manage().timeouts().implicitlyWait(time, timeUnit);
    }

    void explicitWait(int time, String locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, time); // 500 milliseconds
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(locator)));
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void fluentWait(int withtime, int pollingtime, TimeUnit timeUnit, String xpath) {

        try {
            FluentWait<WebDriver> wait = new FluentWait<>(driver)

                    .withTimeout(withtime, timeUnit)

                    .pollingEvery(pollingtime, timeUnit)

                    .ignoring(NoSuchElementException.class)

                    .ignoring(TimeoutException.class);

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));

        } catch (TimeoutException e) {
            System.out.println(e.getMessage());
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    void launchBrowser(String browser) {

        if (browser.equals("chrome")) {
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

        //sleep(5000);
        //implicitWait(5, TimeUnit.SECONDS);
        //explicitWait(5, "email1"); // 500 millis, 500 ms, 500 ms
        fluentWait(30, 10,TimeUnit.SECONDS, "//input[@name='email']");

        WebElement uId = driver.findElement(By.name("email"));
        System.out.println(uId.getAttribute("type"));

        driver.close();

    }

    public static void main(String[] args) {
        WaitsInSelenium obj = new WaitsInSelenium();
        obj.launchBrowser("chrome");
    }

}

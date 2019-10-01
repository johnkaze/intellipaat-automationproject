package Seleniumpackage.divyapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.Set;

public class HandlingBrowserWindow {

    WebDriver driver;

    String childId = null;

    String url = "http://demo.guru99.com/popup.php";

    void getBrowser(String browser) throws InterruptedException {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver(); // to launch browser
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.get(url);

        Thread.sleep(5000);

        String parentId = driver.getWindowHandle();

        System.out.println("Parent window handle is :: " + parentId);

        Thread.sleep(5000);

        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		/*Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();*/

        Thread.sleep(5000);

        Set<String> handles = driver.getWindowHandles();

        handles.remove(parentId);

        /*Iterator<String> itr = handles.iterator();

		while(itr.hasNext()) {
			childId = itr.next();
		}*/

        childId = handles.iterator().next();
		
		/*for(String h : handles) {
			childId = h;
		}*/

        System.out.println("Child window handle is :: " + childId);

        driver.switchTo().window(childId);
        Thread.sleep(5000);

        String str1 = driver.findElement(By.xpath("//input[@name='btnLogin']")).getAttribute("value");

        System.out.println(str1);

        if (str1.equals("Submit")) {
            System.out.println("In child window");
        } else {
            System.out.println("In parent window");
        }
        Thread.sleep(5000);

        driver.switchTo().window(parentId);

        Thread.sleep(5000);

        String str = driver.findElement(By.xpath("//a[text()='Click Here']")).getText();

        if (str.equals("Click Here")) {
            System.out.println("In parent window");
        } else {
            System.out.println("In child window");
        }

        Thread.sleep(5000);

        //driver.close();
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {

        HandlingBrowserWindow obj = new HandlingBrowserWindow();
        obj.getBrowser("ie");

    }


}

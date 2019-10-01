package Seleniumpackage.narenpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebElementCommands {

    WebDriver driver;

    void launchBrowser(String browser) throws InterruptedException {

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

        Thread.sleep(5000);

        //WebElement uId = driver.findElement(By.id("email"));
        //WebElement pswd = driver.findElement(By.id("pass"));
        //WebElement login = driver.findElement(By.id("u_0_2"));

        WebElement creatText = driver.findElement(By.xpath("//span[text()='Create an account']"));
/*
		System.out.println("Create text is :: "+creatText.getText());

		System.out.println("Tag name is :: "+creatText.getTagName());

		uId.sendKeys("userId");

		System.out.println("User id text is :: "+uId.getAttribute("value"));

		System.out.println("Attribute is :: "+uId.getAttribute("data-testid"));

		pswd.sendKeys("password");*/

        /*System.out.println(creatText.getCssValue("font-family"));
        System.out.println(creatText.getCssValue("color"));
        System.out.println(creatText.getCssValue("font-size"));
        System.out.println(creatText.getCssValue("font-weight"));*/

        Dimension d = creatText.getSize();
        System.out.println("Height :: "+d.height);
        System.out.println("weight :: "+d.width);

        Point p = creatText.getLocation();
        System.out.println("X coordinate :: "+p.x);
        System.out.println("Y coordinate :: "+p.y);


        //login.submit();

		/*System.out.println(uId.isDisplayed());
		System.out.println(uId.isEnabled());

		uId.click();

		Thread.sleep(5000);

		uId.sendKeys("ExampleText");

		Thread.sleep(5000);

		uId.clear();*/


        Thread.sleep(10000);

        driver.close();

    }

    public static void main(String[] args) throws InterruptedException {
        WebElementCommands obj = new WebElementCommands();
        obj.launchBrowser("chrome");
    }

}

package Seleniumpackage.divyapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HandlingNaukriWindows {

    WebDriver driver;

    String childId = null;

    String url = "https://www.naukri.com/";

    void getBrowser(String browser) throws InterruptedException {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver(); // to launch browser
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\IEDriverServer_64.exe");
            driver = new InternetExplorerDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.get(url);

        Thread.sleep(3000);

        String parentId = driver.getWindowHandle();

        System.out.println("Parent window handle is :: " + parentId);

        Thread.sleep(3000);

        /*driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		*//*Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();*//*

        Thread.sleep(3000);

        Set<String> handles = driver.getWindowHandles();

        handles.remove(parentId);

        //Iterator<String> itr = handles.iterator();

		*//*while(itr.hasNext()) {
			child = itr.next();
		}*//*

        childId= handles.iterator().next();
		
		*//*for(String h : handles) {
			child = h;
		}*//*

        System.out.println("Child window handle is :: " + childId);

        driver.switchTo().window(childId);

        String str1 = driver.findElement(By.xpath("//input[@name='btnLogin']")).getAttribute("value");

        System.out.println(str1);

        if (str1.equals("Submit")) {
            System.out.println("In child window");
        } else {
            System.out.println("In parent window");
        }

        Assert.assertEquals(str1, "Submit", "In child window");

        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

        String str2 = driver.findElement(By.xpath("//label[@id='message9']")).getText();

        if (str2.equals("Email ID must not be blank")) {
            System.out.println("In child window");
        } else {
            System.out.println("In parent window");

        }

        Assert.assertEquals(str2, "Email ID must not be blank", "In child window");

        //driver.close();

		driver.switchTo().window(parentId);

		String str = driver.findElement(By.xpath("//a[text()='Click Here']")).getText();

		if(str.equals("Click Here")) { 
			System.out.println("In parent window"); 
		} else		{ 
			System.out.println("In child window"); 
		}

        Assert.assertEquals(str, "Click Here", "In parent window");
*/
		Thread.sleep(5000);

        //driver.close();
        driver.quit();
    }

    public static void main(String[] args) throws InterruptedException {

        HandlingNaukriWindows obj = new HandlingNaukriWindows();
        obj.getBrowser("chrome");

    }




}

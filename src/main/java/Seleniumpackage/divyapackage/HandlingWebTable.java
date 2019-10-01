package Seleniumpackage.divyapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.List;

public class HandlingWebTable {

    WebDriver driver;

    String url = "http://money.rediff.com/gainers/bsc/dailygroupa?";

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

        // To capture header names
        List<WebElement> headerList = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));

        for (int i = 1; i <= headerList.size(); i++) {
            String headrName = driver.findElement(By.xpath("//table[@class='dataTable']/thead/tr/th[" + i + "]")).getText();
            System.out.println("Header column name at column number " + i + "is :: " + headrName);
        }

        System.out.println();

        // To capture table data
        List<WebElement> rowsList = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));

        for (int row = 1; row <= rowsList.size(); row++) {
            List<WebElement> colList = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[" + row + "]/td"));

            for (int col = 1; col <= colList.size(); col++) {
                String colData = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + row + "]/td[" + col + "]")).getText();
                if (colData.equals("GTPL Hathway") && colData.equals("B")) {
                    driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + row + "]/td[" + 1 + "]")).click();
                    Thread.sleep(5000);
                    driver.navigate().back();
                }

                System.out.println("Data in row " + row + " and in col " + col + " is :: " + colData);
            }
            System.out.println();
        }

        driver.close();
    }

    public static void main(String[] args) throws InterruptedException {
        HandlingWebTable obj = new HandlingWebTable();
        obj.getBrowser("chrome");
    }

}

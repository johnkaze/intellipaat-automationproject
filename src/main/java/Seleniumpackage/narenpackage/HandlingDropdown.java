package Seleniumpackage.narenpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

    WebDriver driver;

    void launchChromeBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\SeleniumSoftwares\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://newtours.demoaut.com");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
        Thread.sleep(3000);

        WebElement country = driver.findElement(By.xpath("//select[@name='country']"));

        Select sel = new Select(country);

        sel.selectByIndex(10); // ARUBA

        Thread.sleep(5000);

        sel.deselectByIndex(10);

		/*Thread.sleep(30000);

		sel.selectByValue("39"); // CHRISTMAS ISLAND

		Thread.sleep(30000);

		sel.selectByVisibleText("INDIA"); // INDIA*/

        /*selectByIndex(country, 10);

        Thread.sleep(15000);

        selectByValue(country, "39");

        Thread.sleep(15000);

        selectByVisibleText(country, "INDIA");*/

        //System.out.println(sel.isMultiple()); // false

        //System.out.println(sel.getFirstSelectedOption().getText()); // 10

        /*List<WebElement> list = sel.getAllSelectedOptions();

        for (WebElement ele : list) {
            System.out.println(ele.getText());
        }*/

        /*List<WebElement> list = sel.getOptions();
        System.out.println(list.size());

        for (WebElement ele : list) {
            System.out.println(ele.getText());
        }*/


       // Thread.sleep(5000);

       // driver.close();
    }

    public static void main(String[] args) throws InterruptedException {
        HandlingDropdown obj = new HandlingDropdown();
        obj.launchChromeBrowser();
    }

    void selectByVisibleText(WebElement ele, String text) {
        Select select = new Select(ele);
        select.selectByVisibleText(text);
    }

    void selectByValue(WebElement ele, String value) {
        Select select = new Select(ele);
        select.selectByValue(value);
    }

    void selectByIndex(WebElement ele, int index) {
        Select select = new Select(ele);
        select.selectByIndex(index);
    }

}

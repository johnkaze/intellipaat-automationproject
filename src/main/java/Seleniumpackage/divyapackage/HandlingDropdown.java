package Seleniumpackage.divyapackage;

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

        //driver.get("http://newtours.demoaut.com");

        driver.get("https://www.facebook.com/");

        Thread.sleep(3000);
        //driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
        //Thread.sleep(3000);

        //WebElement country = driver.findElement(By.xpath("//select[@name='country']"));

        WebElement date = driver.findElement(By.xpath("//select[@id='day']"));
        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));

        Select sel = new Select(date);

        /*sel.selectByIndex(10); // ARUBA

        Thread.sleep(5000);

        sel.selectByVisibleText("INDIA");

        Thread.sleep(5000);

        sel.selectByValue("2"); // ALBANIA*/

        //sel.deselectByIndex(10);
        //sel.getFirstSelectedOption();

		/*Thread.sleep(30000);

		sel.selectByValue("39"); // CHRISTMAS ISLAND

		Thread.sleep(30000);

		sel.selectByVisibleText("INDIA"); // INDIA*/



        //System.out.println(sel.isMultiple()); // false

        //System.out.println(sel.getFirstSelectedOption().getText()); // ARUBA

        /*List<WebElement> list = sel.getAllSelectedOptions();
        System.out.println(list.size());
        for (WebElement ele : list) {
            System.out.println(ele.getText());
        }*/

       /* List<WebElement> list = sel.getOptions();
        System.out.println(list.size());

        for (WebElement ele : list) {
            System.out.println(ele.getText());
        }*/

        //System.out.println(sel.getWrappedElement().getText());

        /*selectByVisibleText(date, "10");

        Thread.sleep(15000);

        selectByVisibleText(month, "Mar");

        Thread.sleep(15000);

        selectByVisibleText(year, "1988");*/

        Thread.sleep(5000);

        driver.close();
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

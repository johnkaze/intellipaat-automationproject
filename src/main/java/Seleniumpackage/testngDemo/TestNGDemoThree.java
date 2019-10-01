package Seleniumpackage.testngDemo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;


public class TestNGDemoThree {

    @Test(priority=5, alwaysRun = true)
    public void Logout() {
        System.out.println("I am @Test annotated Logout in TestNGDemoThree");
    }

    //@Parameters({"uName", "psswd"})
    @Test(priority = 1, alwaysRun = true, dataProvider = "LoginData", dataProviderClass = DataProviderDemo.class)
    public void LoginParameterised(String userName, String password) {
        try {
            Reporter.log("User Name is :: "+userName+" and password is :: "+password, true);
            //Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("I am @Test annotated Login in TestNGDemoThree");
    }

    //@Test(priority = 1, alwaysRun = true, groups = "A")
    public void Login() {
        try {
            //Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("I am @Test annotated Login in TestNGDemoThree");
    }

    @Test(priority = 3, description = "drop mail method", groups = "A") // priority = 3, groups = "B"
    public void dropMail() {
        System.out.println("I am @Test annotated dropMail in TestNGDemoThree");
        //Assert.fail("Intentionally failing");
    }

    @Test(priority = 4, description = "Sent Items method", dependsOnMethods = "dropMail")
    // priority = 4, groups = "B" , dependsOnMethods = "dropMail", enabled = false, dependsOnMethods = {"dropMail", "inboxItems"}
    public void sentItems() {
        System.out.println("I am @Test annotated sentItems in TestNGDemoThree");
    }

    @Test(priority = 2, description = "Inbox Items method", groups = "A") // priority = 2
    public void inboxItems() {
        System.out.println("I am @Test annotated inboxItems in TestNGDemoThree");
    }


}

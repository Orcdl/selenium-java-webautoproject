package tests;

import driver.DriverFactory;
import models.pages.LoginPagePOM1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static driver.PageURL.HomePageURL;
import static driver.PageURL.loginURL;

public class LoginPagePOM1Test{

    private WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = DriverFactory.getWebDriver();

    }
    @Test
    public void logintologinpage(){
        driver.get(loginURL);

        LoginPagePOM1 loginPagePOM1 = new LoginPagePOM1(driver);
        loginPagePOM1.email().sendKeys("QAtestingvn@yopmail.com");
        loginPagePOM1.passoword().sendKeys("123456");
        loginPagePOM1.loginBtn1().click();

        String expectedURL = HomePageURL;
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL);
    }

    public void vote(){
        Actions action  = new Actions(driver);


    }
    public void closeBrowser(){
        driver.quit();
    }

}

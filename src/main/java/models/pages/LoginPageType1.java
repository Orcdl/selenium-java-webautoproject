package models.pages;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static driver.PageURL.loginURL;

public class LoginPageType1 {

    private WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = DriverFactory.getWebDriver();
    }

    @Test
    public void logintoLoginPage(){
        driver.get(loginURL);

        String email = "QAtestingvn@yopmail.com";
        String password = "123456";

        driver.findElement(By.id("Email")).sendKeys("QAtestingvn@yopmail.com");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.cssSelector("input[value='Log in']")).click();

        String ExpectationURL = "https://demowebshop.tricentis.com/";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL,ExpectationURL);
    }

    @AfterTest
    public void closebrowser(){
        driver.quit();
    }
}


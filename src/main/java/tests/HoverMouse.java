package tests;

import driver.DriverFactory;
import models.pages.LoginPagePOM1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static driver.PageURL.HomePageURL;
import static driver.PageURL.loginURL;

public class HoverMouse {
    public static void main(String[] args) {

        WebDriver driver = DriverFactory.getWebDriver();
        driver.get(loginURL);

        LoginPagePOM1 loginPagePOM1 = new LoginPagePOM1(driver);
        loginPagePOM1.email().sendKeys("QAtestingvn@yopmail.com");
        loginPagePOM1.passoword().sendKeys("123456");
        loginPagePOM1.loginBtn1().click();
        Actions mousehover = new Actions(driver);
        mousehover.moveToElement(loginPagePOM1.pollOption()).perform();
        loginPagePOM1.VoteBtn().click();









    }






}

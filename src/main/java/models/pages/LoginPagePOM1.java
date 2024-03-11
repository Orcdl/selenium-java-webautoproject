package models.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import supportMethods.WaitForElementEnable;

public class LoginPagePOM1 {

    private WebDriver driver;
    private final static By emailSel = By.id("Email");
    private final static By PasswordSel = By.id("Password");
    private final static By loginBtn1 = By.cssSelector("input[value='Log in'");
    public final static By pollOptionSel = By.id("pollanswers-1");
    public final static By VoteBtnSel = By.id("vote-poll-1");
//    public final static By AlertSel = By.xpath();


    public LoginPagePOM1(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement email(){
        return driver.findElement(emailSel);
    }
    public WebElement passoword(){
        return driver.findElement(PasswordSel);
    }
    public WebElement loginBtn1(){
        return driver.findElement(loginBtn1);
    }
    public WebElement pollOption(){
        return driver.findElement(pollOptionSel);
    }
    public WebElement VoteBtn(){
        return driver.findElement(VoteBtnSel);
    }




}

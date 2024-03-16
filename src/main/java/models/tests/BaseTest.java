package models.tests;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected static WebDriver driver;

    @BeforeTest
    protected void initBrowserSession(){
        driver = DriverFactory.getWebDriver();
    }

    @AfterClass
    public void CloseBrowserSesssion(){
        if(driver != null){
            driver.quit();
        }
    }

}

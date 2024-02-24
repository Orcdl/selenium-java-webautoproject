package models.tests.global.Footer;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import testflows.global.FooterTestFlow;

import static driver.PageURL.HomePageURL;

public class FooterTest {

    @Test
    public void testFooteronHomepage(){
        WebDriver driver = DriverFactory.getWebDriver();
        try {
            driver.get(HomePageURL);
            FooterTestFlow footerTestFlow = new FooterTestFlow(driver);
            footerTestFlow.verifyFooterComponent();
        } catch (Exception e){

        } finally {
            driver.quit();
        }
    }

//    public static void main(String[] args) {
//        WebDriver driver = DriverFactory.getWebDriver();
//        try {
//            driver.get(HomePageURL);
//            FooterTestFlow footerTestFlow = new FooterTestFlow(driver);
//            footerTestFlow.verifyFooterComponent();
//        } catch (Exception e){
//
//        } finally {
//            driver.quit();
//        }
//    }
}

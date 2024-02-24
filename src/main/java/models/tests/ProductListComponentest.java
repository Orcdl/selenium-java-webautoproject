package models.tests;

import driver.DriverFactory;
import models.pages.Homepage;
import org.openqa.selenium.WebDriver;

import static driver.PageURL.HomePageURL;

public class ProductListComponentest {
    public static void main(String[] args) {

        WebDriver driver = DriverFactory.getWebDriver();
        driver.get(HomePageURL);
       try {
           Homepage homepage = new Homepage(driver);
           homepage.productItemCompList().forEach(productItemComponent -> {
               System.out.println(productItemComponent.productTitleEle().getText());
           });
       } catch (Exception ignored){

       } finally {
           driver.quit();
       }
    }
}

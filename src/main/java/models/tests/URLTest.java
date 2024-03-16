package models.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.*;



import static driver.PageURL.HomePageURL;

public class URLTest extends BaseTest{

    @Test
    public void verifyCorrectURL(){;
        driver.get(HomePageURL);
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL,"https://demowebshop.tricentis.com/");
    }

    @Test
    public void verifyAfterNavigate(){
        driver.navigate().to("https://demowebshop.tricentis.com/recentlyviewedproducts");
        String newURL = driver.getCurrentUrl();
        Assert.assertEquals(newURL,"https://demowebshop.tricentis.com/recentlyviewedproducts");
    }

    @Test
    public void verifyBrokenLinks(){
        driver.get(HomePageURL);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link: links){
            String href = link.getAttribute("href");
            Assert.assertTrue(href.isEmpty());
            System.out.println(links);
        }
    }


}

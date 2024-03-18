package models.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.HttpURLConnection;
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
    public void verfiyElementShow(){
        driver.get("https://demowebshop.tricentis.com/");
        By LangPopupSel = By.className("modal-content");
        List <WebElement> langPopupElem = driver.findElements(LangPopupSel);
            Assert.assertFalse(langPopupElem.isEmpty(),"the popup should be show on the page");
            System.out.println(langPopupElem);
        }

    @Test
    public void verifyBrokenLinks(){
        driver.get("https://demowebshop.tricentis.com/");
        String url ="";
        HttpURLConnection huc = null;
        int respCode = 200;
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links on the Web page" + links.size());
        Iterator<WebElement> iterator = links.iterator();
        while (iterator.hasNext()) {
            url = iterator.next().getText();
            System.out.println(url);
            if (url == null || url.isEmpty()) {
                System.out.println("URL should not be empty");
            }
        }
    }
}

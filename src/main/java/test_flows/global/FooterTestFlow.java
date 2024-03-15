package test_flows.global;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

import models.components.global.TopMenuComponent;
import models.components.global.footer.*;
import models.pages.BasePage;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;

public class FooterTestFlow {

    private final WebDriver driver;

    public FooterTestFlow(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyFooterComponent(){
        BasePage basePage = new BasePage(this.driver);

        InformationColumnComponent informationColumnComponent = basePage.footerComponent().informationFooterComponent();
        CustomerServiceColumnComponent customerServiceColumnComponent = basePage.footerComponent().customerFooterComponent();
        MyAccountFooterComponent myAccountColumnComponent = basePage.footerComponent().myAccountFooterComponent();
        FollowUsFooterComponent followUsColumnComponent = basePage.footerComponent().followUsFooterComponent();

        verifyInformationColumn(informationColumnComponent);
        verifyCustomerServiceColumnComponent(customerServiceColumnComponent);
        verifyMyAccountColumn(myAccountColumnComponent);
        verifyFollowUseColum(followUsColumnComponent);
    }

    public void verifyProductCartComponent(){
        BasePage basePage = new BasePage(driver);
        TopMenuComponent topMenuComponent = basePage.topMenuComponent();

        List<TopMenuComponent.MainCartItem> mainCartElem = topMenuComponent.mainCartItemElement();
        Assert.assertFalse(mainCartElem.isEmpty(),"[ERR]: There is not item on top menu");
        TopMenuComponent.MainCartItem randomMainItemElem = mainCartElem.get(new SecureRandom().nextInt(mainCartElem.size()));
        String randomCartHref = randomMainItemElem.cartItemLinkElement().getAttribute("href");



        List<TopMenuComponent.SublistComponent> sublistComps = randomMainItemElem.sublistComps();
        if(sublistComps.isEmpty()){
            randomMainItemElem.cartItemLinkElement().click();
        } else {
            int randomIndex = new SecureRandom().nextInt(sublistComps.size());
            TopMenuComponent.SublistComponent randomCartItemComp = sublistComps.get(randomIndex);
            randomCartHref = randomCartItemComp.getComponent().getAttribute("href");
            randomMainItemElem.getComponent().click();
        }
        //Make sure we are on the right page | wait until navigation is done
        try {
            WebDriverWait wait = randomMainItemElem.componenetWait();
            wait.until(ExpectedConditions.urlContains(randomCartHref));
        } catch (TimeoutException ignored){
            Assert.fail("[ERR] Target page is not matched");
        }
        this.verifyFooterComponent();
    }

    private void verifyInformationColumn(FooterColumComponent informationColumnComponent) {
//        System.out.println("verifyInformationColumn");
//        WebElement header = informationColumnComponent.headerEle();
//        Assert.assertEquals(header.getText(), "INFORMATION", "Failed to find header text");
//        List<WebElement> list = informationColumnComponent.linksEle();
//        Assert.assertEquals(list.isEmpty(), false, "List is empty");
//        System.out.println("List length = " + list.size());
        List<String> expectedLinktexts =
                Arrays.asList("Sitemap","Shipping & Returns","Privacy Notice","Conditions of Use","About us","Contact us");
        List<String> expectedHrefs =
                Arrays.asList("sitemap","shipping-returns","privacy-policy","conditions-of-use","about-us","contactus");
        testFooterColumn(informationColumnComponent, expectedLinktexts, expectedHrefs);
        System.out.println(expectedHrefs);
    }

    private void verifyCustomerServiceColumnComponent(FooterColumComponent customerServiceColumnComponent) {
        List<String> expectedLinktexts =
                Arrays.asList("Search","News","Blog","Recently viewed products","Compare products list","New products");
        List<String> expectedHrefs =
                Arrays.asList("search","news","blog","recentlyviewedproducts","compareproducts","newproducts");
        testFooterColumn(customerServiceColumnComponent, expectedLinktexts, expectedHrefs);
        System.out.println(expectedHrefs);

    }

    private void verifyMyAccountColumn(FooterColumComponent myAccountColumnComponent ) {
        List<String> expectedLinktexts =
                Arrays.asList("My account","Orders","Addresses","Shopping cart","Wishlist");
        List<String> expectedHrefs =
                Arrays.asList("customer/info","customer/orders","customer/addresses","cart","wishlist");
        testFooterColumn(myAccountColumnComponent, expectedLinktexts, expectedHrefs);
        System.out.println(expectedHrefs);
    }

    private void verifyFollowUseColum(FooterColumComponent myAccountColumnComponent) {
        List<String> expectedLinktexts =
                Arrays.asList("Facebook","Twitter","RSS","YouTube","Google+");
        List<String> expectedHrefs =
                Arrays.asList("nopCommerce","news/rss/1","user/nopCommerce","+nopcommerce");
        testFooterColumn(myAccountColumnComponent, expectedLinktexts, expectedHrefs);
        System.out.println(expectedHrefs);
    }

    private void testFooterColumn(FooterColumComponent footerColumComponent, List<String> expectedLinktexts, List<String> expectedHrefs){
        List<String> actualLinktexts = new ArrayList<>();
        List<String> actualHers = new ArrayList<>();
        expectedHrefs.replaceAll(originHref ->"https://demowebshop.tricentis.com/" + originHref);

        footerColumComponent.linksEle().forEach(columnItem ->{
            actualLinktexts.add(columnItem.getText());
            actualHers.add(columnItem.getAttribute("href"));
        });
        if (actualLinktexts.isEmpty() || actualHers.isEmpty()) {
            Assert.fail("Footer Column text or hyberlink is empty");
        }
//
//        System.out.println(footerColumComponent.headerEle().getText());
//        for(WebElement linksEle: footerColumComponent.linksEle()){
//            System.out.println(linksEle.getText() + " : " + linksEle.getAttribute("href"));
//        }
//        System.out.println("========");

        Assert.assertEquals(actualLinktexts,expectedLinktexts,"ERR: Footer column link text are different");
        Assert.assertEquals(actualHers,actualHers,"ERR: Footer column hrefs text are different");

    }

}

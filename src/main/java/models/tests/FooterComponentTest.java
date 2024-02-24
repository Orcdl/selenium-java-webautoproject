package models.test;

import driver.DriverFactory;
import models.components.global.footer.FooterColumComponent;
import models.components.global.footer.FooterComponent;
import models.pages.Homepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterComponentTest {

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getWebDriver();
        Homepage homepage = new Homepage(driver);
        FooterComponent footerComponent = homepage.footerComponent();
        FooterColumComponent informationColumnComponent = footerComponent.informationFooterComponent();
        FooterColumComponent customerFooterComponent = footerComponent.customerFooterComponent();
        testFooterComp(informationColumnComponent);
        testFooterComp(customerFooterComponent);

    }

    private static void testFooterComp(FooterColumComponent footerColumComponent){
        System.out.println();footerColumComponent.headerEle().getText();
        for (WebElement linkEle : footerColumComponent.linksEle()) {
            System.out.println(linkEle.getText()+":"+ linkEle.getAttribute("href"));
        }
        System.out.println("=======");
    }
}

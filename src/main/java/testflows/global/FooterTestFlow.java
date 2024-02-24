package testflows.global;

import models.components.global.footer.FooterColumComponent;
import models.components.global.footer.InformationColumnComponent;
import models.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterTestFlow {

    private final WebDriver driver;

    public FooterTestFlow(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyFooterComponent(){
        BasePage basePage = new BasePage(this.driver);
        InformationColumnComponent informationColumnComponent = basePage.footerComponent().informationFooterComponent();

        verifyInformationColumn(informationColumnComponent);
        verifyCustomerServiceColumn();
        verifyMyAccountColumn();
        verifyFollowUsColumn();
    }

    private void verifyInformationColumn(InformationColumnComponent informationColumnComponent) {
    }


    private void verifyInformationColumn(FooterColumComponent informationColumnComponent) {

    }


    private void verifyFollowUsColumn() {

    }

    private void verifyMyAccountColumn() {
    }

    private void verifyCustomerServiceColumn() {
    }



    private void testFooterColumn(FooterColumComponent footerColumComponent){
        System.out.println();footerColumComponent.headerEle().getText();
        for (WebElement linkEle : footerColumComponent.linksEle()) {
            System.out.println(linkEle.getText()+":"+ linkEle.getAttribute("href"));
        }
        System.out.println("=======");
    }




}

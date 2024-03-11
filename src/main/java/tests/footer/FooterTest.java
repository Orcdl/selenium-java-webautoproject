package tests.footer;

import org.testng.annotations.Test;
import test_flows.global.BaseTest;
import test_flows.global.FooterTestFlow;

import static driver.PageURL.HomePageURL;


public class FooterTest extends BaseTest {

    @Test
    public  void testHomePageFooter(){
        driver.get(HomePageURL);
        FooterTestFlow footerTestFlow = new FooterTestFlow(driver);
        footerTestFlow.verifyFooterComponent();
    }
}

package test_flows.footer;

import org.testng.annotations.Test;
import test_flows.global.BaseTest;
import test_flows.global.FooterTestFlow;

public class FooterTest extends BaseTest {
    @Test
    public void testHomepageFooter() {
        driver.get("https://demowebshop.tricentis.com/");
        FooterTestFlow footerTestFlow = new FooterTestFlow(driver);
        footerTestFlow.verifyFooterComponent();
    }
}

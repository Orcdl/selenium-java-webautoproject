package tests.order;

import models.components.order.StandardComputerComponent;
import org.testng.annotations.Test;
import test_flows.computer.OrderComputerFlow;
import test_flows.global.BaseTest;

public class BuyingCheapComputerTest extends BaseTest {

    @Test
    public void testCheapComputerBuying(){
        driver.get("https://demowebshop.tricentis.com/build-your-own-computer");
        OrderComputerFlow orderComputerFlow = new OrderComputerFlow(driver, StandardComputerComponent.class);
        orderComputerFlow.builCompSpecAndAddToCart();
    }
}

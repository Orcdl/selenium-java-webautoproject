package test_flows.computer;

import models.components.order.ComputerEssentialComponent;
import models.components.pages.ComputerItemDetailPage;
import org.openqa.selenium.WebDriver;

public class OrderComputerFlow <T extends ComputerEssentialComponent>{

    private Class<T> computerEssentialComp;
    private WebDriver driver;

    public OrderComputerFlow(WebDriver driver,Class<T> computerEssentialCompClass){
        this.computerEssentialComp = computerEssentialCompClass;
        this.driver = driver;
    }

    //Steps 1
    public void builCompSpecAndAddToCart(){
        ComputerEssentialComponent computerEssentialComponent = new ComputerItemDetailPage(driver).computerComp(computerEssentialComp);
        computerEssentialComponent.selectProcessorType("");
        computerEssentialComponent.selectRAMType("");



    }
}

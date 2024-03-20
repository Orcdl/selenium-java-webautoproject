package test_flows.computer;

import models.components.order.ComputerEssentialComponent;
import models.components.pages.ComputerItemDetailPage;
import org.openqa.selenium.WebDriver;

public class OrderComputerFlow0GType{

    private ComputerEssentialComponent computerEsstialComp1;

    public OrderComputerFlow0GType(ComputerEssentialComponent computerEsstialComp1){
        this.computerEsstialComp1 = computerEsstialComp1;
    }

    public void buildCompSpecandAddtoCart(){
        computerEsstialComp1.selectProcessorType("");
        computerEsstialComp1.selectRAMType("");

    }

}

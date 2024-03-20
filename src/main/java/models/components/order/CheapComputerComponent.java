package models.components.order;

import models.components.product.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector("product-essential")
public class CheapComputerComponent extends ComputerEssentialComponent{
    public CheapComputerComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }

    @Override
    public String selectProcessorType(String type) {
        System.out.println("selectProcessorType CHEAP");
        return null;
    }

    @Override
    public String selectRAMType(String type) {
        System.out.println("selectRAMtype CHEAP");
        return null;
    }
}


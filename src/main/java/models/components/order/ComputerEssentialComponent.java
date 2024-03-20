package models.components.order;

import models.components.product.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector("product-essential")
public abstract class ComputerEssentialComponent extends BaseItemComponent {

    public ComputerEssentialComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }

    public abstract  String selectProcessorType(String type);
    public abstract  String selectRAMType(String type);
}

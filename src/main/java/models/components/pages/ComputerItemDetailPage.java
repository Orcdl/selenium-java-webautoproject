package models.components.pages;

import models.components.order.ComputerEssentialComponent;
import models.components.product.Component;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComputerItemDetailPage extends BasePage {

    public ComputerItemDetailPage(WebDriver driver) {
        super(driver);
    }

    public <T extends ComputerEssentialComponent> T computerComp(Class<T> computerEssentialCompClass){
        return findComponent(computerEssentialCompClass);
    }
}

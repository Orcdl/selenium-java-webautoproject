package models.components.global.footer;

import models.components.Component;
import models.components.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(".column.customer-service")
public class CustomerFooterComponent extends Component {

    public CustomerFooterComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
}

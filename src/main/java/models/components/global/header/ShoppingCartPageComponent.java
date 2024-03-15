package models.components.global.header;

import models.components.product.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(".ico-cart")
public class ShoppingCartPageComponent extends HeaderComponent {
    public ShoppingCartPageComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
}

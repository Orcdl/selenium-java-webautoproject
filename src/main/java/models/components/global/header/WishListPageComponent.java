package models.components.global.header;

import models.components.product.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(".ico-wishlist")
public class WishListPageComponent extends HeaderComponent {
    public WishListPageComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
}

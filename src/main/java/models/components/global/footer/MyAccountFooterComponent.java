package models.components.global.footer;

import models.components.product.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(".column.my-account")
public class MyAccountFooterComponent extends FooterColumComponent {

    public MyAccountFooterComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
}

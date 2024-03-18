package models.components.global.footer;

import models.components.product.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector("div[class*='information']")
public class InformationColumnComponent extends FooterColumComponent {

    public InformationColumnComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
}
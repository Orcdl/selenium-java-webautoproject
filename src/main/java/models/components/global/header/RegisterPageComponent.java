package models.components.global.header;

import models.components.product.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(".ico-register")
public class RegisterPageComponent extends HeaderComponent {
    public RegisterPageComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
}

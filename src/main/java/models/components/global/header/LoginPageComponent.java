package models.components.global.header;

import models.components.product.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(".ico-login")
public class LoginPageComponent extends HeaderComponent {
    public LoginPageComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
}

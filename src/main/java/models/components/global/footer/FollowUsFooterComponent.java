package models.components.global.footer;

import models.components.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(".column.follow-us")
public class FollowUsFooterComponent extends FooterColumComponent {

    public FollowUsFooterComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
}

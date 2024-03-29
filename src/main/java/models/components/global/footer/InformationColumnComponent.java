package models.components.global.footer;

import models.components.Component;
import models.components.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector("div[class*='information']")
public class InformationColumnComponent extends Component {

    public InformationColumnComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }
}

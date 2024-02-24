package models.components.global.footer;

import models.components.Component;
import models.components.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(value = ".footer")
public class FooterComponent extends Component {

    public FooterComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }

    public InformationColumnComponent informationFooterComponent(){
        return findComponent(InformationColumnComponent.class);
    }

    public CustomerFooterComponent customerFooterComponent(){
        return findComponent(CustomerFooterComponent.class);
    }
}


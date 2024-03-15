package models.components.global;


import models.components.product.Component;
import models.components.product.ComponentCssSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

@ComponentCssSelector(".top-menu")
public class TopMenuComponent extends Component {

    public TopMenuComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }

    public List<MainCartItem> mainCartItemElement(){
        return findComponents(MainCartItem.class);

    }


    @ComponentCssSelector(".top-menu > li")
    public static class MainCartItem extends Component{

        public MainCartItem(WebDriver driver, WebElement component) {
            super(driver, component);
        }

        public WebElement cartItemLinkElement(){
            return component.findElement(By.tagName("a"));

        }

        public List<SublistComponent> sublistComps(){
            Actions actions = new Actions(driver);
            actions.moveToElement(component).perform();
            return findComponents(SublistComponent.class);

        }
    }

    @ComponentCssSelector(".sublist li a")
    public static class SublistComponent extends Component{

        public SublistComponent(WebDriver driver, WebElement component) {
            super(driver, component);

        }
    }
}
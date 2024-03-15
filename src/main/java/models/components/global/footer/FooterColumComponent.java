package models.components.global.footer;

import models.components.product.Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByChained;

import java.util.List;

public class FooterColumComponent extends Component {


    private static final By HEADER_SEL = By.tagName("h3");
    private static final By LINK_SEL = new ByChained(By.tagName("li"), By.tagName("a"));


    public FooterColumComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }


    public WebElement headerEle(){
        return this.component.findElement(HEADER_SEL);
    }




    public List<WebElement> linksEle(){
        return this.component.findElements(LINK_SEL);
    }

    public void display(){

    }
}

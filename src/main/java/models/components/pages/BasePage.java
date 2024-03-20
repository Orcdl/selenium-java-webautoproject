package models.components.pages;

import models.components.global.CartegoryItemComponent;
import models.components.product.Component;
import models.components.global.footer.FooterComponent;
import models.components.global.header.HeaderComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Arrays;
import java.util.List;

public class BasePage extends Component {

    protected final WebDriver driver;

    public BasePage(WebDriver driver) {
        super(driver, driver.findElement(By.tagName("html")));
        this.driver = driver;
    }

    public FooterComponent footerComponent(){
        return findComponent(FooterComponent.class);

    }

    public HeaderComponent headerComponent(){
        return findComponent(HeaderComponent.class);
    }

    public List <CartegoryItemComponent> categoryItemComponent(){
        return findComponents(CartegoryItemComponent.class);
    }


}

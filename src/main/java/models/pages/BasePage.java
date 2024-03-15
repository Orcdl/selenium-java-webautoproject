package models.pages;

import models.components.global.TopMenuComponent;
import models.components.product.Component;
import models.components.global.footer.FooterComponent;
import models.components.global.header.HeaderComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    public TopMenuComponent topMenuComponent(){
        return findComponent(TopMenuComponent.class);
    }


}

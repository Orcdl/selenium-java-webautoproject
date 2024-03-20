package models.components.pages;

import models.components.product.ProductItemComponent;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class Homepage extends BasePage{

    public Homepage(WebDriver driver) {
        super(driver);
    }

    public List<ProductItemComponent> productItemCompList(){
        return findComponents(ProductItemComponent.class);
    }
}

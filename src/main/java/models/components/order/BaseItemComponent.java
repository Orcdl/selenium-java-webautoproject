package models.components.order;

import models.components.product.Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseItemComponent extends Component {


    private static final By productPriceSel = By.cssSelector(".product-price");
    private static final By addtoCartBtn = By.cssSelector("input[id^='add-to-cart-button']");

    public BaseItemComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }

    public double productPrice(){
        String productPriceString = findElement(productPriceSel).getText().trim();
        return Double.parseDouble(productPriceString);
    }

    public void clickonAddCartBtn(){
        findElement(addtoCartBtn).click();
    }




}

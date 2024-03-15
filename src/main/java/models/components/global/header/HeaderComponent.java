package models.components.global.header;

import models.components.product.Component;
import models.components.product.ComponentCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@ComponentCssSelector(value = ".header")
public class HeaderComponent extends Component {

    public HeaderComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }

    public RegisterPageComponent registerPageComponent(){
        return findComponent(RegisterPageComponent.class);
    }


    public LoginPageComponent loginPageComponent() {
        return findComponent(LoginPageComponent.class);
    }

    public ShoppingCartPageComponent shoppingCartPageComponent(){
        return findComponent(ShoppingCartPageComponent.class);
    }

    public WishListPageComponent wishListPageComponent(){
        return findComponent(WishListPageComponent.class);
    }
}


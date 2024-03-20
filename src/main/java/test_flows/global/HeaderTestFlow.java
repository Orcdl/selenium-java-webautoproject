package test_flows.global;

import models.components.global.header.LoginPageComponent;
import models.components.global.header.RegisterPageComponent;
import models.components.global.header.ShoppingCartPageComponent;
import models.components.global.header.WishListPageComponent;
import models.components.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class HeaderTestFlow<originHref> {

    private final WebDriver driver;

    public HeaderTestFlow(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyHeaderComponent(){
        BasePage basePage = new BasePage(this.driver);

        RegisterPageComponent registerPageComponent = basePage.headerComponent().registerPageComponent();
        LoginPageComponent loginPageComponent = basePage.headerComponent().loginPageComponent();
        ShoppingCartPageComponent shoppingCartPageComponent = basePage.headerComponent().shoppingCartPageComponent();
        WishListPageComponent wishListPageComponent = basePage.headerComponent().wishListPageComponent();

        verifyRegisterPageComponent(registerPageComponent);
        verifyLoginPageComponent(loginPageComponent);
        verifyShoppingCartPageComponent(shoppingCartPageComponent);
        verifyWishListPageComponent(wishListPageComponent);
    }

    private void verifyWishListPageComponent(WishListPageComponent wishListPageComponent) {

    }

    private void verifyShoppingCartPageComponent(ShoppingCartPageComponent shoppingCartPageComponent) {
    }

    private void verifyLoginPageComponent(LoginPageComponent loginPageComponent) {
    }

    private void verifyRegisterPageComponent(RegisterPageComponent registerPageComponent) {
        String expectedLinktexts = "Register";
        String expectedHrefs = "register";
        testHeaderComponent(registerPageComponent,expectedLinktexts,expectedHrefs);
    }

    private void testHeaderComponent(RegisterPageComponent registerPageComponent, String expectedLinktexts, String expectedHrefs){
        
    }


}

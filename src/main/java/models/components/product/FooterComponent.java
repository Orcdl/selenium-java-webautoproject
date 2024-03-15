package models.components.product;

import org.openqa.selenium.WebDriver;

@ComponentCssSelector(value = ".footer")
public class FooterComponent {
    private final WebDriver driver;

    public FooterComponent(WebDriver driver) {
        this.driver = driver;
    }
}

package supportMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectEx extends Select {

    private final static String OPTIONS_01 = "Option1";

    public SelectEx(WebElement element) {
        super(element);
    }

    public void selectOption1(){
        selectByVisibleText(OPTIONS_01);
    }
}

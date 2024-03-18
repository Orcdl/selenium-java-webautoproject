package supportMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class ExpectedConditionsEx {
    public static ExpectedCondition<List<WebElement>> presenceOfAllElementsLocatedBy(final WebElement parentComp, final By locator) {
        return new ExpectedCondition<List<WebElement>>() {
            public List<WebElement> apply(WebDriver driver) {
                List<WebElement> elements = parentComp.findElements(locator);
                return elements.size() > 0 ? elements : null;
            }

            public String toString() {
                return "presence of any elements located by " + locator;
            }
        };
    }
}

package models.components.order;

import models.components.product.ComponentCssSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import supportMethods.SelectEx;
import java.util.List;


@ComponentCssSelector(".product-essential")
public class StandardComputerComponent extends ComputerEssentialComponent {
    private static final By productAttrSel = By.cssSelector("select[name^='product_attribute']");
    public StandardComputerComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }

    @Override
    public String selectProcessorType(String type) {
        final int PROCESSOR_DROPDOWN_INDEX = 0;
        WebElement processorDropDownEle = component.findElements(productAttrSel).get(PROCESSOR_DROPDOWN_INDEX);
        System.out.println("selectProcessorType Standard");
        return selectOption(processorDropDownEle,type);
    }

    @Override
    public String selectRAMType(String type) {
        final int RAM_DROPDOWN_INDEX = 1;
        WebElement ramDropDownEle = component.findElements(productAttrSel).get(RAM_DROPDOWN_INDEX);
        System.out.println("selectRAMType Standard");
        return selectOption(ramDropDownEle,type);
    }

    private String selectOption(WebElement dropdownEle, String type){
        SelectEx select = new SelectEx(dropdownEle);
        List<WebElement> allOptionEles = select.getOptions();
        String fullStringOption = null;

        for (WebElement optionEle : allOptionEles) {
            String currentOptionText = optionEle.getText();
            String optionTextWithoutSpaces = currentOptionText.trim().replace(" ", "");
            if(optionTextWithoutSpaces.startsWith(type)){
                fullStringOption = currentOptionText;
                break;
            }
        }
        if(fullStringOption == null){
            throw new RuntimeException("[ERR] The options" + type + "is not exiting select");
        }

        select.selectByVisibleText(fullStringOption);
        return fullStringOption;
    }
}


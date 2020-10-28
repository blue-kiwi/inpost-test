package kiwi.blue.pageobjects.allegro;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class ProductListingPage extends PageObject {

    @FindBy(xpath="//fieldset//label[./span[text()='raty zero']]")
    public WebElementFacade zeroInstallmentsCheckbox;

    @FindBy (css = "[data-box-name='Items Container'] article")
    public List<WebElementFacade> products;

    public void openFirstItem() {
        products.get(0).findBy(".//img").click();
    }
}

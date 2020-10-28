package kiwi.blue.pageobjects.allegro;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProductPage extends PageObject {

    @FindBy (id = "add-to-cart-button")
    public WebElementFacade addToCartButton;

    @FindBy (css = "[data-analytics-click-label='goToCart']")
    public WebElementFacade goToCartButton;
}

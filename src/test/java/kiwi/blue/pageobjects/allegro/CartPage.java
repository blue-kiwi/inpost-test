package kiwi.blue.pageobjects.allegro;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CartPage extends PageObject {

    @FindBy(css = "[data-role='installments-button']")
    public WebElementFacade buyWithZeroInstallmentsButton;

    @FindBy(css = "[data-analytics-click-label='offerClick")
    public WebElementFacade productInCart;
}

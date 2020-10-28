package kiwi.blue.pageobjects.allegro;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://allegro.pl/")
public class AllegroHomePage extends PageObject {

    @FindBy (css = "[data-role='accept-consent']")
    public WebElementFacade cookieConsent;

    @FindBy(css="[type='search']")
    public WebElementFacade searchInput;
}

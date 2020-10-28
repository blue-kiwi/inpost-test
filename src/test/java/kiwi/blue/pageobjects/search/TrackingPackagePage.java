package kiwi.blue.pageobjects.search;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TrackingPackagePage extends PageObject {

    @FindBy(css="div.messageBox p.-big")
    public WebElementFacade packageStatus;
}
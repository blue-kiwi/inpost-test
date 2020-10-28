package kiwi.blue.pageobjects.search;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://inpost.pl/")
public class HomePage extends PageObject {

    @FindBy(className="inputForMat")
    public WebElementFacade packageNumberInput;

    @FindBy(className = "-mobilefull")
    public WebElementFacade findButton;

}

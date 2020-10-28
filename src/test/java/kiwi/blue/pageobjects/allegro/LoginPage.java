package kiwi.blue.pageobjects.allegro;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(xpath="//section/h2[./span[text()='zaloguj się']]")
    public WebElementFacade loginPage;

    @FindBy(className = "btn-fb")
    public WebElementFacade facebookButton;
}

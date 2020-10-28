package kiwi.blue.stepdefinitions;

import io.cucumber.java.pl.*;
import kiwi.blue.pageobjects.allegro.*;
import net.serenitybdd.screenplay.ensure.Ensure;

public class AllegroAddProductStepDefinitions {

    AllegroHomePage allegroHomePage;
    ProductListingPage productListingPage;
    ProductPage productPage;
    CartPage cartPage;
    LoginPage loginPage;

    @Zakładającże("użytkownik znajduje się na stronie domowej Allegro")
    public void openAllegroHomePage() {
        allegroHomePage.open();
        allegroHomePage.cookieConsent.click();
    }

    @Jeśli("użytkownik wyszuka towar o nazwie {string}")
    public void searchForProduct(String productName) {
        allegroHomePage.searchInput.typeAndEnter(productName);
    }

    @I("wybierze opcję raty zero")
    public void selectZeroInstallmentsCheckbox() {
        productListingPage.zeroInstallmentsCheckbox.click();
        productListingPage.waitFor(5).second(); //todo spinner locator?
    }

    @Wtedy("towary z ratami zero są wyświetlone na liście produktów")
    public void getListOfProductsWithZeroInstallments() {
        productListingPage.products.forEach(product ->
                product.shouldContainElements("//span[text()='raty zero']"));
    }

    @Jeśli("użytkownik wybierze pierwszy produkt z listy")
    public void selectFirstItemFromProductsList() {
        productListingPage.openFirstItem();
        productPage.waitFor(productPage.addToCartButton);
    }

    @Oraz("użytkownik kliknie w przycisk Dodaj do koszyka")
    public void clickAddToCartButton() {
        productPage.addToCartButton.click();
    }

    @Oraz("użytkownik kliknie w przycisk Przejdź do koszyka")
    public void checkIfPreCartPageIsOpen() {
        productPage.goToCartButton.click();
    }

    @Wtedy("towar jest dodany do koszyka")
    public void checkIfProductIsAddedToCart() {
        cartPage.productInCart.shouldBeEnabled();
    }

    @I("przycisk Kup na raty zero jest widoczny")
    public void checkIfBuyOnZeroInstallmentsIsEnabled() {
        cartPage.buyWithZeroInstallmentsButton.shouldBeEnabled();
    }

    @Jeśli("użytkownik kliknie w przycisk Kup na raty zero")
    public void clickBuyOnZeroInstallmentsButton() {
        cartPage.buyWithZeroInstallmentsButton.click();
    }

    @Wtedy("strona logowania jest otwarta")
    public void checkIfLoginPageIsOpen() {
        loginPage.loginPage.shouldBeVisible();
    }

    @I("przycisk Zaloguj przez Facebook jest widoczny")
    public void checkIfFacebookLoginButtonIsEnabled() {
        loginPage.facebookButton.shouldBeEnabled();
    }

    @Jeśli("użytkownik kliknie w przycisk Zaloguj przez Facebook")
    public void clickFacebookLoginButton() {
        loginPage.facebookButton.click();
    }

    @Wtedy("strona logowania Fecebooka jest otwarta")
    public void checkIfFacebookLoginPageIsOpen() {
        Ensure.that(loginPage.getDriver().getCurrentUrl()).contains("https://www.facebook.com/login");
    }
}

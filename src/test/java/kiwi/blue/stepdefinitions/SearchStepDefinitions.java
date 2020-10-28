package kiwi.blue.stepdefinitions;

import io.cucumber.java.pl.*;
import kiwi.blue.pageobjects.search.HomePage;
import net.serenitybdd.screenplay.ensure.Ensure;
import kiwi.blue.pageobjects.search.TrackingPackagePage;

public class SearchStepDefinitions {

    HomePage homePage;
    TrackingPackagePage trackingPackagePage;

    @Zakładającże("użytkownik znajduje się na stronie domowej Inpost")
    public void openHomePageInpost() {
        homePage.open();
    }

    @Jeśli("użytkownik wprowadzi numer paczki {string}")
    public void populatePackageNumber(String packageNumber) {
        homePage.packageNumberInput.type(packageNumber);
    }

    @Oraz("kliknie przycisk Znajdż")
    public void clickFindButton() {
        homePage.findButton.click();
    }

    @Wtedy("nastąpi przekierowanie na stronę śledzenia paczki {string}")
    public void moveToTrackingPage(String url) {
        Ensure.that(trackingPackagePage.getDriver().getCurrentUrl()).isEqualTo(url);
    }

    @I("paczka będzie w statusie {string}")
    public void checkPackageStatus(String packageStatus) {
        Ensure.that(trackingPackagePage.packageStatus.getText()).isEqualTo(packageStatus);
    }
}

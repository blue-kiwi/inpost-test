package kiwi.blue.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pl.I;
import io.cucumber.java.pl.Jeśli;
import io.cucumber.java.pl.Wtedy;
import io.cucumber.java.pl.Zakładającże;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.apache.commons.io.FileUtils;
import org.assertj.core.api.SoftAssertions;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class RestApiStepDefinitions {

    Response response;
    String resultFileName = "results.txt";

    @Zakładającże("shipx-proxy endpoint istnieje")
    public void theShipxProxyEndpointExists() {
        RestAssured.baseURI = "https://inpost.pl/shipx-proxy/";
    }

    @Jeśli("użytkownik wysyła zapytanie o status przesyłki {string}")
    public void iRequestStatusOfTracking_number(String tracking_number) {
        response = given()
                .param("number", tracking_number)
                .contentType(ContentType.TEXT)
                .accept(ContentType.ANY)
                .header(new Header("Sec-Fetch-Dest", "empty"))
                .header(new Header("Sec-Fetch-Mode", "cors"))
                .header(new Header("Sec-Fetch-Site", "same-origin"))
                .header(new Header("X-Requested-With", "XMLHttpRequest"))
                .get().then().extract().response();
    }

    @Wtedy("odpowiedź powinna przyjmować {string}")
    public void responseShouldReceiveStatus(String expectedStatus) {
        if(expectedStatus.equals("not-found")) {
            assertThat(response.jsonPath().getString("message")).contains("shipment has not been found");
        } else {
            assertThat( response.jsonPath().getString("status")).isEqualTo(expectedStatus);
        }
    }


    @Zakładającże("api do wyszukiwania paczkomatów istnieje")
    public void httpsInpostPlSzybkieNadaniaVApiPointsExists() {
        RestAssured.baseURI = "https://inpost.pl/SzybkieNadania/v1/api/points";
    }

    @Jeśli("użytkownik wyśle zapytanie o adresy {int} paczkomatów w {string}")
    public void iRequestForAddressOfParcelLockersInKrakow(int resultsPerPage, String city) throws IOException {
        String response =  given()
                .param("query", city)
                .param("type", "standard_parcel_send")
                .param("page", "1")
                .param("perPage", resultsPerPage)
                .accept(ContentType.ANY)
                .contentType(ContentType.JSON)
                .get().then().extract().response()
                .jsonPath().getList("items", Map.class).stream().map(item -> ((String)item.get("name")).replace("\n", "\t"))
                .collect(Collectors.joining("\n"));

        FileUtils.writeStringToFile(new File(resultFileName), response, StandardCharsets.UTF_8);
    }

    @Wtedy("odpowiedź powinna zawierać listę ograniczoną do {int} adresów")
    public void theResponseShouldContainListOfAddress(int expectedSize) throws IOException {
        Ensure.that(FileUtils.readLines(new File(resultFileName), StandardCharsets.UTF_8)).hasSize(expectedSize);
    }

    @I("każdy adres powinien mieć adres w formacie [Kraków-ulica-numer]")
    public void eachAddressShouldHaveAddressMatchingKrakowUlicaNumer() throws IOException {
        List<String> addresses = FileUtils.readLines(new File(resultFileName), StandardCharsets.UTF_8);
        SoftAssertions.assertSoftly(softly -> {
            for (String line : addresses) {
                softly.assertThat(line).matches("Paczkomat KRA[A-Z0-9]+ \\d{2}-\\d{3} Kraków\\t.+ \\d+[a-zA-Z]?\\t.*");
            }
        });
    }
}

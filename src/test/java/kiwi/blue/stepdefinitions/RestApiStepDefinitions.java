package kiwi.blue.stepdefinitions;

import io.cucumber.java.pl.Jeśli;
import io.cucumber.java.pl.Wtedy;
import io.cucumber.java.pl.Zakładającże;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class RestApiStepDefinitions {

    Response response;

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
}

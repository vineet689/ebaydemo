package com.actions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class BitcoinPriceSteps {

    private Response response;

    @Given("I send a GET request to {string}")
    public void i_send_a_get_request_to(String url) {
        response = given()
                      .when()
                      .get(url)
                      .then()
                      .extract()
                      .response();
    }

    @Then("The response should contain 3 BPIs: USD, GBP, EUR")
    public void the_response_should_contain_3_bpis_usd_gbp_eur() {
        // Validate that the response contains 3 BPIs
        Assert.assertTrue("USD BPI should be present", response.jsonPath().getMap("bpi.USD") != null);
        Assert.assertTrue("GBP BPI should be present", response.jsonPath().getMap("bpi.GBP") != null);
        Assert.assertTrue("EUR BPI should be present", response.jsonPath().getMap("bpi.EUR") != null);
    }

    @Then("The GBP description should be {string}")
    public void the_gbp_description_should_be(String description) {
        // Validate that the GBP description equals the expected value
        String actualDescription = response.jsonPath().getString("bpi.GBP.description");
        Assert.assertEquals("GBP description is not as expected", description, actualDescription);
    }
}

package stepDefinitions.apiStepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class US_028_API_StepDefinition {

    Response response;
    RequestSpecification spec;


    @Given("zll Kullanici set the Base Url")
    public void zll_kullanici_set_the_base_url() {
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("1","api","2","countries", "3", "{id}");
    }

    @Given("zll Send the GET request and get the response")
    public void zll_send_the_get_request_and_get_the_response() {

    }

    @Given("zll Set the expected data")
    public void zll_set_the_expected_data() {

    }

    @Then("zll Make validation")
    public void zll_make_validation() {

    }
}
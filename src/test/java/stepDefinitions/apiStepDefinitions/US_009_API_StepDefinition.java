package stepDefinitions.apiStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utilities.ConfigReader;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utilities.Authentication.generateToken;

public class US_009_API_StepDefinition {

    Response response;
    RequestSpecification spec;
    Map<String,Object> expectedData;

    @Given("Kullanici set the Base Url")
    public void kullanici_set_the_base_url() {
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("1","api","2","patients");

    }

    @Given("Send the GET request and get the response")
    public void send_the_get_request_and_get_the_response() {
        response = given().headers("Authorization", "Bearer " +generateToken("staffMahmut", "staffMahmut8"),
                        "Content-Type", ContentType.JSON, "Accept", ContentType.JSON).when().
                get(ConfigReader.getProperty("patients_endpoint"));


    }
    @Given("Set the expected data")
    public void set_the_expected_data() {

        expectedData=new HashMap<>();
        expectedData.put("firstName","hastaMahmut");
        expectedData.put("lastName","hastaMahmut");
        expectedData.put("email","hastamahmut@gmail.com");
        expectedData.put("bloodGroup","Apositive");


    }
    @Then("Make validation")
    public void make_validation() {
        Map<String, String> actualData=response.as(HashMap.class);
        System.out.println(actualData.toString());
        assertEquals(expectedData.get("firstName"),actualData.get("firstName"));
        assertEquals(expectedData.get("lastName"),actualData.get("lastName"));
        assertEquals(expectedData.get("email"),actualData.get("email"));

    }

}

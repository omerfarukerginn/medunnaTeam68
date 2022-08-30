package stepDefinitions.apiStepDefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;




import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import pojos.Appointment;

import java.net.MalformedURLException;
import java.net.URL;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;


public class US_010_API_StepDefination{

    Response response;
    Appointment actualAppointment;
    RequestSpecification spec;

    @When("Doctor set Medunna base url {string}")
    public void doctorSetMedunnaBaseUrl(String id) throws MalformedURLException {

        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("1", "api", "2", "appointments", "3", id); //hasta id


    }

    @And("Doctor send the GET request and GET the response")
    public void doctorSendTheGETRequestAndGETTheResponse() {

        response = given().spec(spec).header("Authorization", "Bearer " +
                        generateToken("doktorMahmut", "doktorMahmut8"))
                .contentType(ContentType.JSON)
                .when()
                .get("/{1}/{2}/{3}/");
        response.prettyPrint();
        response.then().statusCode(200);

    }

    @And("Doctor deserialize data json to java")
    public void doctorDeserializeDataJsonToJava() throws JsonProcessingException {
        ObjectMapper obj = new ObjectMapper();
        actualAppointment = obj.readValue(response.asString(), Appointment.class);
    }

    @And("Doctor saves the appointment data to correspondent files")
    public void doctorSavesTheAppointmentDataToCorrespondentFiles() {
        // saveAppointData(actualAppointment);
    }
    @Then("Doctor validates expected data with API {string}, {string},{string},{string}")
    public void doctorValidatesExpectedDataWithAPI(String patientId, String startDate, String endDate, String status) {
        System.out.println("Actual Data: " + actualAppointment);

        Assert.assertEquals(Integer.parseInt(patientId), actualAppointment.getPatient().getId()); // creat ettikten sonra post man de asagi tafar id
        Assert.assertEquals(startDate, actualAppointment.getStartDate());
        Assert.assertEquals(endDate, actualAppointment.getEndDate());
        Assert.assertEquals(status, actualAppointment.getStatus());
    }
}

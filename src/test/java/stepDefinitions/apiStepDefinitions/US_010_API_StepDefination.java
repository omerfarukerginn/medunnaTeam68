package stepDefinitions.apiStepDefinitions;

import baseUrl.MedunnaBaseUrl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.Appointment;

import java.util.List;

import static baseUrl.MedunnaBaseUrl.medunnaSetup;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;
import static utilities.Authentication.generateToken;


public class US_010_API_StepDefination {

    Response response;
    Appointment actualAppointment;
    RequestSpecification spec;

    @When("Doctor set Medunna base url {string}")
    public void doctorSetMedunnaBaseUrl(String id) {
        medunnaSetup();
        spec.pathParams("1", "api", "2", "appointments", "3", id); //hasta id


    }

    @And("Doctor send the GET request and GET the response")
    public void doctorSendTheGETRequestAndGETTheResponse() {

        response = given().spec(MedunnaBaseUrl.spec).header("Authorization", "Bearer " +
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

        Assert.assertEquals(patientId, actualAppointment.getPatient().getId()); // creat ettikten sonra post man de asagi tafar id
        Assert.assertEquals(startDate, actualAppointment.getStartDate());
        Assert.assertEquals(endDate, actualAppointment.getEndDate());
        Assert.assertEquals(status, actualAppointment.getStatus());

    }


}
/*
  public static void main(String[] args) throws JsonProcessingException {

        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();
        spec.pathParams("1", "api", "2", "appointments", "3", "160060"); //hasta id


        response = given().spec(MedunnaBaseUrl.spec).header("Authorization", "Bearer " +
                        generateToken("doktorMahmut", "doktorMahmut8"))
                .contentType(ContentType.JSON)
                .when()
                .get("/{1}/{2}/{3}/");
        response.prettyPrint();
        response.then().statusCode(200);


        ObjectMapper obj = new ObjectMapper();
        actualAppointment = obj.readValue(response.asString(), Appointment.class);


        System.out.println("Actual Data: " + actualAppointment);
        Assert.assertEquals(160153, actualAppointment.getPatient().getId());
        // creat ettikten sonra post man de asagi tafar id
        Assert.assertEquals("2022-08-05T00:00:00Z", actualAppointment.getStartDate());
        Assert.assertEquals("2022-08-05T01:00:00Z", actualAppointment.getEndDate());
        Assert.assertEquals("COMPLETED", actualAppointment.getStatus());
    }
 */
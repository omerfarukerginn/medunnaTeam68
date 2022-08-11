package stepDefinitions.apiStepDefinitions;

import baseUrl.MedunnaBaseUrl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.Appointment;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.util.List;

import static baseUrl.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;
import static utilities.ApiUtils.getRequest;
import static utilities.Authentication.generateToken;

public class US_010_API_StepDefination {

    static Appointment appointment = new Appointment();
    static Response response;
    static Appointment actualAppointment;

    public static void main(String[] args) throws JsonProcessingException {
        MedunnaBaseUrl.spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();
        MedunnaBaseUrl.spec.pathParams("1", "api", "2", "appointments");

        response = given().spec(MedunnaBaseUrl.spec).header("Authorization", "Bearer " +
                        generateToken("doktorMahmut", "doktorMahmut8"))
                .contentType(ContentType.JSON)
                .when()
                .get("/{1}/{2}/");
     //   response.prettyPrint();
        response.then().statusCode(200);
        ObjectMapper obj = new ObjectMapper();
        System.out.println("actualAppointment.getPatient().getId() = " + actualAppointment.getPatient().getId());
        actualAppointment = obj.readValue(response.asString(), Appointment.class);
        System.out.println("Actual Data: " + actualAppointment);
        Assert.assertEquals(167139, actualAppointment.getPatient().getId());
        Assert.assertEquals("2022-08-09T00:00:00Z", actualAppointment.getStartDate());
        Assert.assertEquals("2022-08-09T01:00:00Z", actualAppointment.getEndDate());
        Assert.assertEquals("PENDING", actualAppointment.getStatus());


    }








/*
  static Response response;
    static Appointment actualData;

    public static void main(String[] args) throws JsonProcessingException {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();
        //https://medunna.com//api/appointments/
        spec.pathParams("1", "api", "2", "appointments");

        String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJkb2t0b3JtYWhtdXQiLCJhdXRoIjoiUk9MRV9QSFlTSUNJQU4iLCJleHAiOjE2NjAyMzAyNTJ9." +
                "fkedHOb3KRBEYegs8un_jCQnkPY1eq3A7uOpHvPI1Q8Irqu7GQdK4txJlhhJKBT9VVv04FIFPRT8vqxlrw0Y-g";

        response = given().spec(spec).header("Authorization", "Bearer " +
                        generateToken("doktorMahmut","doktorMahmut8"))
                .contentType(ContentType.JSON).when().get("/{1}/{2}/");
     response.prettyPrint();

        response.then().assertThat().statusCode(200);

        JsonPath jsonPath=response.jsonPath();

        List<Integer> appointmentId = jsonPath.getList("id");

        System.out.println("Number of appointments : " +appointmentId.size());



        assertTrue(appointmentId.contains(3314));


        //ObjectMapper obj = new ObjectMapper();
       //Appointment [] actualData = obj.readValue(response.asString(), Appointment[].class);



        }
        /*
    Response response;
    Appointment appointmentPojo;
    String token;
    String endPoint=ConfigReader.getProperty("US_010_appointmentsListApi");
    static Appointment actualData;

    @When("Doctor set Medunna base url")
    public void doctorSetMedunnaBaseUrl() {


    }


    @And("Doctor send the GET request and GET the response")
    public void doctorSendTheGETRequestAndGETTheResponse() {
        token=generateToken();
        response=getRequest(token,endPoint);

        response.then().assertThat().statusCode(200);

    }

    @And("Doctor deserialize data json to java")
    public void doctorDeserializeDataJsonToJava() throws JsonProcessingException {
        JsonPath jsonPath=response.jsonPath();
    }

    @And("Doctor saves the appointment data to correspondent files")
    public void doctorSavesTheAppointmentDataToCorrespondentFiles() {

    }


    @Then("Doctor validates expected data with API {string}, {string},{string},{string}")
    public void doctorValidatesExpectedDataWithAPI(String patientId, String startDate, String endDate, String status) {
        Assert.assertEquals(patientId, actualData.getId());
        Assert.assertEquals(startDate, actualData.getStartDate());
        Assert.assertEquals(endDate, actualData.getEndDate());
        Assert.assertEquals(status, actualData.getStatus());

    }*/
}

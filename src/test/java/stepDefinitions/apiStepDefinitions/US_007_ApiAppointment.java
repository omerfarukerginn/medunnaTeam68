package stepDefinitions.apiStepDefinitions;


import baseUrl.MedunnaBaseUrl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.Appointment;
import pojos.AppointmentRequest;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;
import static utilities.WriteToTxt.saveAppointData;

public class US_007_ApiAppointment {
/*
    {
  "appoSpeciality": "string",
  "birthDate": "2022-08-10T10:15:51.167Z",
  "email": "string",
  "firstName": "string",
  "gender": "string",
  "lastName": "string",
  "phone": "string",
  "snumber": "string",
  "ssn": "string",
  "startDate": "2022-08-10"
} */

    static Faker faker = new Faker();
    AppointmentRequest appointmentRequest = new AppointmentRequest();
    Response response;
    Appointment appointment;
    RequestSpecification spec;

    @Given("Eb user set path params")
    public void eb_user_set_path_params() {

        ///api/appointments/request
        //api/appointments/request
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParams("1","api", "2", "appointments", "3", "request");

    }

    @Given("Eb user enter expected data FirstName LastName SSN Email Phone Date") //appointmentRequest hasta create ediyorum
    public void eb_user_enter_expected_data_first_name_last_name_ssn_email_phone_date() {

        //String appoSpecialitySetData = "Bilmiyorum";
        String birthDateSetData = "2022-04-16T12:52:30.875Z";
        String emailSetData = "ina.greenfelder@gmail.com";
        String firstName = "Andrea";
        String gender = "male";
        String lastName = "Raynor";;
        String phone = "05678995678";
        //String snumber = "123456";
        String ssn = "239-19-9883";;
        String startDate = "2023-01-07T00:00:00Z";

        appointmentRequest.setFirstName(firstName);
        appointmentRequest.setLastName(lastName);
        appointmentRequest.setAppoSpeciality("string");
        appointmentRequest.setSsn(ssn);
        appointmentRequest.setEmail(emailSetData);
        appointmentRequest.setPhone(phone);
        appointmentRequest.setStartDate(startDate);
       // appointmentRequest.setAppoSpeciality("string");
        appointmentRequest.setBirthDate(birthDateSetData);
        appointmentRequest.setGender(gender);
        appointmentRequest.setSnumber("string");


    }

    @Given("Eb user send request and get response")
    public void eb_user_send_request_and_get_response() {
        spec.pathParams("1","api", "2", "appointments", "3", "request");
        response = given().headers(
                        "Authorization",
                        "Bearer " + generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON)
                .spec(spec)
                .body(appointmentRequest).when().post("/{1}/{2}/{3}");
        response.prettyPrint();
        // response.then().statusCode(201);

    }

    @Then("Eb user save api data to file")
    public void eb_user_save_api_data_to_file() {

        //save appoinment

    }

    @Then("Eb user verify  api data")
    public void eb_user_verify_api_data() throws JsonProcessingException {



        ObjectMapper obj = new ObjectMapper();
        //bunu import ettigimiz yer ile POJO classinda @JasonIgnore nereden
        //import edildi ise oradan almak gerekir.


        appointment = obj.readValue(response.asString(), Appointment.class);

        Assert.assertEquals(appointmentRequest.getFirstName(), appointment.getPatient().getFirstName());
        Assert.assertEquals(appointmentRequest.getLastName(), appointment.getPatient().getLastName());
        Assert.assertEquals(appointmentRequest.getEmail(), appointment.getPatient().getEmail());
        Assert.assertEquals(appointmentRequest.getPhone(), appointment.getPatient().getPhone());
        Assert.assertEquals(appointmentRequest.getStartDate(), appointment.getStartDate());
    }


}




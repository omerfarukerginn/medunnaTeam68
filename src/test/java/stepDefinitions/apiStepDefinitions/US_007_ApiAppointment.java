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

import static baseUrl.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;

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
    static AppointmentRequest appointmentRequest = new AppointmentRequest();
    static Response response;
    static Appointment appointment;

    public static void main(String[] args) throws JsonProcessingException {

        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("base_url")).build();
        spec.pathParams("1", "api", "2", "appointments", "3", "request");

        ///api/appointments/request
        String appoSpecialitySetData = "string";
        String birthDateSetData = "2022-04-16T12:52:30.875Z";
        String emailSetData = faker.internet().emailAddress();
        String firstName = "Nail";
        String gender = "male";
        String lastName = "Kocaman";
        String phone = "857-265-8343";
        String snumber = "string";
        String ssn = faker.idNumber().ssnValid();
        String startDate = "2023-01-07T00:00:00Z";

        appointmentRequest.setAppoSpeciality(appoSpecialitySetData);
        appointmentRequest.setBirthDate(birthDateSetData);
        appointmentRequest.setEmail(emailSetData);
        appointmentRequest.setFirstName(firstName);
        appointmentRequest.setGender(gender);
        appointmentRequest.setLastName(lastName);
        appointmentRequest.setPhone(phone);
        appointmentRequest.setSnumber(snumber);
        appointmentRequest.setSsn(ssn);
        appointmentRequest.setStartDate(startDate);


        response = given().spec(spec).contentType(ContentType.JSON)
                .body(appointmentRequest).when().post("/{1}/{2}/{3}");
        // response.prettyPrint();

        ObjectMapper obj=new ObjectMapper();
        //bunu import ettigimiz yer ile POJO classinda @JasonIgnore nereden
        //import edildi ise oradan almak gerekir.

        appointment=obj.readValue(response.asString(), Appointment.class);

        Assert.assertEquals(appointmentRequest.getFirstName(),appointment.getPatient().getFirstName());
        Assert.assertEquals(appointmentRequest.getLastName(), appointment.getPatient().getLastName());
        Assert.assertEquals(appointmentRequest.getEmail(),appointment.getPatient().getEmail());
        Assert.assertEquals(appointmentRequest.getPhone(), appointment.getPatient().getPhone());
        Assert.assertEquals(appointmentRequest.getStartDate(), appointment.getStartDate());



         /*
        response = given().headers(
                        "Authorization",
                        "Bearer " + generateToken(),
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON).body(appointmentRequest).
                when().post(ConfigReader.getProperty("us_007_post_appointment_api"));

         */
    }

    @Given("Eb user set path params")
    public void eb_user_set_path_params() {
        spec.pathParams("first", "api", "second", "appointments", "third", "request");

    }

    @Given("Eb user enter expected data FirstName LastName SSN Email Phone Date")
    public void eb_user_enter_expected_data_first_name_last_name_ssn_email_phone_date() {

        String appoSpecialitySetData = "Bilmiyorum";
        String birthDateSetData = "2000-08-10";
        String emailSetData = "aliAta99@gmail.com";
        String firstName = "Nail";
        String gender = "male";
        String lastName = "Kocaman";
        String phone = "05678995678";
        String snumber = "123456";
        String ssn = "134-56-8799";
        String startDate = "2022-08-10";

        appointmentRequest.setAppoSpeciality(appoSpecialitySetData);
        appointmentRequest.setBirthDate(birthDateSetData);
        appointmentRequest.setEmail(emailSetData);
        appointmentRequest.setFirstName(firstName);
        appointmentRequest.setGender(gender);
        appointmentRequest.setLastName(lastName);
        appointmentRequest.setPhone(phone);
        appointmentRequest.setSnumber(snumber);
        appointmentRequest.setSsn(ssn);
        appointmentRequest.setStartDate(startDate);

    }

    @Given("Eb user send request and get response")
    public void eb_user_send_request_and_get_response() {
        response = given().spec(spec).contentType(ContentType.JSON)
                .body(appointmentRequest).when().post("/{first}/{second}/{third}");
        response.prettyPrint();
        response.then().statusCode(201);
    }

    @Then("Eb user save api data to file")
    public void eb_user_save_api_data_to_file() {

    }

    @Then("Eb user verify  api data")
    public void eb_user_verify_api_data() {

    }

}

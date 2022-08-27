package stepDefinitions.apiStepDefinitions;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import pojos.Physician;
import pojos.Staff;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US_018_API_StepDefinition {

     RequestSpecification spec;
    //static Staff expectedStaff;
     Response response;
    //static Staff actualStaff;
     Physician actualPhysician;
    @Given("Admin set Medunna base url {string}")
    public void admin_set_medunna_base_url(String id) {
        spec = new RequestSpecBuilder().
                setBaseUri("https://medunna.com").
                //setBaseUri(ConfigReader.getProperty("medunna_url")).
                        build();

        spec.pathParams("1","api","2","physicians","3",id);
    }
    @Given("Admin send the GET request and GET the response")
    public void admin_send_the_get_request_and_get_the_response() {
        response=given() .spec(spec)
                .header("Authorization","Bearer "+generateToken("team68","HealthTeam68!"))
                .contentType(ContentType.JSON)
                .when().get("/{1}/{2}/{3}/");

        response.prettyPrint();
        response.then().statusCode(200);
    }
    @Given("Admin deserialize data json to java")
    public void admin_deserialize_data_json_to_java() {
        ObjectMapper obj=new ObjectMapper();
        //actualPhysician=obj.readValue(response.asString(),Physician.class);

    }
    @Given("Admin saves the physicians data to correspondent files")
    public void admin_saves_the_physicians_data_to_correspondent_files() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Admin validates expected data with API {string}, {string},{string},{string}")
    public void admin_validates_expected_data_with_apı(String createdBy, String phone, String gender, String bloodGroup) {
        System.out.println(actualPhysician);

        Assert.assertEquals(createdBy,actualPhysician.getCreatedBy());
        Assert.assertEquals(gender,actualPhysician.getGender());
        Assert.assertEquals(bloodGroup,actualPhysician.getBloodGroup());
        Assert.assertEquals(phone,actualPhysician.getPhone());
    }


    //public static void main(String[] args) throws JsonProcessingException {

   //    spec = new RequestSpecBuilder().
   //            setBaseUri("https://medunna.com").
   //            //setBaseUri(ConfigReader.getProperty("medunna_url")).
   //            build();

   //    spec.pathParams("1","api","2","physicians","3",10511);



   //   // expectedPhysician=new Physician("kamil","selm","male","12.12.1989","5346787890",
   //   //         "B+","sarnic turkey","kamilselm@gmail.com",
   //   //         "degistirme");
   //    //10522


   //    response=given() .spec(spec)
   //            .header("Authorization","Bearer "+generateToken("team68","HealthTeam68!"))
   //            .contentType(ContentType.JSON)
   //            .when().get("/{1}/{2}/{3}/");

   //    response.prettyPrint();
   //    response.then().statusCode(200);


   //    ObjectMapper obj=new ObjectMapper();
   //    actualPhysician=obj.readValue(response.asString(),Physician.class);

   //    System.out.println(actualPhysician);

   //   //Assert.assertEquals(createdBy,actualPhysician.getCreatedBy());
   //   //   Assert.assertEquals(gender,actualPhysician.getGender());
   //   //  Assert.assertEquals(bloodGroup,actualPhysician.getBloodGroup());
   //   // Assert.assertEquals(phone,actualPhysician.getPhone());

   //}




}
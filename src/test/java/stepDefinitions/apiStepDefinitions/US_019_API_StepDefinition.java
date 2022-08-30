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
import pojos.Staff;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class US_019_API_StepDefinition {

    static RequestSpecification specMed;
    static Staff expectedStaff=new Staff();
    static Response response;
    static Staff actualStaff;

    public static void main(String[] args) throws JsonProcessingException {





    /* expectedStaff=new Staff("kamil","selm","male","12.12.1989","5346787890",
            "B+","sarnic turkey","kamilselm@gmail.com",
            "degistirme");*/





          //  Assert.assertEquals(expectedStaff.getFirstName(),actualStaff.getFirstName());
            //Assert.assertEquals(expectedStaff.getLastName(),actualStaff.getLastName());
            //Assert.assertEquals(expectedStaff.getGender(),actualStaff.getGender());

    }



    @Given("Api Staff set path params for test items")
    public void apiStaffSetPathParamsForTestItems() {

        specMed = new RequestSpecBuilder(). setBaseUri("https://medunna.com")
                // setBaseUri(ConfigReader.getProperty("medunna_url"))
                .build();

        specMed.pathParams("1","api","2","staff","3","245983");

    }

    @And("Api Staff enters expected data for test items")
    public void apiStaffEntersExpectedDataForTestItems() {

        /*   "createdBy": "team52",
        "createdDate": "2022-08-30T10:56:29.395725Z",
        "id": 245983,
        "firstName": "firstname52",
        "lastName": "lastname52",
        "birthDate": "2001-02-01T01:04:00Z",
        "phone": "555-001-5555",
        "gender": "FEMALE",
        "bloodGroup": "Apositive",
        "adress": "ayyildiz1",
        "description": "aciklama1",
*/

        expectedStaff.setFirstName("firstname52");
        expectedStaff.setDescription("aciklama1");
        expectedStaff.setLastName("lastname52");
    }

    @And("Api Staff sends request and get response for test items")
    public void apiStaffSendsRequestAndGetResponseForTestItems() {
        response=given() .contentType(ContentType.JSON)
                .spec(specMed)
                .header("Authorization","Bearer "+generateToken("team68","HealthTeam68!"))
                .when().get("/{1}/{2}/{3}");

        response.prettyPrint();
        response.then().statusCode(200);


    }

    @And("Api Staff save all API information for test items")
    public void apiStaffSaveAllAPIInformationForTestItems() {


    }

    @And("Api Staff verify API for test items")
    public void apiStaffVerifyAPIForTestItems() throws JsonProcessingException {
        ObjectMapper obj=new ObjectMapper();
        Staff actualStaff=obj.readValue(response.asString(),Staff.class);

        System.out.println(actualStaff);

        Assert.assertEquals(expectedStaff.getFirstName(),actualStaff.getFirstName());
        Assert.assertEquals(expectedStaff.getLastName(),actualStaff.getLastName());
        Assert.assertEquals(expectedStaff.getDescription(),actualStaff.getDescription());


    }
}



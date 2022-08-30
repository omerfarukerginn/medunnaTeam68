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

        specMed.pathParams("1","api","2","staff","3","212093");

    }

    @And("Api Staff enters expected data for test items")
    public void apiStaffEntersExpectedDataForTestItems() {

        /*  "createdBy": "dzkkaya",
                "createdDate": "2022-08-21T21:01:03.198901Z",
                "id": 212093,
                "firstName": "enes",
                "lastName": "umit",
                "birthDate": "2022-08-21T21:00:00Z",
                "phone": "1256548562",
                "gender": "MALE",
                "bloodGroup": "Opositive",
                "adress": "halil ibrahim sok. no:2/10",
                "description": "staff",
*/

        expectedStaff.setFirstName("enes");
        expectedStaff.setDescription("staff");
        expectedStaff.setLastName("umit");
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



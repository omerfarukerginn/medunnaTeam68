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
    static Staff expectedStaff;
    static Response response;
    static Staff actualStaff;

    public static void main(String[] args) throws JsonProcessingException {

        specMed = new RequestSpecBuilder(). setBaseUri("https://medunna.com")
               // setBaseUri(ConfigReader.getProperty("medunna_url"))
                .build();

        specMed.pathParams("1","api","2","staff","3","211236");



    expectedStaff=new Staff("kamil","selm","male","12.12.1989","5346787890",
            "B+","sarnic turkey","kamilselm@gmail.com",
            "degistirme");


        response=given() .contentType(ContentType.JSON)
                .spec(specMed)
                .header("Authorization","Bearer "+generateToken("team68","HealthTeam68!"))
               .when().get("/{1}/{2}/{3}");

        response.prettyPrint();
      //  response.then().statusCode(200);


        ObjectMapper obj=new ObjectMapper();
        Staff actualStaff=obj.readValue(response.asString(),Staff.class);

        System.out.println(actualStaff);

         //    Assert.assertEquals(expectedStaff.getFirstName(),actualData.getFirstName());

        //  Assert.assertEquals(expectedStaff.getLastName(),actualData.getData().getLastName());

        // Assert.assertEquals(expectedStaff.getGender(),actualData.getData().getGender());

    }



    @Given("Api Personel icin beklenen verileri girin")
    public void apiPersonelIcinBeklenenVerileriGirin() throws JsonProcessingException {



    }

    @Then("Api istegi sonlandirir ve kayit icin yanit alir")
    public void apiIstegiSonlandirirVeKayitIcinYanitAlir() {


    }


    @And("Api, kayit icin API kayitlarini dogrular")
    public void apiKayitIcinAPIKayitlariniDogrular() {



    }
}


